package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ubuntu: ImageVector? = null

val Icons.Brand.Ubuntu: ImageVector
    get() = _Ubuntu ?: UXIcon(name = "Ubuntu") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
            curveToRelative(0f, 6.63f, 5.37f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
            curveTo(24f, 5.37f, 18.63f, 0f, 12f, 0f)
            close()
            moveTo(14.55f, 4.5f)
            curveToRelative(0.43f, -0.74f, 1.37f, -0.99f, 2.11f, -0.56f)
            curveToRelative(0.74f, 0.43f, 0.99f, 1.37f, 0.56f, 2.11f)
            curveToRelative(-0.43f, 0.74f, -1.37f, 0.99f, -2.11f, 0.56f)
            curveTo(14.38f, 6.18f, 14.12f, 5.24f, 14.55f, 4.5f)
            close()
            moveTo(4.23f, 13.54f)
            curveToRelative(-0.85f, 0f, -1.54f, -0.69f, -1.54f, -1.54f)
            curveToRelative(0f, -0.85f, 0.69f, -1.54f, 1.54f, -1.54f)
            curveToRelative(0.85f, 0f, 1.54f, 0.69f, 1.54f, 1.54f)
            curveTo(5.77f, 12.85f, 5.08f, 13.54f, 4.23f, 13.54f)
            close()
            moveTo(5.59f, 13.69f)
            curveToRelative(0.49f, -0.4f, 0.81f, -1.01f, 0.81f, -1.69f)
            curveToRelative(0f, -0.68f, -0.32f, -1.29f, -0.81f, -1.69f)
            curveTo(6.01f, 8.72f, 7.0f, 7.37f, 8.32f, 6.48f)
            lineTo(9.47f, 8.4f)
            curveTo(8.34f, 9.2f, 7.6f, 10.51f, 7.6f, 12f)
            curveToRelative(0f, 1.49f, 0.74f, 2.81f, 1.87f, 3.6f)
            lineToRelative(-1.15f, 1.92f)
            curveTo(7.0f, 16.63f, 6.01f, 15.28f, 5.59f, 13.69f)
            close()
            moveTo(16.66f, 20.07f)
            curveToRelative(-0.74f, 0.43f, -1.68f, 0.17f, -2.11f, -0.56f)
            curveToRelative(-0.43f, -0.74f, -0.17f, -1.68f, 0.56f, -2.11f)
            curveToRelative(0.74f, -0.43f, 1.68f, -0.17f, 2.11f, 0.56f)
            curveTo(17.65f, 18.7f, 17.39f, 19.64f, 16.66f, 20.07f)
            close()
            moveTo(16.67f, 16.7f)
            curveToRelative(-0.59f, -0.23f, -1.28f, -0.2f, -1.87f, 0.14f)
            curveToRelative(-0.59f, 0.34f, -0.96f, 0.92f, -1.06f, 1.55f)
            curveToRelative(-0.56f, 0.15f, -1.14f, 0.23f, -1.74f, 0.23f)
            curveToRelative(-1.06f, 0f, -2.05f, -0.25f, -2.94f, -0.69f)
            lineToRelative(1.09f, -1.95f)
            curveTo(10.71f, 16.25f, 11.34f, 16.4f, 12f, 16.4f)
            curveToRelative(2.3f, 0f, 4.18f, -1.76f, 4.38f, -4.01f)
            lineToRelative(2.23f, 0.04f)
            curveTo(18.51f, 14.1f, 17.79f, 15.6f, 16.67f, 16.7f)
            close()
            moveTo(16.38f, 11.61f)
            curveTo(16.18f, 9.36f, 14.3f, 7.6f, 12f, 7.6f)
            curveToRelative(-0.66f, 0f, -1.29f, 0.15f, -1.85f, 0.41f)
            lineTo(9.06f, 6.06f)
            curveTo(9.95f, 5.62f, 10.94f, 5.37f, 12f, 5.37f)
            curveToRelative(0.6f, 0f, 1.19f, 0.08f, 1.74f, 0.23f)
            curveTo(13.84f, 6.23f, 14.21f, 6.81f, 14.8f, 7.15f)
            curveToRelative(0.59f, 0.34f, 1.28f, 0.37f, 1.87f, 0.14f)
            curveToRelative(1.12f, 1.11f, 1.84f, 2.61f, 1.95f, 4.28f)
            lineTo(16.38f, 11.61f)
            close()
        }
    }.also { _Ubuntu = it }
