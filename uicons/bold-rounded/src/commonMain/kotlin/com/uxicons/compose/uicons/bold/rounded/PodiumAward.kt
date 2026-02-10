package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PodiumAward: ImageVector? = null

val Icons.Br.PodiumAward: ImageVector
    get() = _PodiumAward ?: UXIcon(name = "PodiumAward") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 18f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
            moveTo(4f, 18f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            close()
            moveTo(17.5f, 7f)
            horizontalLineToRelative(-1.43f)
            curveToRelative(-0.64f, 0.85f, -1.47f, 1.66f, -2.57f, 2.19f)
            verticalLineToRelative(0.81f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-0.81f)
            curveToRelative(-1.1f, -0.53f, -1.93f, -1.34f, -2.57f, -2.19f)
            horizontalLineToRelative(-1.43f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -0.78f, 0.6f, -1.42f, 1.37f, -1.49f)
            curveToRelative(-0.07f, -0.18f, -0.14f, -0.51f, -0.28f, -1.16f)
            curveToRelative(-0.15f, -0.7f, 0.02f, -1.42f, 0.47f, -1.98f)
            curveToRelative(0.45f, -0.56f, 1.12f, -0.88f, 1.84f, -0.88f)
            horizontalLineToRelative(7.23f)
            curveToRelative(0.72f, 0f, 1.39f, 0.32f, 1.84f, 0.88f)
            curveToRelative(0.45f, 0.56f, 0.62f, 1.28f, 0.47f, 1.98f)
            curveToRelative(-0.14f, 0.65f, -0.21f, 0.96f, -0.28f, 1.15f)
            curveToRelative(0.76f, 0.07f, 1.37f, 0.7f, 1.37f, 1.49f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(9.2f, 3f)
            curveToRelative(0.26f, 0.76f, 1.05f, 2.73f, 2.61f, 3.5f)
            horizontalLineToRelative(0.37f)
            curveToRelative(1.56f, -0.77f, 2.36f, -2.71f, 2.62f, -3.5f)
            curveToRelative(0f, 0f, -5.61f, -0.01f, -5.61f, 0f)
            close()
            moveTo(22f, 19f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            close()
        }
    }.also { _PodiumAward = it }
