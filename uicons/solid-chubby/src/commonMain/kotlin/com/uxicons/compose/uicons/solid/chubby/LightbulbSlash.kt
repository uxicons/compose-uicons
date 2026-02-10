package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightbulbSlash: ImageVector? = null

val Icons.Sc.LightbulbSlash: ImageVector
    get() = _LightbulbSlash ?: UXIcon(name = "LightbulbSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 18f)
                curveToRelative(-2.12f, -0.01f, -4.2f, -0.72f, -4.3f, -0.75f)
                curveToRelative(-2.15f, -0.86f, -4.7f, -2.91f, -4.7f, -7.75f)
                curveToRelative(0f, -0.51f, 0.04f, -0.99f, 0.1f, -1.46f)
                lineToRelative(9.9f, 9.9f)
                curveToRelative(-0.33f, 0.03f, -0.66f, 0.06f, -0.99f, 0.06f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-1.45f, 0f, -2.91f, -0.3f, -3.85f, -0.54f)
                curveToRelative(0.03f, 0.31f, 0.06f, 0.63f, 0.1f, 0.91f)
                curveToRelative(0.19f, 1.3f, 1.2f, 2.32f, 2.5f, 2.53f)
                curveToRelative(0.41f, 0.07f, 0.83f, 0.1f, 1.25f, 0.1f)
                curveToRelative(0.41f, 0f, 0.82f, -0.03f, 1.22f, -0.1f)
                curveToRelative(1.23f, -0.2f, 2.18f, -1.1f, 2.45f, -2.29f)
                lineToRelative(-0.92f, -0.92f)
                curveToRelative(-0.82f, 0.16f, -1.78f, 0.3f, -2.75f, 0.3f)
                close()
                moveTo(22.56f, 20.44f)
                lineTo(18.24f, 16.12f)
                curveToRelative(1.5f, -1.2f, 2.76f, -3.22f, 2.76f, -6.62f)
                curveToRelative(0f, -5.4f, -3.28f, -8.5f, -9f, -8.5f)
                curveToRelative(-2.86f, 0f, -5.1f, 0.8f, -6.63f, 2.25f)
                lineToRelative(-1.81f, -1.81f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(19.0f, 19f)
                curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                close()
            }
        }.also { _LightbulbSlash = it}
