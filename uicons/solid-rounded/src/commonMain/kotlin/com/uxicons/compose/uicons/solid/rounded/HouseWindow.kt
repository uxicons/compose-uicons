package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseWindow: ImageVector? = null

val Icons.Sr.HouseWindow: ImageVector
    get() = _HouseWindow ?: UXIcon(name = "HouseWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 5.58f)
                lineTo(14.8f, 0.85f)
                curveToRelative(-1.7f, -1.15f, -3.9f, -1.15f, -5.59f, 0f)
                lineTo(2.2f, 5.58f)
                curveToRelative(-1.38f, 0.93f, -2.2f, 2.48f, -2.2f, 4.14f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 9.72f)
                curveToRelative(0f, -1.67f, -0.82f, -3.21f, -2.2f, -4.14f)
                close()
                moveTo(16f, 16f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                close()
                moveTo(14f, 12f)
                lineToRelative(0.0f, 4f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _HouseWindow = it}
