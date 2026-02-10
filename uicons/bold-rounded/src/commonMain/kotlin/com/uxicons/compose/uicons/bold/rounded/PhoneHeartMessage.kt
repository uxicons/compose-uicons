package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneHeartMessage: ImageVector? = null

val Icons.Br.PhoneHeartMessage: ImageVector
    get() = _PhoneHeartMessage ?: UXIcon(name = "PhoneHeartMessage") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 18f)
            lineTo(3f, 18f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.61f, 0f, 1.2f, 0.22f, 1.65f, 0.62f)
            curveToRelative(0.62f, 0.55f, 1.57f, 0.49f, 2.12f, -0.13f)
            reflectiveCurveToRelative(0.49f, -1.57f, -0.13f, -2.12f)
            curveToRelative(-1.0f, -0.89f, -2.3f, -1.38f, -3.64f, -1.38f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(6f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            close()
            moveTo(9f, 22f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            close()
            moveTo(21.5f, 5.0f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.38f, -0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
            lineToRelative(0.0f, 7.41f)
            curveToRelative(0f, 0.86f, 0.95f, 1.38f, 1.67f, 0.92f)
            lineToRelative(2.83f, -1.83f)
            horizontalLineToRelative(3f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-4.0f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(19.61f, 12.02f)
            curveToRelative(-0.36f, 0.3f, -0.87f, 0.3f, -1.23f, 0f)
            curveToRelative(-0.88f, -0.72f, -2.38f, -2.15f, -2.38f, -3.37f)
            curveToRelative(0f, -0.91f, 0.67f, -1.65f, 1.5f, -1.65f)
            reflectiveCurveToRelative(1.5f, 0.74f, 1.5f, 1.65f)
            curveToRelative(0f, -0.91f, 0.67f, -1.65f, 1.5f, -1.65f)
            reflectiveCurveToRelative(1.5f, 0.74f, 1.5f, 1.65f)
            curveToRelative(0f, 1.23f, -1.51f, 2.65f, -2.38f, 3.37f)
            close()
        }
    }.also { _PhoneHeartMessage = it }
