package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Couch: ImageVector? = null

val Icons.Br.Couch: ImageVector
    get() = _Couch ?: UXIcon(name = "Couch") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 8.05f)
            verticalLineToRelative(-1.55f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(7.5f, 1f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(1.55f)
            curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.7f, 0.78f, 3.23f, 2f, 4.24f)
            verticalLineToRelative(1.76f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.53f)
            curveToRelative(0.17f, 0.01f, 0.33f, 0.03f, 0.5f, 0.03f)
            horizontalLineToRelative(13f)
            curveToRelative(0.17f, 0f, 0.34f, -0.01f, 0.5f, -0.03f)
            verticalLineToRelative(0.53f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.76f)
            curveToRelative(1.22f, -1.01f, 2f, -2.54f, 2f, -4.24f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
            close()
            moveTo(5f, 6.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(6.5f)
            lineTo(5f, 13f)
            verticalLineToRelative(-6.5f)
            close()
            moveTo(18.5f, 18f)
            lineTo(5.5f, 18f)
            curveToRelative(-1.23f, 0f, -2.26f, -0.9f, -2.46f, -2.07f)
            curveToRelative(0.13f, 0.04f, 0.32f, 0.07f, 0.46f, 0.07f)
            horizontalLineToRelative(17f)
            curveToRelative(0.14f, 0f, 0.33f, -0.04f, 0.46f, -0.07f)
            curveToRelative(-0.2f, 1.18f, -1.23f, 2.07f, -2.46f, 2.07f)
            close()
        }
    }.also { _Couch = it }
