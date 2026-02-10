package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoiceNote: ImageVector? = null

val Icons.Br.VoiceNote: ImageVector
    get() = _VoiceNote ?: UXIcon(name = "VoiceNote") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14f, 10f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            close()
            moveTo(8.71f, 5.34f)
            curveToRelative(-0.64f, -0.53f, -1.58f, -0.44f, -2.11f, 0.2f)
            curveToRelative(-2.13f, 2.58f, -2.13f, 6.33f, 0f, 8.91f)
            curveToRelative(0.53f, 0.64f, 1.48f, 0.73f, 2.11f, 0.2f)
            curveToRelative(0.64f, -0.53f, 0.73f, -1.47f, 0.2f, -2.11f)
            curveToRelative(-1.22f, -1.47f, -1.22f, -3.61f, 0f, -5.09f)
            curveToRelative(0.53f, -0.64f, 0.44f, -1.58f, -0.2f, -2.11f)
            close()
            moveTo(15.29f, 5.34f)
            curveToRelative(-0.64f, 0.53f, -0.73f, 1.47f, -0.2f, 2.11f)
            curveToRelative(1.22f, 1.47f, 1.22f, 3.61f, 0f, 5.09f)
            curveToRelative(-0.53f, 0.64f, -0.44f, 1.58f, 0.2f, 2.11f)
            curveToRelative(0.64f, 0.53f, 1.58f, 0.44f, 2.11f, -0.2f)
            curveToRelative(2.13f, -2.58f, 2.13f, -6.33f, 0f, -8.91f)
            curveToRelative(-0.53f, -0.64f, -1.47f, -0.73f, -2.11f, -0.2f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-1.11f)
            lineToRelative(-3.72f, 3.36f)
            curveToRelative(-0.48f, 0.43f, -1.08f, 0.64f, -1.67f, 0.64f)
            reflectiveCurveToRelative(-1.19f, -0.21f, -1.66f, -0.63f)
            lineToRelative(-3.77f, -3.37f)
            horizontalLineToRelative(-1.07f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-9f)
            curveToRelative(-0.0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(1.64f)
            curveToRelative(0.37f, 0f, 0.72f, 0.14f, 1.0f, 0.38f)
            lineToRelative(3.86f, 3.45f)
            lineToRelative(3.81f, -3.44f)
            curveToRelative(0.28f, -0.25f, 0.63f, -0.39f, 1.0f, -0.39f)
            horizontalLineToRelative(1.69f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _VoiceNote = it }
