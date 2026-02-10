package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RazorBarber: ImageVector? = null

val Icons.Sr.RazorBarber: ImageVector
    get() = _RazorBarber ?: UXIcon(name = "RazorBarber") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.33f, 0.06f)
                curveToRelative(-0.52f, -0.19f, -1.09f, 0.09f, -1.28f, 0.61f)
                curveToRelative(-0.28f, 0.8f, -1.04f, 1.33f, -1.89f, 1.33f)
                horizontalLineToRelative(-5.16f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                lineTo(3.99f, 2f)
                curveTo(2.0f, 2f, 0.34f, 3.43f, 0.04f, 5.39f)
                curveToRelative(-0.1f, 0.65f, 0.09f, 1.32f, 0.52f, 1.82f)
                reflectiveCurveToRelative(1.06f, 0.79f, 1.72f, 0.79f)
                horizontalLineToRelative(9.55f)
                curveToRelative(1.98f, 0f, 3.68f, -1.47f, 3.96f, -3.43f)
                lineToRelative(0.08f, -0.57f)
                horizontalLineToRelative(2.11f)
                curveToRelative(-0.2f, 3.7f, -2.63f, 9.67f, -6.97f, 14.04f)
                curveToRelative(-1.35f, 1.37f, -1.34f, 3.59f, 0.03f, 4.95f)
                curveToRelative(0.68f, 0.67f, 1.57f, 1.01f, 2.46f, 1.01f)
                curveToRelative(0.9f, 0f, 1.81f, -0.35f, 2.49f, -1.04f)
                curveToRelative(5.65f, -5.73f, 5.58f, -17.14f, 5.52f, -19.2f)
                curveToRelative(1.11f, -0.4f, 2.02f, -1.27f, 2.43f, -2.43f)
                curveToRelative(0.18f, -0.52f, -0.09f, -1.09f, -0.61f, -1.28f)
                close()
                moveTo(13.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _RazorBarber = it}
