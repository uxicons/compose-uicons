package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraCctv: ImageVector? = null

val Icons.Sr.CameraCctv: ImageVector
    get() = _CameraCctv ?: UXIcon(name = "CameraCctv") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.3f, 11.08f)
                lineToRelative(1.31f, -1.02f)
                curveToRelative(0.26f, -0.2f, 0.41f, -0.53f, 0.39f, -0.86f)
                reflectiveCurveToRelative(-0.21f, -0.63f, -0.5f, -0.8f)
                lineTo(8.8f, 0.51f)
                curveTo(7.86f, -0.02f, 6.77f, -0.14f, 5.73f, 0.16f)
                curveToRelative(-1.03f, 0.3f, -1.89f, 0.98f, -2.4f, 1.93f)
                lineToRelative(-0.84f, 1.55f)
                curveToRelative(-1.03f, 1.9f, -0.34f, 4.32f, 1.53f, 5.38f)
                lineToRelative(5.66f, 3.3f)
                lineToRelative(-1.21f, 3.63f)
                curveToRelative(-0.41f, 1.23f, -1.55f, 2.05f, -2.85f, 2.05f)
                horizontalLineToRelative(-3.62f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.62f)
                curveToRelative(2.15f, 0f, 4.06f, -1.37f, 4.74f, -3.42f)
                lineToRelative(1.08f, -3.23f)
                lineToRelative(2.88f, 1.68f)
                curveToRelative(0.61f, 0.35f, 1.29f, 0.53f, 1.97f, 0.53f)
                curveToRelative(0.37f, 0f, 0.74f, -0.05f, 1.1f, -0.15f)
                curveToRelative(0.36f, -0.1f, 0.69f, -0.25f, 1.0f, -0.44f)
                lineToRelative(1.59f, 0.88f)
                curveToRelative(0.59f, 0.33f, 1.34f, 0.11f, 1.66f, -0.48f)
                lineToRelative(0.84f, -1.55f)
                curveToRelative(0.32f, -0.59f, 0.11f, -1.32f, -0.48f, -1.65f)
                lineToRelative(-1.14f, -0.63f)
                curveToRelative(0.12f, -0.18f, 0.26f, -0.33f, 0.43f, -0.46f)
                close()
            }
        }.also { _CameraCctv = it}
