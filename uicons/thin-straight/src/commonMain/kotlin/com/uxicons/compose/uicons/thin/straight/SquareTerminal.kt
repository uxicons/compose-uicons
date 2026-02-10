package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareTerminal: ImageVector? = null

val Icons.Ts.SquareTerminal: ImageVector
    get() = _SquareTerminal ?: UXIcon(name = "SquareTerminal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.85f, 17.81f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.76f, -4.76f)
                curveToRelative(0.19f, -0.19f, 0.19f, -0.5f, 0f, -0.69f)
                lineTo(4.15f, 6.9f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.76f, 4.76f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.52f, 0f, 2.1f)
                lineToRelative(-4.76f, 4.76f)
                close()
                moveTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                close()
                moveTo(20f, 17f)
                lineTo(12f, 17f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _SquareTerminal = it}
