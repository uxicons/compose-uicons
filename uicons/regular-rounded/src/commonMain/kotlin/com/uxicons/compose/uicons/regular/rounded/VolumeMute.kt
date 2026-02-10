package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeMute: ImageVector? = null

val Icons.Rr.VolumeMute: ImageVector
    get() = _VolumeMute ?: UXIcon(name = "VolumeMute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.64f, 0.42f)
                curveToRelative(-0.23f, -0.19f, -0.53f, -0.27f, -0.82f, -0.21f)
                curveToRelative(-3.0f, 0.56f, -5.75f, 2.3f, -7.55f, 4.79f)
                horizontalLineToRelative(-0.27f)
                curveTo(2.24f, 5.0f, -0.0f, 7.24f, -0.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveTo(-0.0f, 16.76f, 2.24f, 19.0f, 5.0f, 19.0f)
                horizontalLineToRelative(0.27f)
                curveToRelative(1.8f, 2.5f, 4.55f, 4.24f, 7.55f, 4.79f)
                curveToRelative(0.06f, 0.01f, 0.12f, 0.02f, 0.18f, 0.02f)
                curveToRelative(0.23f, 0f, 0.46f, -0.08f, 0.64f, -0.23f)
                curveToRelative(0.23f, -0.19f, 0.36f, -0.47f, 0.36f, -0.77f)
                lineTo(14.0f, 1.19f)
                curveToRelative(0f, -0.3f, -0.13f, -0.58f, -0.36f, -0.77f)
                close()
                moveTo(12.0f, 21.54f)
                curveToRelative(-2.03f, -0.65f, -3.85f, -1.95f, -5.11f, -3.7f)
                lineToRelative(-0.3f, -0.41f)
                curveToRelative(-0.19f, -0.26f, -0.49f, -0.41f, -0.81f, -0.41f)
                horizontalLineToRelative(-0.78f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.78f)
                curveToRelative(0.32f, 0f, 0.62f, -0.15f, 0.81f, -0.41f)
                lineToRelative(0.3f, -0.41f)
                curveToRelative(1.26f, -1.75f, 3.08f, -3.05f, 5.11f, -3.7f)
                verticalLineToRelative(19.07f)
                close()
                moveTo(23.73f, 14.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-2.29f, -2.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(2.29f, 2.29f)
                close()
            }
        }.also { _VolumeMute = it}
