package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Segway: ImageVector? = null

val Icons.Sr.Segway: ImageVector
    get() = _Segway ?: UXIcon(name = "Segway") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.66f, 14.03f)
                curveToRelative(-0.98f, 0.16f, -1.66f, 1.08f, -1.66f, 2.08f)
                verticalLineToRelative(1.89f)
                reflectiveCurveToRelative(-4f, 0f, -4f, 0f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-8.5f)
                lineToRelative(3.14f, -5.5f)
                horizontalLineToRelative(2.86f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.86f)
                lineToRelative(3.14f, 5.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(-4f, 0f, -4f, 0f)
                verticalLineToRelative(-1.89f)
                curveToRelative(0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveToRelative(-1.25f, -0.2f, -2.34f, 0.76f, -2.34f, 1.97f)
                verticalLineToRelative(5.89f)
                curveToRelative(0f, 1.0f, 0.68f, 1.92f, 1.66f, 2.08f)
                curveToRelative(1.25f, 0.2f, 2.34f, -0.76f, 2.34f, -1.97f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.89f)
                curveToRelative(0f, 1.0f, 0.68f, 1.92f, 1.66f, 2.08f)
                curveToRelative(1.25f, 0.2f, 2.34f, -0.76f, 2.34f, -1.97f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.22f, -1.08f, -2.18f, -2.34f, -1.97f)
                close()
            }
        }.also { _Segway = it}
