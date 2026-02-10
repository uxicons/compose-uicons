package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Magnet: ImageVector? = null

val Icons.Br.Magnet: ImageVector
    get() = _Magnet ?: UXIcon(name = "Magnet") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.5f, 0f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(8.31f)
            curveToRelative(0f, 1.64f, -1.19f, 3.04f, -2.7f, 3.18f)
            curveToRelative(-0.86f, 0.08f, -1.68f, -0.19f, -2.32f, -0.77f)
            curveToRelative(-0.62f, -0.57f, -0.98f, -1.38f, -0.98f, -2.22f)
            lineTo(9f, 3.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-2f)
            curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
            verticalLineToRelative(8.15f)
            curveToRelative(0f, 6.69f, 5.18f, 12.35f, 12.0f, 12.35f)
            curveToRelative(3.16f, 0f, 6.14f, -1.22f, 8.4f, -3.44f)
            curveToRelative(2.32f, -2.27f, 3.59f, -5.32f, 3.59f, -8.56f)
            lineTo(24f, 3.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, 2.44f, -0.96f, 4.72f, -2.69f, 6.42f)
            curveToRelative(-1.74f, 1.71f, -4.04f, 2.62f, -6.47f, 2.58f)
            curveToRelative(-4.87f, -0.09f, -8.83f, -4.28f, -8.83f, -9.35f)
            verticalLineToRelative(-5.65f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.69f, 0.72f, 3.31f, 1.97f, 4.44f)
            curveToRelative(1.25f, 1.14f, 2.93f, 1.7f, 4.62f, 1.53f)
            curveToRelative(3.04f, -0.29f, 5.42f, -3.0f, 5.42f, -6.17f)
            verticalLineToRelative(-5.81f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(6f)
            close()
        }
    }.also { _Magnet = it }
