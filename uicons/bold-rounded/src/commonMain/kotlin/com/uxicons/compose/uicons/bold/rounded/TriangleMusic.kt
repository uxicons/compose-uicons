package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleMusic: ImageVector? = null

val Icons.Br.TriangleMusic: ImageVector
    get() = _TriangleMusic ?: UXIcon(name = "TriangleMusic") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.38f, 21.48f)
            curveToRelative(-0.88f, 1.58f, -2.48f, 2.52f, -4.28f, 2.52f)
            lineTo(4.9f, 24f)
            curveToRelative(-1.8f, 0f, -3.4f, -0.94f, -4.28f, -2.52f)
            reflectiveCurveToRelative(-0.83f, -3.43f, 0.12f, -4.96f)
            lineToRelative(7.62f, -11.51f)
            curveToRelative(0.5f, -0.8f, 1.25f, -1.41f, 2.13f, -1.73f)
            verticalLineToRelative(-1.77f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.78f)
            curveToRelative(0.33f, 0.12f, 0.65f, 0.29f, 0.94f, 0.49f)
            curveToRelative(0.68f, 0.47f, 0.85f, 1.4f, 0.38f, 2.09f)
            curveToRelative(-0.47f, 0.68f, -1.4f, 0.85f, -2.09f, 0.38f)
            curveToRelative(-0.22f, -0.15f, -0.47f, -0.23f, -0.75f, -0.23f)
            curveToRelative(-0.2f, 0f, -0.75f, 0.07f, -1.1f, 0.63f)
            lineToRelative(-7.62f, 11.51f)
            curveToRelative(-0.34f, 0.56f, -0.36f, 1.28f, -0.02f, 1.89f)
            curveToRelative(0.34f, 0.61f, 0.96f, 0.98f, 1.66f, 0.98f)
            horizontalLineToRelative(14.19f)
            curveToRelative(0.7f, 0f, 1.32f, -0.36f, 1.66f, -0.98f)
            curveToRelative(0.34f, -0.61f, 0.32f, -1.33f, -0.05f, -1.92f)
            lineToRelative(-1.84f, -2.77f)
            curveToRelative(-0.46f, -0.69f, -0.27f, -1.62f, 0.42f, -2.08f)
            curveToRelative(0.69f, -0.46f, 1.62f, -0.27f, 2.08f, 0.42f)
            lineToRelative(1.86f, 2.81f)
            curveToRelative(0.98f, 1.57f, 1.02f, 3.42f, 0.14f, 5.0f)
            close()
            moveTo(13f, 13f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            curveToRelative(0f, -0.53f, -0.14f, -1.02f, -0.38f, -1.46f)
            lineToRelative(6.16f, -10.27f)
            curveToRelative(0.43f, -0.71f, 0.2f, -1.63f, -0.51f, -2.06f)
            curveToRelative(-0.71f, -0.43f, -1.63f, -0.2f, -2.06f, 0.52f)
            lineToRelative(-6.16f, 10.27f)
            curveToRelative(-0.02f, 0f, -0.03f, -0.0f, -0.05f, -0.0f)
            close()
        }
    }.also { _TriangleMusic = it }
