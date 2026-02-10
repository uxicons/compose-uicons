package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareX: ImageVector? = null

val Icons.Ss.SquareX: ImageVector
    get() = _SquareX ?: UXIcon(name = "SquareX") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(15.92f, 19f)
                lineToRelative(-3.92f, -5.31f)
                lineToRelative(-3.87f, 5.31f)
                horizontalLineToRelative(-2.48f)
                lineToRelative(5.11f, -7f)
                lineToRelative(-5.11f, -6.98f)
                horizontalLineToRelative(2.48f)
                lineToRelative(3.87f, 5.29f)
                lineToRelative(3.81f, -5.29f)
                horizontalLineToRelative(2.48f)
                lineToRelative(-5.05f, 6.98f)
                lineToRelative(5.16f, 7f)
                horizontalLineToRelative(-2.48f)
                close()
            }
        }.also { _SquareX = it}
