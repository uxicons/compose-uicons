package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Branding: ImageVector? = null

val Icons.Br.Branding: ImageVector
    get() = _Branding ?: UXIcon(name = "Branding") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 7.93f)
            verticalLineToRelative(11.57f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-11.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(4.59f)
            curveToRelative(1.46f, 0f, 2.88f, 0.59f, 3.9f, 1.63f)
            lineToRelative(2.41f, 2.43f)
            curveToRelative(1.03f, 1.04f, 1.6f, 2.41f, 1.6f, 3.87f)
            close()
            moveTo(2f, 0f)
            curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
            verticalLineToRelative(10.22f)
            curveToRelative(0f, 1.14f, 0.45f, 2.23f, 1.26f, 3.04f)
            lineToRelative(0.74f, 0.74f)
            lineToRelative(0.74f, -0.74f)
            curveToRelative(0.81f, -0.81f, 1.26f, -1.9f, 1.26f, -3.04f)
            lineTo(4f, 2f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            close()
            moveTo(14.47f, 19.97f)
            curveToRelative(-0.68f, 0.68f, -1.58f, 1.02f, -2.48f, 1.02f)
            reflectiveCurveToRelative(-1.79f, -0.34f, -2.48f, -1.02f)
            curveToRelative(0f, 0f, -4.49f, -4.47f, -4.53f, -4.45f)
            verticalLineToRelative(5.48f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            verticalLineToRelative(-5.48f)
            curveToRelative(-0.04f, -0.01f, -4.53f, 4.45f, -4.53f, 4.45f)
            close()
            moveTo(12.35f, 17.85f)
            lineToRelative(4.66f, -4.66f)
            curveToRelative(-0.32f, -0.12f, -0.66f, -0.19f, -1.01f, -0.19f)
            horizontalLineToRelative(-8f)
            curveToRelative(-0.36f, 0f, -0.7f, 0.07f, -1.01f, 0.19f)
            lineToRelative(4.66f, 4.66f)
            curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
            close()
        }
    }.also { _Branding = it }
