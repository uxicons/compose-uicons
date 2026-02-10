package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PodiumAward: ImageVector? = null

val Icons.Bs.PodiumAward: ImageVector
    get() = _PodiumAward ?: UXIcon(name = "PodiumAward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(4.5f, 18f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 19f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19f, 7f)
                horizontalLineToRelative(-2.93f)
                curveToRelative(-0.64f, 0.85f, -1.47f, 1.65f, -2.56f, 2.19f)
                curveToRelative(-0.0f, 0.0f, -0.01f, 0.81f, -0.01f, 0.81f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.81f)
                curveToRelative(-1.09f, -0.54f, -1.93f, -1.34f, -2.57f, -2.19f)
                horizontalLineToRelative(-2.93f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.36f)
                curveToRelative(-0.0f, -0.01f, -0.01f, -0.03f, -0.01f, -0.04f)
                curveToRelative(-0.04f, -0.11f, -0.14f, -0.51f, -0.27f, -1.1f)
                curveToRelative(-0.15f, -0.7f, 0.02f, -1.42f, 0.47f, -1.98f)
                curveToRelative(0.45f, -0.56f, 1.12f, -0.88f, 1.84f, -0.88f)
                horizontalLineToRelative(7.23f)
                curveToRelative(0.72f, 0f, 1.39f, 0.32f, 1.84f, 0.88f)
                curveToRelative(0.45f, 0.56f, 0.62f, 1.28f, 0.47f, 1.98f)
                curveToRelative(-0.13f, 0.58f, -0.23f, 0.99f, -0.26f, 1.09f)
                curveToRelative(-0.01f, 0.01f, -0.01f, 0.03f, -0.02f, 0.04f)
                horizontalLineToRelative(1.36f)
                verticalLineToRelative(3f)
                close()
                moveTo(14.81f, 3f)
                horizontalLineToRelative(-5.62f)
                curveToRelative(0.0f, 0.01f, 0.01f, 0.03f, 0.01f, 0.04f)
                curveToRelative(0.26f, 0.76f, 1.05f, 2.69f, 2.61f, 3.46f)
                horizontalLineToRelative(0.37f)
                curveToRelative(1.56f, -0.77f, 2.36f, -2.7f, 2.62f, -3.5f)
                close()
            }
        }.also { _PodiumAward = it}
