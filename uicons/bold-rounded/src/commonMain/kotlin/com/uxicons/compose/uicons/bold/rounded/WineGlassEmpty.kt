package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassEmpty: ImageVector? = null

val Icons.Br.WineGlassEmpty: ImageVector
    get() = _WineGlassEmpty ?: UXIcon(name = "WineGlassEmpty") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.5f, 0f)
            horizontalLineToRelative(-7f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(5.23f)
            curveToRelative(0f, 3.99f, 2.82f, 7.39f, 6.5f, 8.12f)
            verticalLineToRelative(3.15f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-3.14f)
            curveToRelative(1.52f, -0.29f, 2.93f, -1.01f, 4.07f, -2.12f)
            curveToRelative(1.57f, -1.52f, 2.43f, -3.56f, 2.43f, -5.74f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(17f, 10f)
            curveToRelative(0f, 1.36f, -0.54f, 2.64f, -1.52f, 3.59f)
            curveToRelative(-0.98f, 0.95f, -2.27f, 1.43f, -3.64f, 1.41f)
            curveToRelative(-2.67f, -0.08f, -4.84f, -2.44f, -4.84f, -5.27f)
            verticalLineToRelative(-5.23f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            close()
        }
    }.also { _WineGlassEmpty = it }
