package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareY: ImageVector? = null

val Icons.Ss.SquareY: ImageVector
    get() = _SquareY ?: UXIcon(name = "SquareY") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(13f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.66f)
                lineToRelative(-5.38f, -7.34f)
                horizontalLineToRelative(2.48f)
                lineToRelative(3.9f, 5.31f)
                lineToRelative(3.88f, -5.31f)
                horizontalLineToRelative(2.48f)
                lineToRelative(-5.36f, 7.32f)
                verticalLineToRelative(6.68f)
                close()
            }
        }.also { _SquareY = it}
