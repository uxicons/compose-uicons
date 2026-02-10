package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeSlash: ImageVector? = null

val Icons.Sc.VolumeSlash: ImageVector
    get() = _VolumeSlash ?: UXIcon(name = "VolumeSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 20.44f)
                curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                lineToRelative(-19.0f, -19.0f)
                curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
                curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
                lineToRelative(4.08f, 4.08f)
                curveToRelative(0.6f, -0.64f, 1.23f, -1.37f, 1.76f, -2.05f)
                curveToRelative(0.41f, -0.49f, 1.09f, -0.6f, 1.7f, -0.31f)
                curveToRelative(1.43f, 0.68f, 2.87f, 3.89f, 2.9f, 8.72f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.39f, -0.5f, 0.59f, -0.92f, 0.59f, -1.29f)
                curveToRelative(0f, -0.42f, -0.26f, -0.93f, -0.77f, -1.52f)
                curveToRelative(-0.54f, -0.63f, -0.48f, -1.57f, 0.15f, -2.12f)
                curveToRelative(0.62f, -0.54f, 1.57f, -0.47f, 2.12f, 0.15f)
                curveToRelative(1.01f, 1.17f, 1.51f, 2.31f, 1.51f, 3.48f)
                curveToRelative(0.0f, 1.13f, -0.49f, 2.36f, -1.47f, 3.41f)
                lineToRelative(0.67f, 0.67f)
                curveToRelative(1.2f, -1.49f, 1.8f, -2.83f, 1.8f, -4.08f)
                curveToRelative(0f, -1.62f, -1f, -3.42f, -3.06f, -5.47f)
                curveToRelative(-0.59f, -0.58f, -0.59f, -1.53f, 0f, -2.12f)
                reflectiveCurveToRelative(1.53f, -0.59f, 2.12f, 0f)
                curveToRelative(2.69f, 2.69f, 3.94f, 5.1f, 3.94f, 7.6f)
                curveToRelative(0f, 2.04f, -0.88f, 4.08f, -2.67f, 6.21f)
                lineToRelative(2.23f, 2.23f)
                close()
                moveTo(1f, 12f)
                curveToRelative(0f, 1.71f, 0.55f, 2.82f, 1.51f, 4.16f)
                curveToRelative(0.17f, 0.24f, 0.43f, 0.39f, 0.72f, 0.42f)
                lineToRelative(2.7f, 0.35f)
                curveToRelative(0.63f, 0.33f, 2.3f, 2.12f, 3.46f, 3.6f)
                curveToRelative(0.41f, 0.51f, 1.13f, 0.59f, 1.7f, 0.31f)
                curveToRelative(0.71f, -0.34f, 1.43f, -1.33f, 1.97f, -2.82f)
                lineToRelative(-10.37f, -10.37f)
                curveToRelative(-1.12f, 1.29f, -1.68f, 2.6f, -1.71f, 4.34f)
                close()
            }
        }.also { _VolumeSlash = it}
