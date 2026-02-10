package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCameraAlt: ImageVector? = null

val Icons.Sc.VideoCameraAlt: ImageVector
    get() = _VideoCameraAlt ?: UXIcon(name = "VideoCameraAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 20f)
                curveToRelative(-4.65f, 0f, -7.03f, -0.97f, -7.13f, -1.01f)
                curveToRelative(-0.27f, -0.11f, -0.48f, -0.34f, -0.57f, -0.62f)
                curveToRelative(-0.03f, -0.1f, -0.8f, -2.53f, -0.8f, -6.37f)
                reflectiveCurveToRelative(0.77f, -6.27f, 0.8f, -6.37f)
                curveToRelative(0.09f, -0.28f, 0.3f, -0.51f, 0.57f, -0.62f)
                curveToRelative(0.1f, -0.04f, 2.49f, -1.01f, 7.13f, -1.01f)
                reflectiveCurveToRelative(7.03f, 0.97f, 7.13f, 1.01f)
                curveToRelative(0.27f, 0.11f, 0.48f, 0.34f, 0.57f, 0.62f)
                curveToRelative(0.03f, 0.1f, 0.8f, 2.53f, 0.8f, 6.37f)
                reflectiveCurveToRelative(-0.77f, 6.27f, -0.8f, 6.37f)
                curveToRelative(-0.09f, 0.28f, -0.3f, 0.51f, -0.57f, 0.62f)
                curveToRelative(-0.1f, 0.04f, -2.49f, 1.01f, -7.13f, 1.01f)
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
        }.also { _VideoCameraAlt = it}
