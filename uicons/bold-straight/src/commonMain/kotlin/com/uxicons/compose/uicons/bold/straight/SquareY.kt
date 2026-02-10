package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareY: ImageVector? = null

val Icons.Bs.SquareY: ImageVector
    get() = _SquareY ?: UXIcon(name = "SquareY") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(18.99f, 5f)
                lineToRelative(-5.49f, 7.49f)
                verticalLineToRelative(6.51f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.51f)
                lineToRelative(-5.49f, -7.49f)
                horizontalLineToRelative(3.72f)
                lineToRelative(3.27f, 4.46f)
                lineToRelative(3.27f, -4.46f)
                horizontalLineToRelative(3.72f)
                close()
            }
        }.also { _SquareY = it}
