package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareG: ImageVector? = null

val Icons.Sr.SquareG: ImageVector
    get() = _SquareG ?: UXIcon(name = "SquareG") {
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
                moveTo(17.8f, 15.45f)
                curveToRelative(-0.95f, 2.2f, -3.35f, 3.6f, -5.8f, 3.6f)
                curveToRelative(-0.59f, 0f, -1.18f, -0.08f, -1.75f, -0.25f)
                curveToRelative(-2.5f, -0.73f, -4.25f, -3.12f, -4.25f, -5.81f)
                verticalLineToRelative(-1.86f)
                curveToRelative(0f, -1.66f, 0.69f, -3.28f, 1.9f, -4.45f)
                curveToRelative(1.18f, -1.14f, 2.73f, -1.73f, 4.32f, -1.69f)
                curveToRelative(1.94f, 0.06f, 3.74f, 1.06f, 4.82f, 2.65f)
                curveToRelative(0.31f, 0.46f, 0.19f, 1.08f, -0.27f, 1.39f)
                curveToRelative(-0.46f, 0.31f, -1.08f, 0.19f, -1.39f, -0.27f)
                curveToRelative(-0.72f, -1.07f, -1.93f, -1.74f, -3.23f, -1.78f)
                curveToRelative(-1.05f, -0.04f, -2.07f, 0.36f, -2.86f, 1.13f)
                curveToRelative(-0.82f, 0.79f, -1.29f, 1.89f, -1.29f, 3.01f)
                verticalLineToRelative(1.86f)
                curveToRelative(0f, 1.8f, 1.16f, 3.4f, 2.81f, 3.89f)
                curveToRelative(2.01f, 0.59f, 4.37f, -0.43f, 5.15f, -2.23f)
                curveToRelative(0.07f, -0.16f, 0.01f, -0.31f, -0.04f, -0.4f)
                curveToRelative(-0.1f, -0.16f, -0.28f, -0.26f, -0.47f, -0.26f)
                horizontalLineToRelative(-3.46f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.46f)
                curveToRelative(0.86f, 0f, 1.66f, 0.43f, 2.14f, 1.16f)
                curveToRelative(0.45f, 0.69f, 0.53f, 1.55f, 0.21f, 2.29f)
                close()
            }
        }.also { _SquareG = it}
