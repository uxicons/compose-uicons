package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCard: ImageVector? = null

val Icons.Sc.CreditCard: ImageVector
    get() = _CreditCard ?: UXIcon(name = "CreditCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 9.3f)
                lineTo(1.15f, 9.3f)
                curveToRelative(-0.32f, 3.03f, -0.1f, 6.14f, 0.67f, 9.05f)
                curveToRelative(0.29f, 1.09f, 1.2f, 1.93f, 2.32f, 2.13f)
                curveToRelative(2.54f, 0.46f, 5.2f, 0.7f, 7.87f, 0.7f)
                reflectiveCurveToRelative(5.33f, -0.23f, 7.87f, -0.7f)
                reflectiveQuadToRelative(0f, 0f)
                curveToRelative(1.12f, -0.21f, 2.03f, -1.04f, 2.32f, -2.13f)
                curveToRelative(0.77f, -2.91f, 0.99f, -6.02f, 0.67f, -9.05f)
                close()
                moveTo(7.63f, 16.79f)
                curveToRelative(-1.37f, 0f, -2.49f, -1.12f, -2.49f, -2.49f)
                reflectiveCurveToRelative(1.12f, -2.49f, 2.49f, -2.49f)
                reflectiveCurveToRelative(2.49f, 1.12f, 2.49f, 2.49f)
                reflectiveCurveToRelative(-1.12f, 2.49f, -2.49f, 2.49f)
                close()
                moveTo(17.86f, 15.37f)
                horizontalLineToRelative(-3.31f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.31f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.19f, 5.65f)
                curveToRelative(-0.29f, -1.09f, -1.2f, -1.93f, -2.32f, -2.13f)
                curveToRelative(-5.07f, -0.93f, -10.66f, -0.93f, -15.73f, 0f)
                curveToRelative(-1.12f, 0.21f, -2.03f, 1.04f, -2.32f, 2.13f)
                curveToRelative(-0.14f, 0.54f, -0.27f, 1.09f, -0.37f, 1.64f)
                horizontalLineTo(22.56f)
                curveToRelative(-0.1f, -0.55f, -0.23f, -1.1f, -0.37f, -1.64f)
                close()
            }
        }.also { _CreditCard = it}
