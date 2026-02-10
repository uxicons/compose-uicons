package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareUpRight: ImageVector? = null

val Icons.Ss.SquareUpRight: ImageVector
    get() = _SquareUpRight ?: UXIcon(name = "SquareUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.59f)
                lineToRelative(-10.79f, 10.79f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(15.59f, 7f)
                horizontalLineToRelative(-6.59f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _SquareUpRight = it}
