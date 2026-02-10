package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Images: ImageVector? = null

val Icons.Br.Images: ImageVector
    get() = _Images ?: UXIcon(name = "Images") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 6.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(10.5f, 16f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(5f, 5.5f)
            curveTo(5f, 2.47f, 7.47f, 0f, 10.5f, 0f)
            horizontalLineToRelative(8f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(8f, 10.5f)
            curveToRelative(0f, 1f, 0.59f, 1.86f, 1.43f, 2.26f)
            lineToRelative(4.28f, -4.28f)
            curveToRelative(0.62f, -0.62f, 1.64f, -0.62f, 2.26f, 0f)
            lineToRelative(1.04f, 1.04f)
            curveToRelative(0.62f, 0.62f, 1.64f, 0.62f, 2.26f, 0f)
            lineToRelative(1.72f, -1.72f)
            verticalLineToRelative(-2.29f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(10.5f, 3.01f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(5f)
            close()
            moveTo(17.55f, 18.02f)
            curveToRelative(-0.8f, -0.16f, -1.6f, 0.36f, -1.76f, 1.18f)
            lineToRelative(-0.02f, 0.11f)
            curveToRelative(-0.17f, 0.57f, -0.55f, 1.05f, -1.07f, 1.35f)
            curveToRelative(-0.54f, 0.3f, -1.16f, 0.38f, -1.75f, 0.22f)
            lineToRelative(-8.25f, -2.26f)
            curveToRelative(-1.22f, -0.34f, -1.95f, -1.61f, -1.61f, -2.84f)
            lineToRelative(0.51f, -1.88f)
            curveToRelative(0.22f, -0.8f, -0.26f, -1.62f, -1.06f, -1.84f)
            curveToRelative(-0.8f, -0.22f, -1.62f, 0.26f, -1.84f, 1.06f)
            lineToRelative(-0.51f, 1.88f)
            curveToRelative(-0.38f, 1.37f, -0.2f, 2.8f, 0.5f, 4.03f)
            curveToRelative(0.7f, 1.23f, 1.84f, 2.12f, 3.21f, 2.49f)
            lineToRelative(8.25f, 2.26f)
            curveToRelative(0.47f, 0.13f, 0.94f, 0.19f, 1.41f, 0.19f)
            curveToRelative(0.91f, 0f, 1.81f, -0.24f, 2.62f, -0.7f)
            curveToRelative(1.23f, -0.7f, 2.12f, -1.84f, 2.49f, -3.21f)
            curveToRelative(0f, -0.03f, 0.06f, -0.27f, 0.06f, -0.27f)
            curveToRelative(0.16f, -0.81f, -0.36f, -1.6f, -1.18f, -1.76f)
            close()
        }
    }.also { _Images = it }
