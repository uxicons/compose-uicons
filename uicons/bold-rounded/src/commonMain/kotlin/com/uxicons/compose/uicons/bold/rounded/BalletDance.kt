package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BalletDance: ImageVector? = null

val Icons.Br.BalletDance: ImageVector
    get() = _BalletDance ?: UXIcon(name = "BalletDance") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.92f, 12.44f)
            lineToRelative(-8.36f, 2.4f)
            curveToRelative(-0.78f, 0.49f, -1.64f, 0.95f, -2.56f, 1.37f)
            verticalLineToRelative(6.28f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5.16f)
            curveToRelative(-3.44f, 1.01f, -6.28f, 0.86f, -6.88f, -0.56f)
            curveToRelative(-0.61f, -1.43f, 1.24f, -3.71f, 4.34f, -5.64f)
            curveTo(3.77f, 8.18f, 1.69f, 4.66f, 1.04f, 1.83f)
            curveTo(0.85f, 1.03f, 1.36f, 0.22f, 2.17f, 0.04f)
            curveToRelative(0.81f, -0.18f, 1.61f, 0.32f, 1.8f, 1.13f)
            curveToRelative(0.29f, 1.27f, 1.1f, 3.01f, 2.29f, 4.83f)
            horizontalLineToRelative(4.58f)
            curveToRelative(1.16f, -1.83f, 1.91f, -3.56f, 2.2f, -4.83f)
            curveToRelative(0.22f, -0.96f, 1.31f, -1.48f, 2.23f, -0.95f)
            curveToRelative(0.58f, 0.33f, 0.83f, 1.01f, 0.68f, 1.66f)
            curveToRelative(-0.5f, 2.15f, -1.77f, 4.66f, -3.47f, 7.02f)
            curveToRelative(-0.22f, 0.31f, -0.23f, 0.73f, 0f, 1.04f)
            curveToRelative(0.0f, 0.01f, 0.01f, 0.01f, 0.01f, 0.02f)
            curveToRelative(0.35f, 0.47f, 1.04f, 0.48f, 1.4f, 0.02f)
            curveToRelative(0.41f, -0.54f, 0.87f, -1.23f, 1.1f, -1.91f)
            curveToRelative(2.0f, -0.19f, 3.47f, 0.19f, 3.88f, 1.17f)
            curveToRelative(0.16f, 0.38f, 0.14f, 0.82f, -0.02f, 1.29f)
            lineToRelative(3.21f, -0.94f)
            curveToRelative(0.79f, -0.23f, 1.63f, 0.22f, 1.86f, 1.02f)
            curveToRelative(0.23f, 0.79f, -0.22f, 1.63f, -1.02f, 1.86f)
            close()
            moveTo(8.5f, 5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
        }
    }.also { _BalletDance = it }
