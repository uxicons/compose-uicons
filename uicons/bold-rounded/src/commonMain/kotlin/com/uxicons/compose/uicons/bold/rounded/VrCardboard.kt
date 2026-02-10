package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VrCardboard: ImageVector? = null

val Icons.Br.VrCardboard: ImageVector
    get() = _VrCardboard ?: UXIcon(name = "VrCardboard") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 3f)
            lineTo(5.5f, 3f)
            curveTo(2.47f, 3f, 0f, 5.47f, 0f, 8.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(1.85f)
            curveToRelative(1.24f, 0f, 2.4f, -0.67f, 3.02f, -1.74f)
            lineToRelative(1.19f, -2.04f)
            curveToRelative(0.13f, -0.22f, 0.33f, -0.25f, 0.44f, -0.25f)
            reflectiveCurveToRelative(0.31f, 0.03f, 0.44f, 0.25f)
            lineToRelative(1.19f, 2.04f)
            curveToRelative(0.62f, 1.07f, 1.78f, 1.74f, 3.02f, 1.74f)
            horizontalLineToRelative(1.85f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 15.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-1.85f)
            curveToRelative(-0.18f, 0f, -0.34f, -0.1f, -0.43f, -0.25f)
            lineToRelative(-1.19f, -2.04f)
            curveToRelative(-0.64f, -1.09f, -1.77f, -1.74f, -3.03f, -1.74f)
            reflectiveCurveToRelative(-2.39f, 0.65f, -3.03f, 1.74f)
            lineToRelative(-1.19f, 2.04f)
            curveToRelative(-0.09f, 0.15f, -0.26f, 0.25f, -0.43f, 0.25f)
            horizontalLineToRelative(-1.85f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(7f)
            close()
            moveTo(19f, 10.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(10f, 10.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
        }
    }.also { _VrCardboard = it }
