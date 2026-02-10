package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareTerminal: ImageVector? = null

val Icons.Bs.SquareTerminal: ImageVector
    get() = _SquareTerminal ?: UXIcon(name = "SquareTerminal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.06f, 17.56f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(3.9f, -3.9f)
                lineToRelative(-3.9f, -3.9f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(4.26f, 4.26f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.55f, 0f, 3.52f)
                lineToRelative(-4.26f, 4.26f)
                close()
                moveTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineTo(20.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(3.5f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _SquareTerminal = it}
