package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandFist: ImageVector? = null

val Icons.Sc.HandFist: ImageVector
    get() = _HandFist ?: UXIcon(name = "HandFist") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.97f, 7.5f)
                horizontalLineToRelative(0.05f)
                curveToRelative(0.81f, 0f, 1.48f, -0.66f, 1.48f, -1.48f)
                verticalLineToRelative(-2.55f)
                curveToRelative(0f, -0.81f, -0.66f, -1.48f, -1.52f, -1.48f)
                curveToRelative(-0.81f, 0f, -1.48f, 0.66f, -1.48f, 1.48f)
                verticalLineToRelative(2.55f)
                curveToRelative(0f, 0.81f, 0.66f, 1.48f, 1.48f, 1.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.97f, 7.5f)
                horizontalLineToRelative(0.05f)
                curveToRelative(0.81f, 0f, 1.48f, -0.66f, 1.48f, -1.48f)
                verticalLineToRelative(-2.55f)
                curveToRelative(0f, -0.81f, -0.66f, -1.48f, -1.52f, -1.48f)
                curveToRelative(-0.81f, 0f, -1.48f, 0.66f, -1.48f, 1.48f)
                verticalLineToRelative(2.55f)
                curveToRelative(0f, 0.81f, 0.66f, 1.48f, 1.48f, 1.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.9f, 9.44f)
                curveToRelative(-0.55f, 0.35f, -1.21f, 0.56f, -1.92f, 0.56f)
                curveToRelative(-1.12f, 0f, -2.12f, -0.52f, -2.76f, -1.32f)
                curveToRelative(-0.61f, 0.51f, -1.4f, 0.82f, -2.26f, 0.82f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.98f, 0f, -1.86f, -0.4f, -2.5f, -1.04f)
                curveToRelative(-0.64f, 0.64f, -1.52f, 1.04f, -2.5f, 1.04f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.4f, 0f, -0.79f, -0.07f, -1.15f, -0.19f)
                curveToRelative(-0.09f, 0.77f, -0.44f, 1.48f, -1f, 2.03f)
                lineToRelative(-1.68f, 1.62f)
                curveToRelative(-0.4f, 0.39f, -1.04f, 0.38f, -1.43f, -0.02f)
                curveToRelative(-0.39f, -0.4f, -0.38f, -1.03f, 0.02f, -1.41f)
                lineToRelative(1.67f, -1.61f)
                curveToRelative(0.27f, -0.27f, 0.42f, -0.62f, 0.42f, -1.01f)
                reflectiveCurveToRelative(-0.15f, -0.74f, -0.43f, -1.01f)
                curveToRelative(-0.57f, -0.56f, -1.51f, -0.56f, -2.08f, 0f)
                curveToRelative(0f, 0f, -4.2f, 3.61f, -4.2f, 5.11f)
                curveToRelative(0f, 2.5f, 2.12f, 3.96f, 3.5f, 5f)
                curveToRelative(1.38f, 1.03f, 2.28f, 2.54f, 2.71f, 3.37f)
                curveToRelative(0.2f, 0.39f, 0.6f, 0.63f, 1.04f, 0.63f)
                horizontalLineToRelative(10.73f)
                curveToRelative(0.27f, 0f, 0.53f, -0.1f, 0.71f, -0.29f)
                reflectiveCurveToRelative(0.3f, -0.44f, 0.3f, -0.71f)
                curveToRelative(0f, -0.91f, 0.26f, -1.53f, 0.89f, -2.15f)
                curveToRelative(0.79f, -0.78f, 2.12f, -2.81f, 2.12f, -7.63f)
                curveToRelative(0f, -0.47f, -0.04f, -1.1f, -0.1f, -1.78f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 5.6f)
                verticalLineToRelative(-1.13f)
                curveToRelative(0f, -0.81f, -0.67f, -1.47f, -1.5f, -1.47f)
                reflectiveCurveToRelative(-1.5f, 0.66f, -1.5f, 1.47f)
                verticalLineToRelative(1.53f)
                curveToRelative(0.91f, -0.58f, 2.02f, -0.71f, 3f, -0.4f)
                close()
            }
        }.also { _HandFist = it}
