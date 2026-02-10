package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareC: ImageVector? = null

val Icons.Sr.SquareC: ImageVector
    get() = _SquareC ?: UXIcon(name = "SquareC") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(8.01f, 10.91f)
                verticalLineToRelative(2.18f)
                curveToRelative(0f, 2.16f, 1.73f, 3.91f, 3.86f, 3.91f)
                horizontalLineToRelative(0.55f)
                curveToRelative(1.31f, 0f, 2.52f, -0.65f, 3.25f, -1.74f)
                curveToRelative(0.31f, -0.46f, 0.93f, -0.58f, 1.39f, -0.27f)
                curveToRelative(0.46f, 0.31f, 0.58f, 0.93f, 0.27f, 1.39f)
                curveToRelative(-1.1f, 1.64f, -2.94f, 2.62f, -4.91f, 2.62f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-3.23f, 0f, -5.86f, -2.65f, -5.86f, -5.91f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0f, -3.26f, 2.63f, -5.91f, 5.86f, -5.91f)
                horizontalLineToRelative(0.55f)
                curveToRelative(1.98f, 0f, 3.81f, 0.98f, 4.91f, 2.62f)
                curveToRelative(0.31f, 0.46f, 0.18f, 1.08f, -0.28f, 1.39f)
                curveToRelative(-0.46f, 0.31f, -1.08f, 0.18f, -1.39f, -0.28f)
                curveToRelative(-0.73f, -1.09f, -1.94f, -1.74f, -3.25f, -1.74f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-2.13f, 0f, -3.86f, 1.75f, -3.86f, 3.91f)
                close()
            }
        }.also { _SquareC = it}
