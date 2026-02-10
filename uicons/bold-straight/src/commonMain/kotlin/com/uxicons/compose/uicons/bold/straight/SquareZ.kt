package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareZ: ImageVector? = null

val Icons.Bs.SquareZ: ImageVector
    get() = _SquareZ ?: UXIcon(name = "SquareZ") {
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
                moveTo(10.13f, 16f)
                horizontalLineToRelative(7.87f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-9.8f)
                curveToRelative(-0.89f, 0f, -1.69f, -0.53f, -2.03f, -1.36f)
                curveToRelative(-0.34f, -0.83f, -0.15f, -1.77f, 0.48f, -2.4f)
                lineToRelative(7.22f, -7.24f)
                horizontalLineToRelative(-7.87f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9.8f)
                curveToRelative(0.89f, 0f, 1.69f, 0.53f, 2.03f, 1.36f)
                curveToRelative(0.34f, 0.83f, 0.15f, 1.77f, -0.48f, 2.4f)
                lineToRelative(-7.22f, 7.24f)
                close()
            }
        }.also { _SquareZ = it}
