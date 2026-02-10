package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeRight: ImageVector? = null

val Icons.Sc.SwipeRight: ImageVector
    get() = _SwipeRight ?: UXIcon(name = "SwipeRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 13.34f)
                curveToRelative(-0.09f, 3.96f, -0.89f, 6.09f, -1.9f, 8.24f)
                curveToRelative(-0.28f, 0.6f, -0.85f, 1.03f, -1.51f, 1.13f)
                curveToRelative(-0.92f, 0.14f, -2.55f, 0.29f, -4.45f, 0.29f)
                curveToRelative(-4.4f, 0f, -5.66f, -0.55f, -5.66f, -0.55f)
                curveToRelative(-4.23f, -3.26f, -5.46f, -7.95f, -5.46f, -7.95f)
                curveToRelative(-0.17f, -0.88f, 0.25f, -1.8f, 1.08f, -2.24f)
                curveToRelative(0.81f, -0.42f, 1.76f, -0.32f, 2.47f, 0.29f)
                curveToRelative(0f, 0f, 0.97f, 0.87f, 2.01f, 2.33f)
                curveToRelative(0.19f, -1.5f, 0.25f, -2.94f, 0.25f, -3.96f)
                curveToRelative(0f, -2.87f, -0.51f, -5.39f, -0.81f, -7.0f)
                curveToRelative(-0.28f, -1.49f, 0.84f, -2.92f, 2.44f, -2.93f)
                curveToRelative(1.16f, -0.01f, 2.12f, 0.87f, 2.43f, 1.98f)
                curveToRelative(0.41f, 1.44f, 0.71f, 3.71f, 0.82f, 6.55f)
                curveToRelative(3.72f, 0.47f, 6.38f, 1.65f, 7.67f, 2.58f)
                curveToRelative(0.39f, 0.28f, 0.61f, 0.75f, 0.6f, 1.23f)
                close()
                moveTo(22.8f, 3.9f)
                curveToRelative(-0.77f, -1.02f, -1.68f, -1.93f, -2.7f, -2.7f)
                curveToRelative(-0.3f, -0.23f, -0.71f, -0.26f, -1.05f, -0.09f)
                curveToRelative(-0.34f, 0.17f, -0.55f, 0.52f, -0.55f, 0.9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                curveToRelative(-0.01f, 0.54f, 0.46f, 1.01f, 1f, 1f)
                curveToRelative(0.21f, 0f, 0.42f, -0.07f, 0.6f, -0.2f)
                curveToRelative(1.02f, -0.77f, 1.93f, -1.68f, 2.7f, -2.7f)
                curveToRelative(0.27f, -0.35f, 0.27f, -0.84f, 0f, -1.2f)
                close()
            }
        }.also { _SwipeRight = it}
