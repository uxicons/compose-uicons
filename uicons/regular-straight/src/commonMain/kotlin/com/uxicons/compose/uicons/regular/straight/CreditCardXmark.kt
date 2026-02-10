package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardXmark: ImageVector? = null

val Icons.Rs.CreditCardXmark: ImageVector
    get() = _CreditCardXmark ?: UXIcon(name = "CreditCardXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(8.35f)
                curveToRelative(-0.57f, -0.71f, -1.24f, -1.32f, -2f, -1.83f)
                verticalLineToRelative(-2.52f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(6.06f)
                curveToRelative(-0.04f, 0.33f, -0.06f, 0.66f, -0.06f, 1f)
                reflectiveCurveToRelative(0.02f, 0.67f, 0.06f, 1f)
                horizontalLineToRelative(-8.06f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(18.54f, 14.04f)
                lineTo(17f, 15.59f)
                lineTo(15.46f, 14.04f)
                lineTo(14.04f, 15.46f)
                lineTo(15.59f, 17f)
                lineTo(14.04f, 18.54f)
                lineTo(15.46f, 19.96f)
                lineTo(17f, 18.41f)
                lineTo(18.54f, 19.96f)
                lineTo(19.96f, 18.54f)
                lineTo(18.41f, 17f)
                lineTo(19.96f, 15.46f)
                close()
            }
        }.also { _CreditCardXmark = it}
