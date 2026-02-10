package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardCheck: ImageVector? = null

val Icons.Bs.CreditCardCheck: ImageVector
    get() = _CreditCardCheck ?: UXIcon(name = "CreditCardCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 10f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(9.22f)
                curveToRelative(-0.81f, -0.93f, -1.84f, -1.66f, -3f, -2.13f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7.59f)
                curveToRelative(-0.38f, 0.93f, -0.59f, 1.94f, -0.59f, 3f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(3f, 5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-17f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(22.36f, 16.74f)
                lineTo(20.96f, 15.31f)
                lineTo(17.35f, 19.02f)
                lineTo(15.13f, 16.72f)
                lineTo(13.74f, 18.16f)
                lineTo(15.93f, 20.43f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(3.61f, -3.7f)
                close()
            }
        }.also { _CreditCardCheck = it}
