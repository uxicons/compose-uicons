package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeLeft: ImageVector? = null

val Icons.Sc.SwipeLeft: ImageVector
    get() = _SwipeLeft ?: UXIcon(name = "SwipeLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 4.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                curveToRelative(0.01f, 0.54f, -0.46f, 1.01f, -1f, 1f)
                curveToRelative(-0.21f, 0f, -0.42f, -0.07f, -0.6f, -0.2f)
                curveToRelative(-1.02f, -0.77f, -1.93f, -1.68f, -2.7f, -2.7f)
                curveToRelative(-0.27f, -0.35f, -0.27f, -0.84f, 0f, -1.2f)
                curveToRelative(0.77f, -1.02f, 1.68f, -1.93f, 2.7f, -2.7f)
                curveToRelative(0.3f, -0.23f, 0.71f, -0.26f, 1.05f, -0.09f)
                curveToRelative(0.34f, 0.17f, 0.55f, 0.52f, 0.55f, 0.9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(19.4f, 12.11f)
                curveToRelative(-1.28f, -0.93f, -3.95f, -2.08f, -7.64f, -2.55f)
                curveToRelative(-0.1f, -2.92f, -0.43f, -5.11f, -0.85f, -6.58f)
                curveToRelative(-0.31f, -1.11f, -1.27f, -1.99f, -2.43f, -1.98f)
                curveToRelative(-1.59f, 0.02f, -2.71f, 1.44f, -2.44f, 2.93f)
                curveToRelative(0.3f, 1.61f, 0.81f, 4.13f, 0.81f, 7.0f)
                curveToRelative(0f, 1.02f, -0.06f, 2.45f, -0.25f, 3.96f)
                curveToRelative(-1.03f, -1.45f, -2.01f, -2.33f, -2.01f, -2.33f)
                curveToRelative(-0.7f, -0.61f, -1.66f, -0.71f, -2.47f, -0.29f)
                curveToRelative(-0.83f, 0.44f, -1.25f, 1.36f, -1.08f, 2.24f)
                curveToRelative(0f, 0f, 1.23f, 4.69f, 5.46f, 7.95f)
                curveToRelative(0f, 0f, 1.26f, 0.55f, 5.66f, 0.55f)
                curveToRelative(1.89f, 0f, 3.53f, -0.16f, 4.45f, -0.29f)
                curveToRelative(0.66f, -0.1f, 1.22f, -0.52f, 1.51f, -1.13f)
                curveToRelative(1.01f, -2.15f, 1.81f, -4.28f, 1.9f, -8.24f)
                curveToRelative(0.01f, -0.48f, -0.21f, -0.94f, -0.6f, -1.23f)
                close()
            }
        }.also { _SwipeLeft = it}
