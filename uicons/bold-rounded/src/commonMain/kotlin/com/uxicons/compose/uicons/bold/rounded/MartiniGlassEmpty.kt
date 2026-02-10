package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MartiniGlassEmpty: ImageVector? = null

val Icons.Br.MartiniGlassEmpty: ImageVector
    get() = _MartiniGlassEmpty ?: UXIcon(name = "MartiniGlassEmpty") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.75f, 2.28f)
            curveToRelative(-0.54f, -1.38f, -1.84f, -2.28f, -3.31f, -2.28f)
            lineTo(3.56f, 0f)
            curveTo(2.09f, 0f, 0.79f, 0.9f, 0.25f, 2.28f)
            curveToRelative(-0.52f, 1.33f, -0.19f, 2.81f, 0.87f, 3.79f)
            lineToRelative(7.78f, 7.19f)
            curveToRelative(0.48f, 0.43f, 1.02f, 0.75f, 1.6f, 0.95f)
            verticalLineToRelative(6.79f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-6.79f)
            curveToRelative(0.58f, -0.2f, 1.13f, -0.52f, 1.61f, -0.96f)
            lineToRelative(7.8f, -7.21f)
            curveToRelative(1.03f, -0.96f, 1.36f, -2.43f, 0.84f, -3.76f)
            close()
            moveTo(20.84f, 3.86f)
            lineToRelative(-7.76f, 7.17f)
            curveToRelative(-0.62f, 0.56f, -1.55f, 0.56f, -2.15f, 0.01f)
            lineTo(3.13f, 3.84f)
            curveToRelative(-0.05f, -0.04f, -0.2f, -0.18f, -0.09f, -0.47f)
            curveToRelative(0.03f, -0.09f, 0.17f, -0.37f, 0.52f, -0.37f)
            horizontalLineToRelative(16.88f)
            curveToRelative(0.35f, 0f, 0.48f, 0.28f, 0.52f, 0.37f)
            curveToRelative(0.11f, 0.28f, -0.04f, 0.42f, -0.12f, 0.49f)
            close()
        }
    }.also { _MartiniGlassEmpty = it }
