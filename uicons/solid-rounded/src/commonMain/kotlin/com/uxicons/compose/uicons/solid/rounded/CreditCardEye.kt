package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardEye: ImageVector? = null

val Icons.Sr.CreditCardEye: ImageVector
    get() = _CreditCardEye ?: UXIcon(name = "CreditCardEye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.61f, 18.26f)
                curveToRelative(-0.85f, -1.22f, -2.77f, -3.26f, -6.11f, -3.26f)
                reflectiveCurveToRelative(-5.26f, 2.04f, -6.11f, 3.26f)
                curveToRelative(-0.52f, 0.75f, -0.52f, 1.72f, 0f, 2.48f)
                curveToRelative(0.85f, 1.22f, 2.77f, 3.26f, 6.11f, 3.26f)
                reflectiveCurveToRelative(5.26f, -2.04f, 6.11f, -3.26f)
                curveToRelative(0.52f, -0.75f, 0.52f, -1.72f, 0f, -2.48f)
                close()
                moveTo(17.5f, 21.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(24f, 7f)
                lineTo(0f, 7f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(9.75f, 17.12f)
                curveToRelative(1.07f, -1.54f, 3.5f, -4.12f, 7.75f, -4.12f)
                curveToRelative(3.0f, 0f, 5.09f, 1.29f, 6.44f, 2.58f)
                curveToRelative(0.02f, -0.19f, 0.06f, -0.39f, 0.06f, -0.58f)
                verticalLineToRelative(-6f)
                lineTo(0f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4.03f)
                curveToRelative(-0.12f, -0.99f, 0.11f, -2.01f, 0.72f, -2.88f)
                close()
                moveTo(5.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _CreditCardEye = it}
