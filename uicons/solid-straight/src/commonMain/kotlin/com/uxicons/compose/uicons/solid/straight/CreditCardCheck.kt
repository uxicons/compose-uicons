package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardCheck: ImageVector? = null

val Icons.Ss.CreditCardCheck: ImageVector
    get() = _CreditCardCheck ?: UXIcon(name = "CreditCardCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.62f, 20.41f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.41f, 0.59f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.04f, -0.21f, -1.41f, -0.59f)
                lineToRelative(-2.01f, -2.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(24f, 5f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
                moveTo(18f, 10f)
                curveToRelative(2.39f, 0f, 4.53f, 1.06f, 6f, 2.73f)
                verticalLineToRelative(-5.73f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(10f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                close()
                moveTo(5.5f, 14f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _CreditCardCheck = it}
