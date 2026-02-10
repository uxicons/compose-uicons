package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardBuyer: ImageVector? = null

val Icons.Br.CreditCardBuyer: ImageVector
    get() = _CreditCardBuyer ?: UXIcon(name = "CreditCardBuyer") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6.5f, 10f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            lineTo(3f, 8f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(3.05f, 5f)
            horizontalLineToRelative(17.9f)
            curveToRelative(-0.23f, -1.14f, -1.24f, -2f, -2.45f, -2f)
            lineTo(5.5f, 3f)
            curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
            close()
            moveTo(19f, 19f)
            curveToRelative(-2.28f, 0f, -4.22f, 1.4f, -4.93f, 3.36f)
            curveToRelative(-0.29f, 0.8f, 0.32f, 1.64f, 1.2f, 1.64f)
            horizontalLineToRelative(7.45f)
            curveToRelative(0.88f, 0f, 1.49f, -0.84f, 1.2f, -1.64f)
            curveToRelative(-0.71f, -1.96f, -2.65f, -3.36f, -4.93f, -3.36f)
            close()
            moveTo(22f, 15f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
            reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
            close()
        }
    }.also { _CreditCardBuyer = it }
