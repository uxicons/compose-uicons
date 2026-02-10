package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeMute: ImageVector? = null

val Icons.Br.VolumeMute: ImageVector
    get() = _VolumeMute ?: UXIcon(name = "VolumeMute") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.6f, 13.44f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-1.44f, -1.44f)
            lineToRelative(-1.44f, 1.44f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            lineToRelative(1.44f, -1.44f)
            lineToRelative(-1.44f, -1.44f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            lineToRelative(1.44f, 1.44f)
            lineToRelative(1.44f, -1.44f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            lineToRelative(-1.44f, 1.44f)
            lineToRelative(1.44f, 1.44f)
            close()
            moveTo(13.46f, 0.34f)
            curveToRelative(0.34f, 0.28f, 0.55f, 0.71f, 0.55f, 1.16f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 0.45f, -0.2f, 0.87f, -0.55f, 1.16f)
            curveToRelative(-0.27f, 0.22f, -0.61f, 0.34f, -0.95f, 0.34f)
            curveToRelative(-0.1f, 0f, -0.19f, -0.01f, -0.28f, -0.03f)
            curveToRelative(-3.21f, -0.62f, -5.27f, -2.71f, -6.6f, -4.47f)
            horizontalLineToRelative(-0.62f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            horizontalLineToRelative(0.25f)
            curveTo(7.17f, 2.19f, 9.45f, 0.56f, 12.22f, 0.03f)
            curveToRelative(0.44f, -0.09f, 0.89f, 0.03f, 1.24f, 0.32f)
            close()
            moveTo(11f, 3.59f)
            curveToRelative(-1.36f, 0.7f, -2.55f, 1.91f, -3.66f, 3.7f)
            curveToRelative(-0.27f, 0.44f, -0.76f, 0.71f, -1.28f, 0.71f)
            horizontalLineToRelative(-1.06f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(1.39f)
            curveToRelative(0.49f, 0f, 0.95f, 0.24f, 1.23f, 0.64f)
            curveToRelative(1.1f, 1.57f, 2.19f, 2.63f, 3.39f, 3.26f)
            lineTo(11.0f, 3.59f)
            close()
        }
    }.also { _VolumeMute = it }
