const configuredHost = (import.meta.env.VITE_APP_APIGATEWAY_BACKEND_HOST || '').trim()

function resolveHttpBaseURL (): string {
  // If a host is configured, use it; otherwise, in dev fall back to same-origin to leverage Vite proxy
  if (configuredHost) return configuredHost
  return '/'
}

function resolvePilotApiHost (): string {
  // For pilot/native application, we need an absolute URL (relative URLs cause IllegalArgumentException in Java URL)
  if (configuredHost) return configuredHost
  // Construct absolute URL from current window location
  const loc = window.location
  return `${loc.protocol}//${loc.host}`
}

function resolveWebsocketURL (): string {
  if (configuredHost) {
    // Normalize to ws(s) scheme based on configuredHost scheme
    try {
      const u = new URL(configuredHost)
      const wsScheme = u.protocol === 'https:' ? 'wss' : 'ws'
      return `${wsScheme}://${u.host}/api/v1/ws`
    } catch (e) {
      // If configuredHost isn't a full URL, assume http and default to ws
      return `ws://${configuredHost.replace(/^\/*/, '')}/api/v1/ws`
    }
  }
  // Default: same-origin websocket
  const loc = window.location
  const wsScheme = loc.protocol === 'https:' ? 'wss' : 'ws'
  return `${wsScheme}://${loc.host}/api/v1/ws`
}

console.log('APP ID: ' + import.meta.env.VITE_DJI_CLOUD_API_APP_ID)

export const CURRENT_CONFIG = {

  // license
  appId: `${import.meta.env.VITE_DJI_CLOUD_API_APP_ID}`, // You need to go to the development website to apply.
  appKey: `${import.meta.env.VITE_DJI_CLOUD_API_APP_KEY}`, // You need to go to the development website to apply.
  appLicense: `${import.meta.env.VITE_DJI_CLOUD_API_APP_LICENSE}`, // You need to go to the development website to apply.

  // http
  baseURL: resolveHttpBaseURL(), // Prefer same-origin in dev to avoid CORS (use Vite proxy)
  pilotApiHost: resolvePilotApiHost(), // Absolute URL for pilot/native module (required for Java URL constructor)
  websocketURL: resolveWebsocketURL(), // WebSocket URL aligned with http base

  // livestreaming
  // RTMP  Note: This IP is the address of the streaming server. If you want to see livestream on web page, you need to convert the RTMP stream to WebRTC stream.
  rtmpURL: 'Please enter the rtmp access address.', // Example: 'rtmp://192.168.1.1/live/'
  // GB28181 Note:If you don't know what these parameters mean, you can go to Pilot2 and select the GB28181 page in the cloud platform. Where the parameters same as these parameters.
  gbServerIp: 'Please enter the server ip.',
  gbServerPort: 'Please enter the server port.',
  gbServerId: 'Please enter the server id.',
  gbAgentId: 'Please enter the agent id',
  gbPassword: 'Please enter the agent password',
  gbAgentPort: 'Please enter the local port.',
  gbAgentChannel: 'Please enter the channel.',
  // RTSP
  rtspUserName: 'Please enter the username.',
  rtspPassword: 'Please enter the password.',
  rtspPort: '8554',
  // Agora
  agoraAPPID: 'Please enter the agora app id.',
  agoraToken: 'Please enter the agora temporary token.',
  agoraChannel: 'Please enter the agora channel.',

  // map
  // You can apply on the AMap website.
  amapKey: 'Please enter the amap key.',

}
