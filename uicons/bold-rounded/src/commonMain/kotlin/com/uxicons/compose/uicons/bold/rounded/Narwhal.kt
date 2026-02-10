package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Narwhal: ImageVector? = null

val Icons.Br.Narwhal: ImageVector
    get() = _Narwhal ?: UXIcon(name = "Narwhal") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 16.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(21.42f, 10.13f)
            lineTo(23.98f, 0.76f)
            curveToRelative(0.07f, -0.26f, -0.04f, -0.54f, -0.28f, -0.68f)
            curveToRelative(-0.29f, -0.17f, -0.66f, -0.07f, -0.82f, 0.21f)
            lineToRelative(-4.72f, 8.01f)
            curveToRelative(-0.69f, -0.19f, -1.4f, -0.3f, -2.15f, -0.3f)
            lineToRelative(-1.51f, -0.0f)
            curveToRelative(-0.17f, 0f, -4.13f, 0.05f, -9.0f, 4.38f)
            curveToRelative(-0.62f, 0.55f, -0.68f, 1.5f, -0.12f, 2.12f)
            curveToRelative(0.55f, 0.62f, 1.5f, 0.68f, 2.12f, 0.12f)
            curveToRelative(3.94f, -3.51f, 6.99f, -3.62f, 7.0f, -3.62f)
            lineToRelative(1.51f, 0.0f)
            curveToRelative(2.75f, 0.0f, 4.99f, 2.25f, 4.99f, 5.0f)
            reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
            horizontalLineToRelative(-6.45f)
            curveToRelative(-3.61f, 0f, -6.55f, -2.94f, -6.55f, -6.55f)
            curveToRelative(0f, -2.29f, 0.67f, -4.5f, 1.94f, -6.41f)
            lineToRelative(1.76f, -2.64f)
            curveToRelative(2.19f, -0.49f, 3.91f, -2.27f, 4.29f, -4.5f)
            curveToRelative(0.09f, -0.51f, -0.36f, -0.96f, -0.87f, -0.9f)
            curveToRelative(-3.48f, 0.38f, -4.62f, 2.76f, -4.62f, 2.76f)
            curveTo(5.5f, 2.77f, 4.32f, 0.39f, 0.88f, 0.01f)
            curveTo(0.37f, -0.05f, -0.08f, 0.4f, 0.01f, 0.91f)
            curveToRelative(0.32f, 1.88f, 1.6f, 3.44f, 3.3f, 4.17f)
            lineToRelative(-0.87f, 1.3f)
            curveTo(0.84f, 8.78f, 0f, 11.57f, 0f, 14.45f)
            curveToRelative(0f, 5.27f, 4.28f, 9.55f, 9.55f, 9.55f)
            horizontalLineToRelative(6.45f)
            curveToRelative(4.41f, 0f, 8.0f, -3.59f, 8.0f, -8.0f)
            curveToRelative(0f, -2.32f, -1f, -4.41f, -2.58f, -5.87f)
            close()
        }
    }.also { _Narwhal = it }
