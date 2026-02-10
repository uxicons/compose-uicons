package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareD: ImageVector? = null

val Icons.Bs.SquareD: ImageVector
    get() = _SquareD ?: UXIcon(name = "SquareD") {
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
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(11.79f, 5f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.29f)
                curveToRelative(3.43f, 0f, 6.21f, -2.79f, 6.21f, -6.21f)
                verticalLineToRelative(-1.57f)
                curveToRelative(0f, -3.43f, -2.79f, -6.21f, -6.21f, -6.21f)
                close()
                moveTo(15f, 12.79f)
                curveToRelative(0f, 1.77f, -1.44f, 3.21f, -3.21f, 3.21f)
                horizontalLineToRelative(-2.79f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.79f)
                curveToRelative(1.77f, 0f, 3.21f, 1.44f, 3.21f, 3.21f)
                verticalLineToRelative(1.57f)
                close()
            }
        }.also { _SquareD = it}
