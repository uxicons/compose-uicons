package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PodiumAward: ImageVector? = null

val Icons.Ss.PodiumAward: ImageVector
    get() = _PodiumAward ?: UXIcon(name = "PodiumAward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.57f)
                curveToRelative(-0.73f, 1.05f, -1.92f, 2.35f, -3.43f, 2.86f)
                verticalLineToRelative(0.64f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                reflectiveCurveToRelative(0f, -2f, 0f, -2f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.64f)
                curveToRelative(-1.52f, -0.52f, -2.71f, -1.81f, -3.43f, -2.86f)
                horizontalLineToRelative(-2.57f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.5f)
                curveToRelative(-0.25f, -0.64f, -0.22f, -0.61f, -0.45f, -1.62f)
                curveToRelative(-0.13f, -0.58f, 0.01f, -1.18f, 0.39f, -1.65f)
                curveToRelative(0.37f, -0.47f, 0.93f, -0.73f, 1.53f, -0.73f)
                horizontalLineToRelative(8.08f)
                curveToRelative(0.6f, 0f, 1.15f, 0.27f, 1.53f, 0.73f)
                curveToRelative(0.37f, 0.46f, 0.52f, 1.06f, 0.39f, 1.65f)
                curveToRelative(-0.23f, 1.01f, -0.2f, 0.98f, -0.45f, 1.62f)
                close()
                moveTo(16f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(6f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 19.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _PodiumAward = it}
