package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoSlash: ImageVector? = null

val Icons.Sc.VideoSlash: ImageVector
    get() = _VideoSlash ?: UXIcon(name = "VideoSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.56f, 6.54f)
                lineToRelative(13.01f, 13.01f)
                curveToRelative(-1.19f, 0.23f, -2.86f, 0.45f, -5.07f, 0.45f)
                curveToRelative(-4.65f, 0f, -7.03f, -0.97f, -7.13f, -1.01f)
                curveToRelative(-0.27f, -0.11f, -0.48f, -0.34f, -0.57f, -0.62f)
                curveToRelative(-0.03f, -0.1f, -0.8f, -2.53f, -0.8f, -6.37f)
                curveToRelative(0f, -2.52f, 0.33f, -4.41f, 0.56f, -5.46f)
                close()
                moveTo(17.76f, 15.64f)
                curveToRelative(0.13f, -0.99f, 0.24f, -2.21f, 0.24f, -3.64f)
                curveToRelative(0f, -3.85f, -0.77f, -6.27f, -0.8f, -6.37f)
                curveToRelative(-0.09f, -0.28f, -0.3f, -0.51f, -0.57f, -0.62f)
                curveToRelative(-0.1f, -0.04f, -2.49f, -1.01f, -7.13f, -1.01f)
                curveToRelative(-1.24f, 0f, -2.29f, 0.07f, -3.21f, 0.17f)
                lineToRelative(-2.73f, -2.73f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(19.0f, 19.0f)
                curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
                reflectiveCurveToRelative(0.59f, -1.53f, 0f, -2.12f)
                lineToRelative(-4.8f, -4.8f)
                close()
                moveTo(22.49f, 6.13f)
                curveToRelative(-0.31f, -0.18f, -0.7f, -0.17f, -1.01f, 0.01f)
                curveToRelative(-0.69f, 0.41f, -1.29f, 0.83f, -1.85f, 1.26f)
                curveToRelative(0.19f, 1.18f, 0.36f, 2.73f, 0.36f, 4.59f)
                curveToRelative(0f, 1.9f, -0.17f, 3.46f, -0.37f, 4.64f)
                curveToRelative(0.63f, 0.5f, 1.27f, 0.93f, 1.92f, 1.26f)
                curveToRelative(0.63f, 0.34f, 1.47f, -0.17f, 1.45f, -0.9f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.36f, -0.19f, -0.69f, -0.51f, -0.87f)
                close()
            }
        }.also { _VideoSlash = it}
