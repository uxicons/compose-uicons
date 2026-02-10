package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareUpRight: ImageVector? = null

val Icons.Bs.SquareUpRight: ImageVector
    get() = _SquareUpRight ?: UXIcon(name = "SquareUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 7.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.88f)
                lineToRelative(-8.44f, 8.44f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(8.44f, -8.44f)
                horizontalLineToRelative(-4.88f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 3.5f)
                close()
            }
        }.also { _SquareUpRight = it}
