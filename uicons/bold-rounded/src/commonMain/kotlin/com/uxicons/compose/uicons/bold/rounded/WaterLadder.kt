package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterLadder: ImageVector? = null

val Icons.Br.WaterLadder: ImageVector
    get() = _WaterLadder ?: UXIcon(name = "WaterLadder") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(5.5f, 18f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(20f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(0.5f)
            lineTo(7f, 6f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(17f, 9f)
            verticalLineToRelative(3f)
            lineTo(7f, 12f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(10f)
            close()
            moveTo(23.8f, 21.35f)
            curveToRelative(0.41f, 0.72f, 0.17f, 1.63f, -0.55f, 2.05f)
            curveToRelative(-0.68f, 0.4f, -1.46f, 0.6f, -2.25f, 0.6f)
            curveToRelative(-0.98f, 0f, -1.98f, -0.32f, -2.8f, -0.9f)
            curveToRelative(-0.13f, -0.09f, -0.28f, -0.09f, -0.41f, 0f)
            curveToRelative(-1.64f, 1.17f, -3.96f, 1.17f, -5.59f, 0f)
            curveToRelative(-0.13f, -0.09f, -0.28f, -0.09f, -0.41f, 0f)
            curveToRelative(-1.64f, 1.17f, -3.96f, 1.17f, -5.59f, 0f)
            curveToRelative(-0.13f, -0.09f, -0.28f, -0.09f, -0.41f, 0f)
            curveToRelative(-1.48f, 1.05f, -3.52f, 1.19f, -5.05f, 0.3f)
            curveToRelative(-0.72f, -0.42f, -0.96f, -1.33f, -0.54f, -2.05f)
            curveToRelative(0.42f, -0.72f, 1.33f, -0.96f, 2.05f, -0.54f)
            curveToRelative(0.53f, 0.31f, 1.26f, 0.23f, 1.81f, -0.15f)
            curveToRelative(1.16f, -0.83f, 2.72f, -0.82f, 3.88f, 0f)
            curveToRelative(0.62f, 0.44f, 1.49f, 0.44f, 2.12f, 0f)
            curveToRelative(1.16f, -0.83f, 2.72f, -0.82f, 3.88f, 0f)
            curveToRelative(0.62f, 0.44f, 1.49f, 0.44f, 2.12f, 0f)
            curveToRelative(1.16f, -0.83f, 2.72f, -0.82f, 3.88f, 0f)
            curveToRelative(0.54f, 0.38f, 1.27f, 0.46f, 1.81f, 0.15f)
            curveToRelative(0.71f, -0.41f, 1.64f, -0.17f, 2.05f, 0.55f)
            close()
        }
    }.also { _WaterLadder = it }
