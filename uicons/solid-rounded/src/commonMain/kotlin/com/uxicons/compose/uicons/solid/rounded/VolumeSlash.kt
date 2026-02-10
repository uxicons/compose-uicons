package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeSlash: ImageVector? = null

val Icons.Sr.VolumeSlash: ImageVector
    get() = _VolumeSlash ?: UXIcon(name = "VolumeSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(4.63f, 4.63f)
                curveTo(8.14f, 2.46f, 10.84f, 0.76f, 13.83f, 0.21f)
                curveToRelative(0.29f, -0.06f, 0.59f, 0.03f, 0.82f, 0.21f)
                curveToRelative(0.23f, 0.19f, 0.36f, 0.47f, 0.36f, 0.77f)
                verticalLineToRelative(12.4f)
                lineToRelative(1.69f, 1.69f)
                curveToRelative(1.81f, -1.82f, 1.8f, -4.76f, -0.01f, -6.58f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(2.59f, 2.59f, 2.6f, 6.81f, 0.01f, 9.4f)
                lineToRelative(1.44f, 1.44f)
                curveToRelative(3.32f, -3.48f, 3.27f, -9.01f, -0.15f, -12.43f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(4.2f, 4.2f, 4.25f, 11.0f, 0.15f, 15.26f)
                lineToRelative(2.74f, 2.74f)
                close()
                moveTo(0.01f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(1.27f)
                curveToRelative(1.81f, 2.5f, 4.53f, 4.24f, 7.55f, 4.79f)
                curveToRelative(0.06f, 0.01f, 0.12f, 0.02f, 0.18f, 0.02f)
                curveToRelative(0.23f, 0f, 0.46f, -0.08f, 0.64f, -0.23f)
                curveToRelative(0.23f, -0.19f, 0.36f, -0.47f, 0.36f, -0.77f)
                verticalLineToRelative(-3.58f)
                lineTo(1.88f, 6.1f)
                curveTo(0.74f, 7.02f, 0.01f, 8.43f, 0.01f, 10f)
                close()
            }
        }.also { _VolumeSlash = it}
