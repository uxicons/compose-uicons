package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OilTank: ImageVector? = null

val Icons.Br.OilTank: ImageVector
    get() = _OilTank ?: UXIcon(name = "OilTank") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(8f, 21.01f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
            moveTo(19f, 18.01f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
            close()
            moveTo(24f, 9f)
            curveToRelative(0f, 0.76f, -0.04f, 1.51f, -0.13f, 2.23f)
            curveToRelative(-0.32f, 2.72f, -2.67f, 4.78f, -5.45f, 4.78f)
            horizontalLineToRelative(-12.84f)
            curveToRelative(-2.78f, 0f, -5.13f, -2.05f, -5.45f, -4.78f)
            curveToRelative(-0.09f, -0.72f, -0.13f, -1.47f, -0.13f, -2.22f)
            reflectiveCurveToRelative(0.04f, -1.5f, 0.13f, -2.22f)
            curveToRelative(0.32f, -2.72f, 2.67f, -4.78f, 5.45f, -4.78f)
            horizontalLineToRelative(2.42f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(2.42f)
            curveToRelative(2.78f, 0f, 5.13f, 2.05f, 5.45f, 4.78f)
            curveToRelative(0.09f, 0.71f, 0.13f, 1.46f, 0.13f, 2.22f)
            close()
            moveTo(21f, 9f)
            curveToRelative(0f, -0.64f, -0.04f, -1.27f, -0.11f, -1.87f)
            curveToRelative(-0.14f, -1.22f, -1.21f, -2.13f, -2.47f, -2.13f)
            horizontalLineToRelative(-12.84f)
            curveToRelative(-1.26f, 0f, -2.33f, 0.92f, -2.47f, 2.13f)
            curveToRelative(-0.07f, 0.6f, -0.11f, 1.23f, -0.11f, 1.87f)
            reflectiveCurveToRelative(0.04f, 1.26f, 0.11f, 1.87f)
            curveToRelative(0.14f, 1.22f, 1.21f, 2.13f, 2.47f, 2.13f)
            horizontalLineToRelative(12.84f)
            curveToRelative(1.27f, 0f, 2.33f, -0.92f, 2.47f, -2.13f)
            curveToRelative(0.07f, -0.6f, 0.11f, -1.23f, 0.11f, -1.87f)
            close()
            moveTo(12.58f, 6.24f)
            curveToRelative(-0.32f, -0.32f, -0.83f, -0.32f, -1.15f, 0f)
            lineToRelative(-1.24f, 1.37f)
            curveToRelative(-1.0f, 1.0f, -1.0f, 2.63f, 0f, 3.64f)
            curveToRelative(0.5f, 0.5f, 1.16f, 0.75f, 1.82f, 0.75f)
            reflectiveCurveToRelative(1.32f, -0.25f, 1.82f, -0.75f)
            curveToRelative(1.0f, -1.0f, 1.0f, -2.63f, 0f, -3.64f)
            close()
            moveTo(13.5f, 18f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _OilTank = it }
