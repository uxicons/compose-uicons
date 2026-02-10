package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareM: ImageVector? = null

val Icons.Bs.SquareM: ImageVector
    get() = _SquareM ?: UXIcon(name = "SquareM") {
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
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(19f, 7.24f)
                verticalLineToRelative(11.76f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.01f)
                lineToRelative(-4f, 6.48f)
                lineToRelative(-4f, -6.48f)
                verticalLineToRelative(9.01f)
                horizontalLineToRelative(-3f)
                lineTo(5f, 7.24f)
                curveToRelative(0f, -1.01f, 0.6f, -1.85f, 1.53f, -2.14f)
                curveToRelative(0.93f, -0.29f, 1.94f, 0.06f, 2.52f, 0.87f)
                lineToRelative(2.96f, 4.79f)
                lineToRelative(2.91f, -4.71f)
                curveToRelative(0.62f, -0.89f, 1.63f, -1.24f, 2.56f, -0.94f)
                curveToRelative(0.93f, 0.29f, 1.53f, 1.13f, 1.53f, 2.14f)
                close()
            }
        }.also { _SquareM = it}
