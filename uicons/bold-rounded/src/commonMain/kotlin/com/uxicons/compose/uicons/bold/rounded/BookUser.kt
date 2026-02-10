package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookUser: ImageVector? = null

val Icons.Br.BookUser: ImageVector
    get() = _BookUser ?: UXIcon(name = "BookUser") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13f, 7f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            close()
            moveTo(12.13f, 12.77f)
            curveToRelative(0.11f, 0.15f, 0.29f, 0.23f, 0.47f, 0.23f)
            horizontalLineToRelative(4.8f)
            curveToRelative(0.19f, 0f, 0.36f, -0.09f, 0.47f, -0.23f)
            curveToRelative(0.11f, -0.15f, 0.15f, -0.34f, 0.11f, -0.52f)
            curveToRelative(-0.34f, -1.3f, -1.59f, -2.25f, -2.98f, -2.25f)
            reflectiveCurveToRelative(-2.65f, 0.95f, -2.98f, 2.25f)
            curveToRelative(-0.05f, 0.18f, -0.01f, 0.37f, 0.11f, 0.52f)
            close()
            moveTo(23f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            lineTo(1f, 5.5f)
            curveTo(1f, 2.47f, 3.47f, 0f, 6.5f, 0f)
            horizontalLineToRelative(11f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(17.5f, 3f)
            horizontalLineToRelative(-7.5f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(10f)
            lineTo(20f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(4f, 5.5f)
            verticalLineToRelative(9.76f)
            curveToRelative(0.47f, -0.17f, 0.97f, -0.26f, 1.5f, -0.26f)
            horizontalLineToRelative(1.5f)
            lineTo(7f, 3f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            close()
            moveTo(20f, 18.5f)
            verticalLineToRelative(-0.5f)
            lineTo(5.5f, 18f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(12f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _BookUser = it }
