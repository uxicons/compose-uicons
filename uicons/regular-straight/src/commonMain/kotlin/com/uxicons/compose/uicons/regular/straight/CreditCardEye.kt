package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardEye: ImageVector? = null

val Icons.Rs.CreditCardEye: ImageVector
    get() = _CreditCardEye ?: UXIcon(name = "CreditCardEye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23.41f, 19.04f)
                lineToRelative(0.24f, 0.46f)
                lineToRelative(-0.24f, 0.46f)
                curveToRelative(-0.49f, 0.95f, -2.41f, 4.04f, -6.41f, 4.04f)
                reflectiveCurveToRelative(-5.92f, -3.09f, -6.41f, -4.04f)
                lineToRelative(-0.24f, -0.46f)
                lineToRelative(0.24f, -0.46f)
                curveToRelative(0.49f, -0.95f, 2.42f, -4.04f, 6.41f, -4.04f)
                reflectiveCurveToRelative(5.92f, 3.09f, 6.41f, 4.04f)
                close()
                moveTo(21.37f, 19.5f)
                curveToRelative(-0.64f, -1.0f, -1.99f, -2.5f, -4.37f, -2.5f)
                reflectiveCurveToRelative(-3.73f, 1.5f, -4.37f, 2.5f)
                curveToRelative(0.64f, 1.0f, 1.99f, 2.5f, 4.37f, 2.5f)
                reflectiveCurveToRelative(3.74f, -1.5f, 4.37f, -2.5f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(11.35f)
                curveToRelative(-0.51f, -0.61f, -1.17f, -1.26f, -2f, -1.83f)
                verticalLineToRelative(-5.52f)
                lineTo(2f, 9.0f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(6.88f)
                curveToRelative(-0.02f, 0.04f, -0.04f, 0.08f, -0.06f, 0.11f)
                lineToRelative(-1.04f, 1.89f)
                lineTo(0f, 20.0f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                lineTo(22f, 7f)
                close()
                moveTo(17f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _CreditCardEye = it}
