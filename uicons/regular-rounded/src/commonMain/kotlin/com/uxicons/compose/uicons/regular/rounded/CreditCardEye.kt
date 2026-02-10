package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCardEye: ImageVector? = null

val Icons.Rr.CreditCardEye: ImageVector
    get() = _CreditCardEye ?: UXIcon(name = "CreditCardEye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23.61f, 20.74f)
                curveToRelative(-0.85f, 1.22f, -2.77f, 3.26f, -6.11f, 3.26f)
                reflectiveCurveToRelative(-5.26f, -2.04f, -6.11f, -3.26f)
                curveToRelative(-0.52f, -0.75f, -0.52f, -1.72f, 0f, -2.48f)
                curveToRelative(0.85f, -1.22f, 2.77f, -3.26f, 6.11f, -3.26f)
                reflectiveCurveToRelative(5.26f, 2.04f, 6.11f, 3.26f)
                curveToRelative(0.52f, 0.75f, 0.52f, 1.73f, 0f, 2.48f)
                close()
                moveTo(21.97f, 19.41f)
                curveToRelative(-0.76f, -1.1f, -2.16f, -2.4f, -4.47f, -2.4f)
                reflectiveCurveToRelative(-3.71f, 1.31f, -4.47f, 2.4f)
                curveToRelative(-0.04f, 0.06f, -0.04f, 0.13f, 0f, 0.19f)
                curveToRelative(0.76f, 1.1f, 2.16f, 2.4f, 4.47f, 2.4f)
                reflectiveCurveToRelative(3.71f, -1.31f, 4.47f, -2.4f)
                curveToRelative(0.04f, -0.06f, 0.04f, -0.13f, 0f, -0.19f)
                close()
                moveTo(9.0f, 19.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(-0.0f, 7f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                lineTo(2f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(2f, 7f)
                lineTo(22f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                close()
                moveTo(17.5f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _CreditCardEye = it}
