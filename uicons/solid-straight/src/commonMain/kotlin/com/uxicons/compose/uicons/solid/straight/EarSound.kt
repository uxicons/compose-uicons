package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarSound: ImageVector? = null

val Icons.Ss.EarSound: ImageVector
    get() = _EarSound ?: UXIcon(name = "EarSound") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.99f, 17.42f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(1.97f, -1.97f, 1.97f, -5.18f, 0f, -7.16f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(2.75f, 2.75f, 2.75f, 7.23f, 0f, 9.98f)
                close()
                moveTo(4.78f, 4.65f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(3.51f, 3.51f, 3.51f, 9.22f, 0f, 12.73f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(4.29f, -4.29f, 4.29f, -11.27f, 0f, -15.56f)
                close()
                moveTo(20.83f, 2.42f)
                curveTo(18.82f, 0.62f, 16.11f, -0.24f, 13.4f, 0.07f)
                curveToRelative(-2.67f, 0.3f, -5.04f, 1.77f, -6.58f, 3.87f)
                curveToRelative(1.07f, 1.23f, 1.86f, 2.62f, 2.39f, 4.08f)
                curveToRelative(0.65f, -2.31f, 2.77f, -4.01f, 5.29f, -4.01f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.76f, 0f, -3.22f, 1.3f, -3.46f, 2.99f)
                horizontalLineToRelative(0.96f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                verticalLineToRelative(-2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(-2.09f)
                curveToRelative(0.38f, 3.48f, -0.65f, 7.09f, -3.07f, 9.9f)
                curveToRelative(0.37f, 0.74f, 0.88f, 1.4f, 1.6f, 1.93f)
                curveToRelative(1.04f, 0.77f, 2.3f, 1.16f, 3.57f, 1.16f)
                curveToRelative(1.16f, 0f, 2.32f, -0.33f, 3.3f, -0.99f)
                curveToRelative(0.89f, -0.59f, 1.6f, -1.41f, 2.06f, -2.34f)
                curveToRelative(0.8f, -1.63f, 1.63f, -2.71f, 2.63f, -3.42f)
                curveToRelative(2.5f, -1.78f, 4.0f, -4.67f, 4.0f, -7.74f)
                curveToRelative(0f, -2.7f, -1.16f, -5.28f, -3.17f, -7.08f)
                close()
            }
        }.also { _EarSound = it}
