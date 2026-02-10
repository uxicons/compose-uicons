package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cat: ImageVector? = null

val Icons.Br.Cat: ImageVector
    get() = _Cat ?: UXIcon(name = "Cat") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 6.5f)
            lineTo(24f, 1.5f)
            curveToRelative(0f, -0.57f, -0.32f, -1.09f, -0.83f, -1.34f)
            curveToRelative(-0.51f, -0.25f, -1.12f, -0.2f, -1.57f, 0.14f)
            lineToRelative(-1.33f, 1.0f)
            curveToRelative(-0.56f, -0.19f, -1.15f, -0.3f, -1.77f, -0.3f)
            reflectiveCurveToRelative(-1.21f, 0.11f, -1.77f, 0.3f)
            lineToRelative(-1.33f, -1.0f)
            curveToRelative(-0.45f, -0.34f, -1.06f, -0.4f, -1.57f, -0.14f)
            curveToRelative(-0.51f, 0.25f, -0.83f, 0.77f, -0.83f, 1.34f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.7f, 0.14f, 1.37f, 0.38f, 1.99f)
            curveToRelative(-6.61f, 2.15f, -8.65f, 8.05f, -8.86f, 11.86f)
            curveToRelative(-0.86f, -0.54f, -1.52f, -1.38f, -1.52f, -2.33f)
            curveToRelative(0f, -1.85f, 0.48f, -2.82f, 0.98f, -3.85f)
            curveToRelative(0.48f, -0.97f, 1.02f, -2.07f, 1.02f, -3.68f)
            curveToRelative(0f, -2.01f, -1.21f, -3.78f, -3.0f, -4.42f)
            curveToRelative(-0.78f, -0.28f, -1.64f, 0.13f, -1.91f, 0.92f)
            curveToRelative(-0.28f, 0.78f, 0.13f, 1.64f, 0.92f, 1.91f)
            curveToRelative(0.6f, 0.21f, 1.0f, 0.85f, 1.0f, 1.58f)
            curveToRelative(0f, 0.92f, -0.3f, 1.52f, -0.71f, 2.35f)
            curveToRelative(-0.57f, 1.17f, -1.29f, 2.62f, -1.29f, 5.17f)
            curveToRelative(0f, 3.52f, 3.46f, 5.98f, 6.56f, 5.98f)
            horizontalLineToRelative(15.94f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-10.26f)
            curveToRelative(1.22f, -1.01f, 2f, -2.54f, 2f, -4.24f)
            close()
            moveTo(19f, 21f)
            horizontalLineToRelative(-2f)
            curveToRelative(0f, -2.61f, -1.68f, -5.09f, -4f, -5.91f)
            curveToRelative(-0.78f, -0.28f, -1.64f, 0.13f, -1.91f, 0.91f)
            curveToRelative(-0.28f, 0.78f, 0.13f, 1.64f, 0.91f, 1.91f)
            curveToRelative(1.12f, 0.4f, 2f, 1.75f, 2f, 3.09f)
            horizontalLineToRelative(-6.5f)
            curveToRelative(0.04f, -1.75f, 0.69f, -8.31f, 7.92f, -9.95f)
            curveToRelative(0.88f, 0.6f, 1.94f, 0.95f, 3.09f, 0.95f)
            curveToRelative(0.17f, 0f, 0.34f, -0.01f, 0.5f, -0.03f)
            verticalLineToRelative(9.03f)
            close()
            moveTo(18.5f, 9f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _Cat = it }
