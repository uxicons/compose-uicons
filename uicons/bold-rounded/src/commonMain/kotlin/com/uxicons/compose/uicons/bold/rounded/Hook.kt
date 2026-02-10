package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hook: ImageVector? = null

val Icons.Br.Hook: ImageVector
    get() = _Hook ?: UXIcon(name = "Hook") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20f, 16f)
            curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
            verticalLineToRelative(-2.11f)
            curveToRelative(0f, -0.79f, 0.96f, -1.19f, 1.52f, -0.63f)
            curveToRelative(0.36f, 0.35f, 0.83f, 0.82f, 1.09f, 1.23f)
            curveToRelative(0.24f, 0.27f, 0.39f, 0.62f, 0.39f, 1.0f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
            curveToRelative(0f, -1.82f, -0.99f, -3.5f, -2.59f, -4.38f)
            curveToRelative(-2.45f, -1.35f, -3.91f, -3.69f, -3.91f, -6.26f)
            verticalLineToRelative(-0.87f)
            curveToRelative(-0.6f, -0.46f, -1f, -1.17f, -1f, -1.99f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            curveToRelative(0f, 0.81f, -0.4f, 1.53f, -1f, 1.99f)
            verticalLineToRelative(0.87f)
            curveToRelative(0f, 1.46f, 0.88f, 2.82f, 2.36f, 3.63f)
            curveToRelative(2.56f, 1.41f, 4.14f, 4.09f, 4.14f, 7.01f)
            close()
        }
    }.also { _Hook = it }
