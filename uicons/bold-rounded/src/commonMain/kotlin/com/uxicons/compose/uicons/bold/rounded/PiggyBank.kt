package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PiggyBank: ImageVector? = null

val Icons.Br.PiggyBank: ImageVector
    get() = _PiggyBank ?: UXIcon(name = "PiggyBank") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.21f, 2.71f)
            curveToRelative(1.15f, -3.57f, 6.43f, -3.57f, 7.58f, 0f)
            curveToRelative(0.21f, 0.63f, -0.29f, 1.28f, -0.96f, 1.28f)
            horizontalLineToRelative(-5.65f)
            curveToRelative(-0.67f, 0f, -1.18f, -0.65f, -0.96f, -1.28f)
            close()
            moveTo(24f, 12.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.08f)
            curveToRelative(-0.67f, 1.66f, -1.89f, 3.04f, -3.42f, 3.93f)
            curveToRelative(0.08f, 3.39f, -4.72f, 4.23f, -5.83f, 1.07f)
            horizontalLineToRelative(-2.34f)
            curveToRelative(-1.11f, 3.16f, -5.91f, 2.32f, -5.83f, -1.07f)
            curveTo(1.47f, 19.04f, -0.11f, 14.0f, 1.87f, 10.38f)
            curveTo(-1.48f, 8.33f, 0.02f, 2.97f, 4f, 3f)
            curveToRelative(1.97f, 0.03f, 1.97f, 2.97f, 0f, 3f)
            curveToRelative(-1.16f, -0.01f, -1.36f, 1.7f, -0.25f, 1.97f)
            curveToRelative(1.41f, -1.23f, 3.24f, -1.97f, 5.25f, -1.97f)
            horizontalLineToRelative(6f)
            curveToRelative(0.1f, 0f, 0.19f, 0.0f, 0.29f, 0.01f)
            curveToRelative(0.66f, -1.96f, 2.34f, -2.7f, 3.5f, -2.98f)
            curveToRelative(0.62f, -0.15f, 1.21f, 0.34f, 1.21f, 0.98f)
            verticalLineToRelative(3.76f)
            curveToRelative(1.06f, 0.85f, 1.9f, 1.96f, 2.42f, 3.24f)
            horizontalLineToRelative(0.08f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(4f, 14f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(6f)
            curveToRelative(6.61f, -0.21f, 6.61f, -9.79f, 0f, -10f)
            horizontalLineToRelative(-6f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            close()
            moveTo(16.5f, 14f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            close()
        }
    }.also { _PiggyBank = it }
