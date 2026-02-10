package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferralUser: ImageVector? = null

val Icons.Br.ReferralUser: ImageVector
    get() = _ReferralUser ?: UXIcon(name = "ReferralUser") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 3f)
            curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            close()
            moveTo(16f, 16f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
            reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
            close()
            moveTo(19f, 20f)
            curveToRelative(-2.15f, 0f, -4.01f, 1.13f, -4.91f, 2.78f)
            curveToRelative(-0.3f, 0.56f, 0.16f, 1.22f, 0.84f, 1.22f)
            horizontalLineToRelative(8.12f)
            curveToRelative(0.69f, 0f, 1.15f, -0.66f, 0.84f, -1.22f)
            curveToRelative(-0.9f, -1.65f, -2.75f, -2.78f, -4.91f, -2.78f)
            close()
            moveTo(14.94f, 11f)
            horizontalLineToRelative(8.12f)
            curveToRelative(0.69f, 0f, 1.15f, -0.66f, 0.84f, -1.22f)
            curveToRelative(-0.9f, -1.65f, -2.75f, -2.78f, -4.91f, -2.78f)
            reflectiveCurveToRelative(-4.01f, 1.13f, -4.91f, 2.78f)
            curveToRelative(-0.3f, 0.56f, 0.16f, 1.22f, 0.84f, 1.22f)
            close()
            moveTo(10.27f, 14.55f)
            curveToRelative(-0.47f, -0.47f, -1.27f, -0.13f, -1.27f, 0.53f)
            verticalLineToRelative(1.92f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-5f)
            curveTo(2.47f, 4f, 0f, 6.47f, 0f, 9.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(1.92f)
            curveToRelative(0f, 0.66f, 0.8f, 1.0f, 1.27f, 0.53f)
            lineToRelative(3.54f, -3.49f)
            curveToRelative(0.26f, -0.25f, 0.26f, -0.67f, 0f, -0.92f)
            lineToRelative(-3.54f, -3.49f)
            close()
        }
    }.also { _ReferralUser = it }
