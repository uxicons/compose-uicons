package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareTerminal: ImageVector? = null

val Icons.Ss.SquareTerminal: ImageVector
    get() = _SquareTerminal ?: UXIcon(name = "SquareTerminal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10.42f, 13.41f)
                lineToRelative(-4.76f, 4.76f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.76f, -4.76f)
                lineTo(4.25f, 7.25f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(4.76f, 4.76f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.04f, 0f, 2.81f)
                close()
                moveTo(20f, 18f)
                lineTo(12f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _SquareTerminal = it}
