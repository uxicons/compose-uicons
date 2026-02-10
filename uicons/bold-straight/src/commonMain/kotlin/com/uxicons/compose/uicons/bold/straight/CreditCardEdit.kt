package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardEdit: ImageVector? = null

val Icons.Bs.CreditCardEdit: ImageVector
    get() = _CreditCardEdit ?: UXIcon(name = "CreditCardEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 16f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23.36f, 3.73f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                reflectiveCurveToRelative(-2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-7.28f, 7.28f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3.09f)
                close()
                moveTo(20.8f, 9.11f)
                curveToRelative(0.12f, 0.09f, 0.2f, 0.23f, 0.2f, 0.39f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(5.09f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -0.99f, -0.41f, -1.88f, -1.07f, -2.51f)
                close()
            }
        }.also { _CreditCardEdit = it}
