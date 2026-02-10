package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonRays: ImageVector? = null

val Icons.Br.PersonRays: ImageVector
    get() = _PersonRays ?: UXIcon(name = "PersonRays") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(17.5f, 10.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.56f, -0.8f, 2.93f, -2f, 3.74f)
            verticalLineToRelative(5.26f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5.26f)
            curveToRelative(-1.21f, -0.81f, -2f, -2.18f, -2f, -3.74f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            horizontalLineToRelative(2f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            close()
            moveTo(9.5f, 13.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3f)
            close()
            moveTo(3.44f, 18.44f)
            lineTo(0.44f, 21.44f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            reflectiveCurveToRelative(1.53f, 0.59f, 2.12f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(-1.53f, -0.59f, -2.12f, 0f)
            close()
            moveTo(19.5f, 6f)
            curveToRelative(0.38f, 0f, 0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(3f, -3f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            close()
            moveTo(20.56f, 18.44f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            reflectiveCurveToRelative(-0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(3f, 3f)
            curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
            reflectiveCurveToRelative(0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(-3f, -3f)
            close()
            moveTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.02f, -0.15f, 0.44f, 0.44f)
            curveTo(-0.15f, 1.02f, -0.15f, 1.98f, 0.44f, 2.56f)
            lineToRelative(3f, 3f)
            curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            lineTo(2.56f, 0.44f)
            close()
        }
    }.also { _PersonRays = it }
