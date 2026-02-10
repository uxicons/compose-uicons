package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wave: ImageVector? = null

val Icons.Rs.Wave: ImageVector
    get() = _Wave ?: UXIcon(name = "Wave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.01f, 22.63f)
                curveToRelative(-0.76f, 0.87f, -1.86f, 1.37f, -3.01f, 1.37f)
                curveToRelative(-1.2f, 0f, -2.27f, -0.54f, -3f, -1.38f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.38f, -3f, 1.38f)
                reflectiveCurveToRelative(-2.27f, -0.54f, -3f, -1.38f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.38f, -3f, 1.38f)
                reflectiveCurveToRelative(-2.27f, -0.54f, -3f, -1.38f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.38f, -3f, 1.38f)
                curveToRelative(-1.15f, 0f, -2.25f, -0.5f, -3.01f, -1.37f)
                lineToRelative(1.51f, -1.32f)
                curveToRelative(0.38f, 0.44f, 0.93f, 0.69f, 1.5f, 0.69f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0.57f, 0f, 1.12f, -0.25f, 1.5f, -0.68f)
                lineToRelative(1.51f, 1.31f)
                close()
                moveTo(7f, 14f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -4.71f, 3.63f, -8.58f, 8.24f, -8.97f)
                curveToRelative(-2.5f, 1.46f, -4.24f, 4.29f, -4.24f, 7.47f)
                curveToRelative(0f, 5.16f, 2.55f, 8.5f, 6.5f, 8.5f)
                curveToRelative(1.4f, 0f, 2.59f, -0.63f, 3.4f, -1.5f)
                curveToRelative(0.73f, 0.91f, 1.84f, 1.5f, 3.1f, 1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.81f, -1.05f, 2f, -2.5f, 2f)
                curveToRelative(-2.82f, 0f, -4.5f, -2.43f, -4.5f, -6.5f)
                curveToRelative(0f, -3.14f, 2.41f, -6.5f, 6f, -6.5f)
                curveToRelative(0.54f, 0f, 1.07f, 0.12f, 1.56f, 0.26f)
                lineToRelative(0.78f, 0.17f)
                lineToRelative(0.87f, -1.56f)
                lineToRelative(-0.88f, -0.49f)
                curveToRelative(-1.62f, -0.9f, -3.47f, -1.38f, -5.33f, -1.38f)
                curveTo(9.94f, 0f, 5f, 4.93f, 5f, 11f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                curveToRelative(-0.57f, 0f, -1.12f, -0.25f, -1.5f, -0.69f)
                lineTo(-0.01f, 16.63f)
                curveToRelative(0.76f, 0.87f, 1.86f, 1.37f, 3.01f, 1.37f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                close()
            }
        }.also { _Wave = it}
