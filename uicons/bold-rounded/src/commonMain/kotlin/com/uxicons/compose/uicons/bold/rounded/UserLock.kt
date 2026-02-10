package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLock: ImageVector? = null

val Icons.Br.UserLock: ImageVector
    get() = _UserLock ?: UXIcon(name = "UserLock") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(8f, 0f)
            curveTo(4.69f, 0f, 2f, 2.69f, 2f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(11.31f, 0f, 8f, 0f)
            close()
            moveTo(8f, 9f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            close()
            moveTo(10.96f, 16.02f)
            curveToRelative(-0.19f, 0.81f, -1.0f, 1.3f, -1.8f, 1.11f)
            curveToRelative(-0.38f, -0.09f, -0.76f, -0.13f, -1.16f, -0.13f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
            curveToRelative(0.62f, 0f, 1.24f, 0.07f, 1.84f, 0.21f)
            curveToRelative(0.81f, 0.19f, 1.31f, 1.0f, 1.11f, 1.8f)
            close()
            moveTo(23f, 15.77f)
            verticalLineToRelative(-2.27f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(2.27f)
            curveToRelative(-0.61f, 0.55f, -1f, 1.35f, -1f, 2.23f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.89f, -0.39f, -1.69f, -1f, -2.23f)
            close()
            moveTo(18.5f, 12f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(18.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _UserLock = it }
