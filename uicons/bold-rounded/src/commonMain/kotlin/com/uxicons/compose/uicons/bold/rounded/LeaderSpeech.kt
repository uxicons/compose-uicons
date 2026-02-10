package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderSpeech: ImageVector? = null

val Icons.Br.LeaderSpeech: ImageVector
    get() = _LeaderSpeech ?: UXIcon(name = "LeaderSpeech") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11.5f, 3f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            close()
            moveTo(24f, 17.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3.5f)
            lineTo(5f, 19f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(-3.09f)
            curveToRelative(0f, -0.67f, 0.26f, -1.29f, 0.73f, -1.77f)
            lineToRelative(1.28f, -1.28f)
            curveToRelative(0.07f, -1.04f, 0.93f, -1.86f, 1.99f, -1.86f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            curveToRelative(0f, 1.06f, -0.82f, 1.92f, -1.86f, 1.99f)
            lineToRelative(-1.14f, 1.14f)
            verticalLineToRelative(2.88f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-6.96f)
            lineTo(5.35f, 3.46f)
            curveToRelative(-0.53f, -0.64f, -0.44f, -1.58f, 0.19f, -2.11f)
            curveToRelative(0.64f, -0.53f, 1.58f, -0.44f, 2.11f, 0.19f)
            lineToRelative(4.55f, 5.46f)
            horizontalLineToRelative(4.59f)
            lineToRelative(4.55f, -5.46f)
            curveToRelative(0.53f, -0.64f, 1.48f, -0.72f, 2.11f, -0.19f)
            curveToRelative(0.64f, 0.53f, 0.72f, 1.48f, 0.19f, 2.11f)
            lineToRelative(-4.65f, 5.58f)
            verticalLineToRelative(6.96f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(13f, 16f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(6f)
            close()
        }
    }.also { _LeaderSpeech = it }
