package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardBuyer: ImageVector? = null

val Icons.Bs.CreditCardBuyer: ImageVector
    get() = _CreditCardBuyer ?: UXIcon(name = "CreditCardBuyer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 10f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, -2.04f, -1.24f, -3.8f, -3f, -4.58f)
                verticalLineToRelative(-2.42f)
                lineTo(3f, 8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(11f)
                curveToRelative(0f, 1.13f, 0.39f, 2.16f, 1.02f, 3f)
                lineTo(0f, 18f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(3f, 5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _CreditCardBuyer = it}
