package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareTerminal: ImageVector? = null

val Icons.Rs.SquareTerminal: ImageVector
    get() = _SquareTerminal ?: UXIcon(name = "SquareTerminal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.66f, 18.16f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.76f, -4.76f)
                lineTo(4.25f, 7.25f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(4.76f, 4.76f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.04f, 0f, 2.81f)
                lineToRelative(-4.76f, 4.76f)
                close()
                moveTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                close()
                moveTo(20f, 16f)
                lineTo(12f, 16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _SquareTerminal = it}
