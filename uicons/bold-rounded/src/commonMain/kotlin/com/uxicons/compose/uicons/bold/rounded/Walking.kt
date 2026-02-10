package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walking: ImageVector? = null

val Icons.Br.Walking: ImageVector
    get() = _Walking ?: UXIcon(name = "Walking") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(20.17f, 12.16f)
            lineToRelative(-2.62f, -1.31f)
            reflectiveCurveToRelative(-2.27f, -3.59f, -2.32f, -3.65f)
            curveToRelative(-0.67f, -0.76f, -1.62f, -1.2f, -2.63f, -1.2f)
            curveToRelative(-1.27f, 0f, -2.55f, 0.3f, -3.69f, 0.87f)
            lineToRelative(-2.53f, 1.26f)
            curveToRelative(-0.64f, 0.32f, -1.11f, 0.9f, -1.3f, 1.6f)
            lineToRelative(-0.63f, 2.39f)
            curveToRelative(-0.21f, 0.8f, 0.27f, 1.62f, 1.06f, 1.83f)
            curveToRelative(0.8f, 0.21f, 1.62f, -0.26f, 1.83f, -1.06f)
            lineToRelative(0.57f, -2.17f)
            lineToRelative(1.83f, -0.92f)
            lineToRelative(-0.66f, 2.83f)
            curveToRelative(-0.35f, 1.5f, 0.34f, 3.08f, 1.68f, 3.84f)
            lineToRelative(3.98f, 2.26f)
            curveToRelative(0.16f, 0.09f, 0.25f, 0.26f, 0.25f, 0.44f)
            verticalLineToRelative(3.34f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3.34f)
            curveToRelative(0f, -1.26f, -0.68f, -2.42f, -1.77f, -3.04f)
            lineToRelative(-2.72f, -1.55f)
            lineToRelative(0.85f, -3.17f)
            lineToRelative(0.88f, 1.39f)
            curveToRelative(0.15f, 0.23f, 0.35f, 0.42f, 0.6f, 0.54f)
            lineToRelative(3f, 1.5f)
            curveToRelative(0.22f, 0.11f, 0.44f, 0.16f, 0.67f, 0.16f)
            curveToRelative(0.55f, 0f, 1.08f, -0.3f, 1.34f, -0.83f)
            curveToRelative(0.37f, -0.74f, 0.07f, -1.64f, -0.67f, -2.01f)
            close()
            moveTo(9.86f, 17.62f)
            curveToRelative(-0.81f, -0.16f, -1.6f, 0.38f, -1.75f, 1.19f)
            lineToRelative(-0.04f, 0.2f)
            lineToRelative(-1.41f, 2.81f)
            curveToRelative(-0.37f, 0.74f, -0.07f, 1.64f, 0.67f, 2.01f)
            curveToRelative(0.21f, 0.11f, 0.44f, 0.16f, 0.67f, 0.16f)
            curveToRelative(0.55f, 0f, 1.08f, -0.3f, 1.34f, -0.83f)
            lineToRelative(1.5f, -3f)
            curveToRelative(0.06f, -0.12f, 0.11f, -0.25f, 0.13f, -0.39f)
            lineToRelative(0.08f, -0.4f)
            curveToRelative(0.16f, -0.81f, -0.38f, -1.6f, -1.19f, -1.75f)
            close()
        }
    }.also { _Walking = it }
