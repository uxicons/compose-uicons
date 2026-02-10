package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareT: ImageVector? = null

val Icons.Ss.SquareT: ImageVector
    get() = _SquareT ?: UXIcon(name = "SquareT") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19f, 7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _SquareT = it}
