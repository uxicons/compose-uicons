package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardXmark: ImageVector? = null

val Icons.Bs.CreditCardXmark: ImageVector
    get() = _CreditCardXmark ?: UXIcon(name = "CreditCardXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 10f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24f, 12.72f)
                curveToRelative(-0.81f, -0.93f, -1.84f, -1.66f, -3f, -2.13f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7.59f)
                curveToRelative(-0.38f, 0.93f, -0.59f, 1.94f, -0.59f, 3f)
                horizontalLineToRelative(-10f)
                reflectiveCurveToRelative(0f, -14.5f, 0f, -14.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(9.22f)
                close()
                moveTo(3f, 5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-17f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(19.41f, 18f)
                lineTo(21.54f, 15.88f)
                lineTo(20.12f, 14.46f)
                lineTo(18f, 16.59f)
                lineTo(15.88f, 14.46f)
                lineTo(14.46f, 15.88f)
                lineTo(16.59f, 18f)
                lineTo(14.46f, 20.12f)
                lineTo(15.88f, 21.54f)
                lineTo(18f, 19.41f)
                lineTo(20.12f, 21.54f)
                lineTo(21.54f, 20.12f)
                close()
            }
        }.also { _CreditCardXmark = it}
