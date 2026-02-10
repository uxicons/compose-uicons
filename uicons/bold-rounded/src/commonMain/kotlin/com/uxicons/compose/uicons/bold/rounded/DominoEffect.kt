package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DominoEffect: ImageVector? = null

val Icons.Br.DominoEffect: ImageVector
    get() = _DominoEffect ?: UXIcon(name = "DominoEffect") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7.58f, 11.5f)
            lineToRelative(-1.48f, 4.42f)
            curveToRelative(-0.61f, 1.84f, -2.33f, 3.08f, -4.27f, 3.08f)
            horizontalLineToRelative(-0.34f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(0.34f)
            curveToRelative(0.65f, 0f, 1.22f, -0.41f, 1.42f, -1.02f)
            lineToRelative(1.16f, -3.48f)
            lineTo(0f, 11.5f)
            verticalLineToRelative(-3f)
            lineToRelative(2.73f, -3.94f)
            curveToRelative(0.55f, -0.66f, 1.54f, -0.75f, 2.2f, -0.2f)
            curveToRelative(0.66f, 0.55f, 0.75f, 1.54f, 0.2f, 2.2f)
            lineToRelative(-1.48f, 1.93f)
            lineToRelative(6.84f, -0.0f)
            curveToRelative(0.91f, 0f, 1.63f, 0.8f, 1.48f, 1.74f)
            curveToRelative(-0.12f, 0.74f, -0.81f, 1.27f, -1.56f, 1.27f)
            horizontalLineToRelative(-2.84f)
            close()
            moveTo(22.5f, 4f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(18.5f, 4f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(20f, 5.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(15.64f, 4.08f)
            curveToRelative(-0.79f, -0.26f, -1.64f, 0.16f, -1.9f, 0.95f)
            lineToRelative(-4.33f, 13f)
            curveToRelative(-0.26f, 0.79f, 0.16f, 1.64f, 0.95f, 1.9f)
            curveToRelative(0.16f, 0.05f, 0.32f, 0.08f, 0.47f, 0.08f)
            curveToRelative(0.63f, 0f, 1.21f, -0.4f, 1.42f, -1.02f)
            lineToRelative(4.33f, -13f)
            curveToRelative(0.26f, -0.79f, -0.16f, -1.64f, -0.95f, -1.9f)
            close()
        }
    }.also { _DominoEffect = it }
