package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimneyWindow: ImageVector? = null

val Icons.Sr.HouseChimneyWindow: ImageVector
    get() = _HouseChimneyWindow ?: UXIcon(name = "HouseChimneyWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 9.72f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 9.72f)
                curveToRelative(0f, -1.67f, 0.82f, -3.21f, 2.2f, -4.14f)
                lineTo(9.2f, 0.85f)
                curveToRelative(1.7f, -1.15f, 3.9f, -1.15f, 5.59f, 0f)
                lineToRelative(5.2f, 3.51f)
                lineTo(20f, 2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.73f)
                curveToRelative(1.25f, 0.94f, 2f, 2.41f, 2f, 3.99f)
                close()
                moveTo(16f, 12f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _HouseChimneyWindow = it}
