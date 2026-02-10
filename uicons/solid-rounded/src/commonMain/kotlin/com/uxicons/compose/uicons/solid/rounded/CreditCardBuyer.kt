package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardBuyer: ImageVector? = null

val Icons.Sr.CreditCardBuyer: ImageVector
    get() = _CreditCardBuyer ?: UXIcon(name = "CreditCardBuyer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(21.5f, 15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(23.79f, 23.61f)
                curveToRelative(0.19f, -0.25f, 0.25f, -0.57f, 0.17f, -0.87f)
                curveToRelative(-0.59f, -2.2f, -2.63f, -3.74f, -4.97f, -3.74f)
                reflectiveCurveToRelative(-4.38f, 1.54f, -4.97f, 3.74f)
                curveToRelative(-0.08f, 0.3f, -0.02f, 0.62f, 0.17f, 0.87f)
                curveToRelative(0.19f, 0.25f, 0.48f, 0.39f, 0.79f, 0.39f)
                horizontalLineToRelative(8f)
                curveToRelative(0.31f, 0f, 0.6f, -0.14f, 0.79f, -0.39f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.79f, -0.2f, 1.53f, -0.53f, 2.2f)
                curveToRelative(-0.16f, -2.34f, -2.09f, -4.2f, -4.47f, -4.2f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                curveToRelative(0f, 0.93f, 0.28f, 1.78f, 0.76f, 2.5f)
                lineTo(5f, 18f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(24f)
                close()
                moveTo(6f, 13.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _CreditCardBuyer = it}
