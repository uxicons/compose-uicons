package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RazorBarber: ImageVector? = null

val Icons.Ss.RazorBarber: ImageVector
    get() = _RazorBarber ?: UXIcon(name = "RazorBarber") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(4.4f, 2f)
                curveTo(2.38f, 2f, 0.68f, 3.51f, 0.43f, 5.51f)
                lineToRelative(-0.43f, 2.49f)
                horizontalLineToRelative(11.75f)
                curveToRelative(2.03f, 0f, 3.74f, -1.52f, 3.97f, -3.54f)
                lineToRelative(0.17f, -0.46f)
                horizontalLineToRelative(2.09f)
                curveToRelative(-0.2f, 3.7f, -2.63f, 9.67f, -6.97f, 14.04f)
                curveToRelative(-1.35f, 1.37f, -1.34f, 3.59f, 0.03f, 4.95f)
                curveToRelative(0.68f, 0.67f, 1.57f, 1.01f, 2.46f, 1.01f)
                curveToRelative(0.9f, 0f, 1.81f, -0.35f, 2.49f, -1.04f)
                curveToRelative(5.71f, -5.78f, 5.58f, -17.36f, 5.52f, -19.26f)
                curveToRelative(1.46f, -0.6f, 2.49f, -2.03f, 2.49f, -3.7f)
                close()
                moveTo(13.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _RazorBarber = it}
