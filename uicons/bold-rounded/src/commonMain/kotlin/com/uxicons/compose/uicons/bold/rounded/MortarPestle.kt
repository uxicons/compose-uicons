package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MortarPestle: ImageVector? = null

val Icons.Br.MortarPestle: ImageVector
    get() = _MortarPestle ?: UXIcon(name = "MortarPestle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6f, 20f)
            curveToRelative(0f, 0.49f, -0.35f, 0.94f, -0.8f, 1.03f)
            curveToRelative(-0.69f, 0.14f, -1.21f, 0.74f, -1.21f, 1.47f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(13f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.73f, -0.52f, -1.33f, -1.21f, -1.47f)
            curveToRelative(-0.45f, -0.09f, -0.8f, -0.54f, -0.8f, -1.03f)
            curveToRelative(0f, -0.51f, 0.83f, -0.93f, 0.86f, -0.95f)
            curveToRelative(1.83f, -1.29f, 4.19f, -3.49f, 5.02f, -6.67f)
            curveToRelative(0.28f, -1.06f, 0.05f, -2.16f, -0.62f, -3.03f)
            reflectiveCurveToRelative(-1.68f, -1.36f, -2.77f, -1.36f)
            horizontalLineToRelative(-1.73f)
            reflectiveCurveToRelative(4.5f, -3.72f, 4.5f, -3.72f)
            curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0f, -3.54f)
            reflectiveCurveToRelative(-2.56f, -0.98f, -3.54f, 0f)
            lineToRelative(-6.0f, 7.26f)
            lineToRelative(-10.23f, 0.01f)
            curveToRelative(-1.09f, 0f, -2.1f, 0.5f, -2.77f, 1.36f)
            reflectiveCurveToRelative(-0.89f, 1.97f, -0.62f, 3.03f)
            curveToRelative(0.83f, 3.16f, 3.19f, 5.36f, 5.03f, 6.66f)
            curveToRelative(0.04f, 0.03f, 0.86f, 0.41f, 0.86f, 0.95f)
            moveToRelative(14.98f, -8.38f)
            curveToRelative(-0.47f, 1.78f, -1.81f, 3.53f, -3.8f, 4.94f)
            curveToRelative(-1.27f, 0.75f, -1.82f, 1.67f, -2.04f, 2.44f)
            horizontalLineToRelative(-6.29f)
            curveToRelative(-0.23f, -0.77f, -0.78f, -1.69f, -2.04f, -2.44f)
            curveToRelative(-1.42f, -1.01f, -3.21f, -2.67f, -3.8f, -4.92f)
            curveToRelative(-0.06f, -0.21f, 0.03f, -0.36f, 0.09f, -0.44f)
            curveToRelative(0.06f, -0.07f, 0.18f, -0.2f, 0.4f, -0.2f)
            lineToRelative(16.99f, -0.01f)
            curveToRelative(0.21f, 0f, 0.34f, 0.12f, 0.4f, 0.2f)
            curveToRelative(0.06f, 0.07f, 0.14f, 0.23f, 0.09f, 0.44f)
            close()
        }
    }.also { _MortarPestle = it }
