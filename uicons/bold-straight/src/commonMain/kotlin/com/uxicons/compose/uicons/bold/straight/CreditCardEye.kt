package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardEye: ImageVector? = null

val Icons.Bs.CreditCardEye: ImageVector
    get() = _CreditCardEye ?: UXIcon(name = "CreditCardEye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(11.8f)
                curveToRelative(-0.73f, -0.85f, -1.72f, -1.73f, -3f, -2.37f)
                verticalLineToRelative(-4.93f)
                lineTo(3f, 9.0f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7.28f)
                curveToRelative(-0.96f, 1.04f, -1.55f, 2.07f, -1.82f, 2.61f)
                lineToRelative(-0.19f, 0.39f)
                lineTo(0f, 19.0f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                lineTo(20.5f, 1f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(21f, 6f)
                close()
                moveTo(23.75f, 19.5f)
                curveToRelative(-0.58f, 1.17f, -2.59f, 4.5f, -6.75f, 4.5f)
                reflectiveCurveToRelative(-6.17f, -3.34f, -6.75f, -4.5f)
                curveToRelative(0.58f, -1.17f, 2.59f, -4.5f, 6.75f, -4.5f)
                reflectiveCurveToRelative(6.17f, 3.33f, 6.75f, 4.5f)
                close()
                moveTo(19f, 19.5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _CreditCardEye = it}
