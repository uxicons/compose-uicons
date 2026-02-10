package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardCheck: ImageVector? = null

val Icons.Sr.CreditCardCheck: ImageVector
    get() = _CreditCardCheck ?: UXIcon(name = "CreditCardCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.0f, 12.01f)
                curveToRelative(-3.31f, 0f, -6.0f, 2.68f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.68f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.68f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.68f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(21.52f, 17.51f)
                lineTo(18.61f, 20.42f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.58f, -1.41f, 0.58f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.03f, -0.21f, -1.41f, -0.59f)
                lineToRelative(-1.3f, -1.3f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.3f, 1.3f)
                lineToRelative(2.91f, -2.91f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(19.99f, 0f)
                horizontalLineToRelative(-15.99f)
                curveToRelative(-2.21f, 0f, -4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(23.98f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(17.92f, 10.01f)
                curveToRelative(2.39f, 0f, 4.61f, 1.05f, 6.07f, 2.72f)
                verticalLineToRelative(-5.74f)
                horizontalLineToRelative(-23.98f)
                verticalLineToRelative(6.99f)
                curveToRelative(0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                lineToRelative(5.92f, 0.02f)
                curveToRelative(0f, -4.42f, 3.58f, -7.99f, 7.99f, -7.99f)
                close()
                moveTo(5.5f, 13.99f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _CreditCardCheck = it}
