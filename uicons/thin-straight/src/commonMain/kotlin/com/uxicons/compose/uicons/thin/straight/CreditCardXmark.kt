package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardXmark: ImageVector? = null

val Icons.Ts.CreditCardXmark: ImageVector
    get() = _CreditCardXmark ?: UXIcon(name = "CreditCardXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 13f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(6f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-19f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(9.03f)
                curveToRelative(-0.01f, -0.17f, -0.03f, -0.33f, -0.03f, -0.5f)
                reflectiveCurveToRelative(0.02f, -0.33f, 0.03f, -0.5f)
                horizontalLineToRelative(-8.03f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(5.03f)
                curveToRelative(0.36f, 0.31f, 0.69f, 0.64f, 1f, 1.0f)
                verticalLineToRelative(-9.53f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 23f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(20.2f, 15.51f)
                lineTo(18.21f, 17.5f)
                lineTo(20.2f, 19.49f)
                lineTo(19.49f, 20.2f)
                lineTo(17.5f, 18.21f)
                lineTo(15.51f, 20.2f)
                lineTo(14.8f, 19.49f)
                lineTo(16.79f, 17.5f)
                lineTo(14.8f, 15.51f)
                lineTo(15.51f, 14.8f)
                lineTo(17.5f, 16.79f)
                lineTo(19.49f, 14.8f)
                close()
            }
        }.also { _CreditCardXmark = it}
