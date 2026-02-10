package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoiceCommand: ImageVector? = null

val Icons.Br.VoiceCommand: ImageVector
    get() = _VoiceCommand ?: UXIcon(name = "VoiceCommand") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(5f, 12f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -3.65f, 2.74f, -6.64f, 6.37f, -6.97f)
            curveToRelative(0.82f, -0.07f, 1.55f, 0.53f, 1.63f, 1.36f)
            reflectiveCurveToRelative(-0.53f, 1.55f, -1.36f, 1.63f)
            curveToRelative(-2.07f, 0.19f, -3.63f, 1.9f, -3.63f, 3.98f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            curveToRelative(2.08f, 0f, 3.8f, -1.56f, 3.98f, -3.63f)
            curveToRelative(0.07f, -0.82f, 0.82f, -1.43f, 1.63f, -1.36f)
            curveToRelative(0.82f, 0.07f, 1.43f, 0.8f, 1.36f, 1.63f)
            curveToRelative(-0.33f, 3.63f, -3.32f, 6.37f, -6.97f, 6.37f)
            curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
            close()
            moveTo(22.5f, 11f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 4.69f, -3.81f, 8.5f, -8.5f, 8.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-4.69f, 0f, -8.5f, -3.81f, -8.5f, -8.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 6.34f, 5.16f, 11.5f, 11.5f, 11.5f)
            horizontalLineToRelative(1f)
            curveToRelative(6.34f, 0f, 11.5f, -5.16f, 11.5f, -11.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(16.5f, 3f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(16.06f, 7.94f)
            curveToRelative(0.19f, 0.62f, 0.76f, 1.06f, 1.44f, 1.06f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.68f, 0.45f, 1.25f, 1.06f, 1.44f)
            close()
        }
    }.also { _VoiceCommand = it }
