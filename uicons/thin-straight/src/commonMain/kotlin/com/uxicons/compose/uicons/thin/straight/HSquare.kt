package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HSquare: ImageVector? = null

val Icons.Ts.HSquare: ImageVector
    get() = _HSquare ?: UXIcon(name = "HSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(17f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6.5f)
                lineTo(7f, 12.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1f)
                lineTo(6f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }.also { _HSquare = it}
