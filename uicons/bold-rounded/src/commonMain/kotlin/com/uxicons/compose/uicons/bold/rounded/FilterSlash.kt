package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterSlash: ImageVector? = null

val Icons.Br.FilterSlash: ImageVector
    get() = _FilterSlash ?: UXIcon(name = "FilterSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.56f, 21.44f)
            lineToRelative(-6.13f, -6.13f)
            lineToRelative(2.86f, -2.93f)
            curveToRelative(1.1f, -1.15f, 1.71f, -2.66f, 1.71f, -4.25f)
            curveToRelative(0f, -3.38f, -2.75f, -6.12f, -6.12f, -6.12f)
            horizontalLineToRelative(-7.75f)
            curveToRelative(-1.11f, 0f, -2.19f, 0.31f, -3.13f, 0.87f)
            lineTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.02f, -0.15f, 0.44f, 0.44f)
            curveTo(-0.15f, 1.02f, -0.15f, 1.98f, 0.44f, 2.56f)
            lineTo(21.44f, 23.56f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            close()
            moveTo(8.12f, 5f)
            horizontalLineToRelative(7.75f)
            curveToRelative(1.72f, 0f, 3.12f, 1.4f, 3.12f, 3.12f)
            curveToRelative(0f, 0.81f, -0.31f, 1.58f, -0.87f, 2.16f)
            lineToRelative(-2.83f, 2.9f)
            lineTo(7.26f, 5.14f)
            curveToRelative(0.28f, -0.08f, 0.57f, -0.14f, 0.87f, -0.14f)
            close()
            moveTo(16f, 21.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.55f, -0.3f, 1.05f, -0.77f, 1.31f)
            curveToRelative(-0.23f, 0.12f, -0.48f, 0.19f, -0.73f, 0.19f)
            curveToRelative(-0.28f, 0f, -0.55f, -0.08f, -0.8f, -0.23f)
            lineToRelative(-4f, -2.5f)
            curveToRelative(-0.44f, -0.27f, -0.7f, -0.76f, -0.7f, -1.27f)
            verticalLineToRelative(-2.19f)
            lineTo(3.53f, 12.4f)
            curveToRelative(-0.68f, -0.71f, -1.18f, -1.55f, -1.46f, -2.45f)
            curveToRelative(-0.25f, -0.79f, 0.19f, -1.63f, 0.98f, -1.88f)
            curveToRelative(0.79f, -0.25f, 1.63f, 0.19f, 1.88f, 0.98f)
            curveToRelative(0.14f, 0.46f, 0.4f, 0.89f, 0.73f, 1.24f)
            lineToRelative(5.89f, 5.82f)
            curveToRelative(0.28f, 0.28f, 0.45f, 0.67f, 0.45f, 1.07f)
            verticalLineToRelative(1.99f)
            lineToRelative(1.7f, 1.06f)
            curveToRelative(0.23f, -0.15f, 0.51f, -0.23f, 0.8f, -0.23f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _FilterSlash = it }
