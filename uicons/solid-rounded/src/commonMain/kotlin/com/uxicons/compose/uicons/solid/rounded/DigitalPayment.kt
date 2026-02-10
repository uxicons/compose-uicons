package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DigitalPayment: ImageVector? = null

val Icons.Sr.DigitalPayment: ImageVector
    get() = _DigitalPayment ?: UXIcon(name = "DigitalPayment") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(11f)
                lineTo(16f, 16f)
                lineTo(16f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(12.23f, 7.81f)
                lineToRelative(-3.13f, 3.36f)
                curveToRelative(-0.54f, 0.54f, -1.23f, 0.82f, -1.96f, 0.82f)
                reflectiveCurveToRelative(-1.41f, -0.28f, -1.93f, -0.8f)
                lineToRelative(-1.43f, -1.43f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.43f, 1.43f)
                curveToRelative(0.28f, 0.28f, 0.76f, 0.28f, 1.03f, 0f)
                lineToRelative(3.1f, -3.33f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.43f, 1.41f, -0.05f)
                curveToRelative(0.4f, 0.38f, 0.43f, 1.01f, 0.05f, 1.41f)
                close()
                moveTo(0f, 18.0f)
                verticalLineToRelative(1.5f)
                curveTo(0f, 21.98f, 2.02f, 24.0f, 4.5f, 24.0f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                lineTo(0f, 18.0f)
                close()
                moveTo(9f, 22.0f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(24f, 7f)
                horizontalLineToRelative(-6f)
                lineTo(18f, 3f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _DigitalPayment = it}
