package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareI: ImageVector? = null

val Icons.Ts.SquareI: ImageVector
    get() = _SquareI ?: UXIcon(name = "SquareI") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1f)
                lineTo(7f, 20f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                lineTo(11.5f, 5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(21.5f)
                lineTo(0f, 24f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(22f)
                lineTo(23f, 2.5f)
                close()
            }
        }.also { _SquareI = it}
