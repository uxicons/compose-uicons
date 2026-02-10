package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardEye: ImageVector? = null

val Icons.Ss.CreditCardEye: ImageVector
    get() = _CreditCardEye ?: UXIcon(name = "CreditCardEye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 15f)
                curveToRelative(-3.98f, 0f, -5.9f, 3.09f, -6.39f, 4.04f)
                lineToRelative(-0.24f, 0.46f)
                lineToRelative(0.24f, 0.46f)
                curveToRelative(0.49f, 0.95f, 2.41f, 4.04f, 6.39f, 4.04f)
                reflectiveCurveToRelative(5.9f, -3.09f, 6.39f, -4.04f)
                lineToRelative(0.24f, -0.46f)
                lineToRelative(-0.24f, -0.46f)
                curveToRelative(-0.49f, -0.95f, -2.41f, -4.04f, -6.39f, -4.04f)
                close()
                moveTo(17f, 21.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(0f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                lineTo(0f, 7f)
                close()
                moveTo(0f, 9f)
                verticalLineToRelative(11f)
                lineTo(8.0f, 20f)
                lineToRelative(0.84f, -1.88f)
                curveToRelative(0.62f, -1.2f, 3.05f, -5.12f, 8.16f, -5.12f)
                curveToRelative(3.49f, 0f, 5.73f, 1.83f, 7f, 3.37f)
                verticalLineToRelative(-7.37f)
                lineTo(0f, 9f)
                close()
                moveTo(5.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _CreditCardEye = it}
