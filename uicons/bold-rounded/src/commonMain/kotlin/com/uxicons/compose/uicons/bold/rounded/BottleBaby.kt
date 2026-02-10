package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BottleBaby: ImageVector? = null

val Icons.Br.BottleBaby: ImageVector
    get() = _BottleBaby ?: UXIcon(name = "BottleBaby") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.9f, 9.53f)
            lineToRelative(-0.9f, -1.03f)
            reflectiveCurveToRelative(0f, -0.01f, 0f, -0.01f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-0.87f)
            curveToRelative(0.23f, -1.34f, 0.37f, -2.57f, 0.37f, -3f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
            curveToRelative(0f, 0.43f, 0.14f, 1.66f, 0.37f, 3f)
            horizontalLineToRelative(-0.87f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(1f)
            reflectiveCurveToRelative(0f, 0.01f, 0f, 0.01f)
            lineToRelative(-0.9f, 1.03f)
            curveToRelative(-1.36f, 1.54f, -2.09f, 3.56f, -2.1f, 5.6f)
            verticalLineToRelative(3.37f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(5f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-3.37f)
            curveToRelative(0f, -2.06f, -0.75f, -4.05f, -2.1f, -5.6f)
            close()
            moveTo(17f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(7.45f, 13f)
            curveToRelative(0.23f, -0.54f, 0.53f, -1.05f, 0.92f, -1.49f)
            lineToRelative(1.32f, -1.51f)
            horizontalLineToRelative(4.64f)
            lineToRelative(1.32f, 1.51f)
            curveToRelative(0.88f, 1.0f, 1.36f, 2.29f, 1.36f, 3.62f)
            verticalLineToRelative(3.37f)
            close()
        }
    }.also { _BottleBaby = it }
