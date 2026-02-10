package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampStreet: ImageVector? = null

val Icons.Br.LampStreet: ImageVector
    get() = _LampStreet ?: UXIcon(name = "LampStreet") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.89f, 13.26f)
            curveToRelative(-0.9f, -3.25f, -3.69f, -5.63f, -7.01f, -6.16f)
            curveTo(16.22f, 3.08f, 12.71f, 0f, 8.5f, 0f)
            curveTo(3.81f, 0f, 0f, 3.81f, 0f, 8.5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-14f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            curveToRelative(2.57f, 0f, 4.73f, 1.77f, 5.33f, 4.16f)
            curveToRelative(-3.2f, 0.61f, -5.85f, 2.95f, -6.73f, 6.11f)
            curveToRelative(-0.24f, 0.87f, -0.06f, 1.79f, 0.49f, 2.52f)
            curveToRelative(0.58f, 0.76f, 1.5f, 1.21f, 2.46f, 1.21f)
            horizontalLineToRelative(2.94f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(2.94f)
            curveToRelative(0.96f, 0f, 1.88f, -0.45f, 2.46f, -1.21f)
            curveToRelative(0.56f, -0.73f, 0.73f, -1.65f, 0.49f, -2.52f)
            close()
            moveTo(20.95f, 14f)
            lineToRelative(-10.95f, 0.07f)
            curveToRelative(0.67f, -2.4f, 2.93f, -4.07f, 5.5f, -4.07f)
            reflectiveCurveToRelative(4.84f, 1.67f, 5.51f, 3.97f)
            curveToRelative(0f, 0f, -0.02f, 0.03f, -0.07f, 0.03f)
            close()
        }
    }.also { _LampStreet = it }
