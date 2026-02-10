package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clouds: ImageVector? = null

val Icons.Sc.Clouds: ImageVector
    get() = _Clouds ?: UXIcon(name = "Clouds") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.71f, 15.41f)
                curveToRelative(-0.2f, -2.4f, -2.17f, -4.28f, -4.58f, -4.28f)
                curveToRelative(-2.53f, 0f, -4.59f, 2.1f, -4.59f, 4.67f)
                curveToRelative(0f, 0.05f, 0f, 0.11f, 0.0f, 0.16f)
                curveToRelative(-1.23f, 0.5f, -2.09f, 1.72f, -2.09f, 3.14f)
                curveToRelative(0f, 1.86f, 1.49f, 3.38f, 3.33f, 3.38f)
                horizontalLineToRelative(6.41f)
                curveToRelative(2.01f, 0f, 3.64f, -1.66f, 3.64f, -3.7f)
                curveToRelative(0f, -1.46f, -0.85f, -2.77f, -2.12f, -3.36f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.3f, 8.82f)
                curveToRelative(-0.09f, -4.03f, -3.34f, -7.28f, -7.32f, -7.28f)
                curveToRelative(-4.04f, 0f, -7.32f, 3.34f, -7.32f, 7.45f)
                curveToRelative(0f, 0.27f, 0.01f, 0.54f, 0.04f, 0.81f)
                curveToRelative(-2.15f, 0.61f, -3.71f, 2.62f, -3.71f, 4.99f)
                reflectiveCurveToRelative(1.56f, 4.42f, 3.81f, 5.01f)
                curveToRelative(0.08f, 0.02f, 0.17f, 0.03f, 0.26f, 0.03f)
                curveToRelative(0.09f, 0f, 0.18f, -0.01f, 0.26f, -0.04f)
                lineToRelative(1.14f, -0.31f)
                curveToRelative(-0.01f, -0.13f, -0.01f, -0.26f, -0.01f, -0.39f)
                curveToRelative(0f, -1.75f, 0.82f, -3.34f, 2.17f, -4.33f)
                curveToRelative(0.49f, -3.19f, 3.23f, -5.63f, 6.51f, -5.63f)
                curveToRelative(3.04f, 0f, 5.67f, 2.15f, 6.4f, 5.05f)
                curveToRelative(0.35f, 0.27f, 0.68f, 0.57f, 0.96f, 0.91f)
                curveToRelative(0.31f, -0.17f, 0.51f, -0.5f, 0.51f, -0.87f)
                curveToRelative(0f, -2.43f, -1.51f, -4.58f, -3.7f, -5.39f)
                close()
            }
        }.also { _Clouds = it}
