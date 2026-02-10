package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudExclamation: ImageVector? = null

val Icons.Br.CloudExclamation: ImageVector
    get() = _CloudExclamation ?: UXIcon(name = "CloudExclamation") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13f, 10.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(11.5f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(17.81f, 5.92f)
            curveToRelative(-0.15f, -0.03f, -0.27f, -0.12f, -0.32f, -0.24f)
            curveTo(15.9f, 2.33f, 12.23f, 0.47f, 8.56f, 1.14f)
            curveToRelative(-3.35f, 0.61f, -5.97f, 3.29f, -6.53f, 6.65f)
            curveToRelative(-0.17f, 0.99f, -0.15f, 1.99f, 0.03f, 2.95f)
            curveToRelative(0.02f, 0.1f, -0.05f, 0.25f, -0.16f, 0.35f)
            curveToRelative(-1.19f, 1.08f, -1.9f, 2.73f, -1.9f, 4.4f)
            curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            curveToRelative(0f, -0.82f, 0.36f, -1.68f, 0.92f, -2.18f)
            curveToRelative(0.89f, -0.81f, 1.31f, -2.02f, 1.09f, -3.15f)
            curveToRelative(-0.12f, -0.61f, -0.13f, -1.25f, -0.02f, -1.89f)
            curveToRelative(0.35f, -2.09f, 2.04f, -3.81f, 4.11f, -4.19f)
            curveToRelative(2.37f, -0.44f, 4.66f, 0.72f, 5.68f, 2.88f)
            curveToRelative(0.47f, 0.99f, 1.36f, 1.68f, 2.45f, 1.9f)
            curveToRelative(2.19f, 0.44f, 3.78f, 2.39f, 3.78f, 4.64f)
            curveToRelative(0f, 2.76f, -2.03f, 5.13f, -4.71f, 5.51f)
            curveToRelative(-0.82f, 0.12f, -1.39f, 0.88f, -1.27f, 1.7f)
            curveToRelative(0.11f, 0.75f, 0.75f, 1.29f, 1.48f, 1.29f)
            curveToRelative(0.07f, 0f, 0.14f, -0.01f, 0.21f, -0.01f)
            curveToRelative(4.16f, -0.59f, 7.29f, -4.24f, 7.29f, -8.48f)
            curveToRelative(0f, -3.68f, -2.6f, -6.86f, -6.19f, -7.58f)
            close()
        }
    }.also { _CloudExclamation = it }
