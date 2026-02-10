package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarShooting: ImageVector? = null

val Icons.Br.StarShooting: ImageVector
    get() = _StarShooting ?: UXIcon(name = "StarShooting") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 2.56f)
            lineToRelative(-9f, 9f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            lineTo(21.44f, 0.44f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            reflectiveCurveToRelative(0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(8.5f, 9f)
            curveToRelative(0.38f, 0f, 0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(4f, -4f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(-1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            close()
            moveTo(19.44f, 10.44f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(4f, -4f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(-1.53f, -0.59f, -2.12f, 0f)
            close()
            moveTo(11.92f, 15f)
            horizontalLineToRelative(-3.25f)
            lineToRelative(-1.15f, -3.09f)
            curveToRelative(-0.16f, -0.42f, -0.56f, -0.7f, -1.01f, -0.7f)
            reflectiveCurveToRelative(-0.86f, 0.28f, -1.01f, 0.7f)
            lineToRelative(-1.15f, 3.09f)
            lineTo(1.08f, 15f)
            curveToRelative(-0.45f, 0f, -0.86f, 0.28f, -1.02f, 0.71f)
            curveToRelative(-0.16f, 0.43f, -0.03f, 0.91f, 0.32f, 1.2f)
            lineToRelative(2.58f, 2.1f)
            lineToRelative(-1.02f, 3.27f)
            curveToRelative(-0.14f, 0.44f, 0.02f, 0.92f, 0.38f, 1.19f)
            curveToRelative(0.19f, 0.14f, 0.42f, 0.22f, 0.65f, 0.22f)
            curveToRelative(0.21f, 0f, 0.42f, -0.06f, 0.6f, -0.18f)
            lineToRelative(2.93f, -1.96f)
            lineToRelative(2.98f, 1.94f)
            curveToRelative(0.39f, 0.25f, 0.89f, 0.23f, 1.25f, -0.05f)
            curveToRelative(0.36f, -0.28f, 0.51f, -0.76f, 0.37f, -1.2f)
            lineToRelative(-1.06f, -3.23f)
            lineToRelative(2.56f, -2.09f)
            curveToRelative(0.35f, -0.29f, 0.48f, -0.77f, 0.32f, -1.2f)
            curveToRelative(-0.16f, -0.43f, -0.56f, -0.71f, -1.02f, -0.71f)
            close()
        }
    }.also { _StarShooting = it }
