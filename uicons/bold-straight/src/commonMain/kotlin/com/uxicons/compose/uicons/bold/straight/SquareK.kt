package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareK: ImageVector? = null

val Icons.Bs.SquareK: ImageVector
    get() = _SquareK ?: UXIcon(name = "SquareK") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.21f, 11.06f)
                lineToRelative(4.77f, 7.94f)
                horizontalLineToRelative(-3.5f)
                lineToRelative(-3.61f, -6f)
                horizontalLineToRelative(-2.87f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                lineTo(6.0f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2.28f)
                lineToRelative(3.54f, -5f)
                horizontalLineToRelative(3.68f)
                lineToRelative(-4.29f, 6.06f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 3.5f)
                close()
            }
        }.also { _SquareK = it}
