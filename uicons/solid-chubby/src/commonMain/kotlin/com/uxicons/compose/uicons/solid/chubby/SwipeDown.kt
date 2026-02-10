package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeDown: ImageVector? = null

val Icons.Sc.SwipeDown: ImageVector
    get() = _SwipeDown ?: UXIcon(name = "SwipeDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.9f, 9.8f)
                curveToRelative(-1.02f, -0.77f, -1.93f, -1.68f, -2.7f, -2.7f)
                curveToRelative(-0.13f, -0.18f, -0.2f, -0.39f, -0.2f, -0.6f)
                curveToRelative(-0.01f, -0.54f, 0.46f, -1.01f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.38f, 0f, 0.72f, 0.21f, 0.9f, 0.55f)
                reflectiveCurveToRelative(0.13f, 0.74f, -0.09f, 1.05f)
                curveToRelative(-0.77f, 1.02f, -1.68f, 1.93f, -2.7f, 2.7f)
                curveToRelative(-0.35f, 0.27f, -0.84f, 0.27f, -1.2f, 0f)
                close()
                moveTo(22.4f, 12.11f)
                curveToRelative(-1.25f, -0.91f, -4.11f, -2.08f, -7.69f, -2.58f)
                curveToRelative(-0.09f, -3.06f, -0.37f, -5.04f, -0.8f, -6.56f)
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
        }.also { _SwipeDown = it}
