package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardEye: ImageVector? = null

val Icons.Br.CreditCardEye: ImageVector
    get() = _CreditCardEye ?: UXIcon(name = "CreditCardEye") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 11f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(24f, 6.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3.5f)
            lineTo(3f, 9f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 6.5f)
            curveTo(0f, 3.47f, 2.47f, 1f, 5.5f, 1f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(3.05f, 6f)
            lineTo(20.95f, 6f)
            curveToRelative(-0.23f, -1.14f, -1.24f, -2f, -2.45f, -2f)
            lineTo(5.5f, 4f)
            curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
            close()
            moveTo(23.34f, 18.76f)
            curveToRelative(0.28f, 0.46f, 0.28f, 1.03f, 0f, 1.48f)
            curveToRelative(-0.9f, 1.45f, -2.87f, 3.76f, -6.34f, 3.76f)
            reflectiveCurveToRelative(-5.44f, -2.31f, -6.34f, -3.76f)
            curveToRelative(-0.28f, -0.46f, -0.28f, -1.03f, 0f, -1.48f)
            curveToRelative(0.9f, -1.45f, 2.87f, -3.76f, 6.34f, -3.76f)
            reflectiveCurveToRelative(5.44f, 2.31f, 6.34f, 3.76f)
            close()
            moveTo(19f, 19.5f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            close()
        }
    }.also { _CreditCardEye = it }
