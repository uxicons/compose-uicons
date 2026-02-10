package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoBaby: ImageVector? = null

val Icons.Br.NoBaby: ImageVector
    get() = _NoBaby ?: UXIcon(name = "NoBaby") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10f, 6f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            close()
            moveTo(24f, 12f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
            reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(12f, 3f)
            curveToRelative(-1.94f, 0f, -3.73f, 0.62f, -5.21f, 1.67f)
            lineToRelative(3.37f, 3.37f)
            lineToRelative(1.87f, 0.83f)
            lineToRelative(4.41f, -1.76f)
            curveToRelative(0.77f, -0.31f, 1.64f, 0.07f, 1.95f, 0.83f)
            curveToRelative(0.31f, 0.77f, -0.07f, 1.64f, -0.84f, 1.95f)
            lineToRelative(-2.56f, 1.02f)
            verticalLineToRelative(1.96f)
            lineToRelative(4.33f, 4.33f)
            curveToRelative(1.05f, -1.47f, 1.67f, -3.27f, 1.67f, -5.21f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            close()
            moveTo(12f, 21f)
            curveToRelative(1.94f, 0f, 3.73f, -0.62f, 5.21f, -1.67f)
            lineToRelative(-12.54f, -12.53f)
            curveToRelative(-1.05f, 1.47f, -1.67f, 3.27f, -1.67f, 5.21f)
            curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
            close()
            moveTo(8.56f, 13.52f)
            lineTo(7.54f, 14.35f)
            curveToRelative(-0.44f, 0.37f, -0.63f, 0.96f, -0.49f, 1.52f)
            lineToRelative(0.5f, 2f)
            curveToRelative(0.2f, 0.81f, 1.04f, 1.29f, 1.82f, 1.09f)
            curveToRelative(0.8f, -0.2f, 1.29f, -1.02f, 1.09f, -1.82f)
            lineToRelative(-0.27f, -1.09f)
            lineToRelative(0.51f, -0.4f)
            close()
        }
    }.also { _NoBaby = it }
