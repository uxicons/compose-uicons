package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LastSquare: ImageVector? = null

val Icons.Ss.LastSquare: ImageVector
    get() = _LastSquare ?: UXIcon(name = "LastSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 9.77f)
                lineToRelative(3.96f, 2.23f)
                lineToRelative(-3.96f, 2.23f)
                verticalLineToRelative(-4.46f)
                close()
                moveTo(24f, 3f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(17f, 6.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.35f)
                lineTo(7f, 6.35f)
                verticalLineToRelative(11.29f)
                lineToRelative(8f, -4.5f)
                verticalLineToRelative(4.35f)
                horizontalLineToRelative(2f)
                lineTo(17f, 6.5f)
                close()
            }
        }.also { _LastSquare = it}
