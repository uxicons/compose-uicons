package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardEdit: ImageVector? = null

val Icons.Ss.CreditCardEdit: ImageVector
    get() = _CreditCardEdit ?: UXIcon(name = "CreditCardEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.26f, 0.74f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0f)
                lineToRelative(-6.67f, 6.67f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(6.67f, -6.67f)
                curveToRelative(0.98f, -0.94f, 0.98f, -2.65f, 0f, -3.59f)
                close()
                moveTo(11f, 6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                close()
                moveTo(23.31f, 7.11f)
                curveToRelative(0.42f, 0.52f, 0.69f, 1.17f, 0.69f, 1.89f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.58f)
                close()
                moveTo(0f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11f)
                close()
                moveTo(5.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _CreditCardEdit = it}
