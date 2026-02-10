package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCard: ImageVector? = null

val Icons.Rc.CreditCard: ImageVector
    get() = _CreditCard ?: UXIcon(name = "CreditCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.19f, 5.65f)
                curveToRelative(-0.29f, -1.09f, -1.2f, -1.93f, -2.32f, -2.13f)
                curveToRelative(-5.07f, -0.93f, -10.66f, -0.93f, -15.73f, 0f)
                curveToRelative(-1.12f, 0.21f, -2.03f, 1.04f, -2.32f, 2.13f)
                curveToRelative(-1.08f, 4.09f, -1.08f, 8.6f, 0f, 12.69f)
                curveToRelative(0.29f, 1.09f, 1.2f, 1.93f, 2.32f, 2.13f)
                curveToRelative(2.54f, 0.46f, 5.2f, 0.7f, 7.87f, 0.7f)
                reflectiveCurveToRelative(5.33f, -0.23f, 7.87f, -0.7f)
                reflectiveQuadToRelative(0f, 0f)
                curveToRelative(1.12f, -0.21f, 2.03f, -1.04f, 2.32f, -2.13f)
                curveToRelative(1.08f, -4.09f, 1.08f, -8.6f, 0f, -12.69f)
                close()
                moveTo(4.49f, 5.49f)
                curveToRelative(2.42f, -0.44f, 4.96f, -0.67f, 7.51f, -0.67f)
                reflectiveCurveToRelative(5.09f, 0.22f, 7.51f, 0.66f)
                curveToRelative(0.36f, 0.07f, 0.66f, 0.33f, 0.75f, 0.68f)
                curveToRelative(0.1f, 0.37f, 0.19f, 0.75f, 0.27f, 1.13f)
                lineTo(3.48f, 7.3f)
                curveToRelative(0.08f, -0.38f, 0.17f, -0.76f, 0.27f, -1.13f)
                curveToRelative(0.09f, -0.34f, 0.38f, -0.61f, 0.75f, -0.68f)
                close()
                moveTo(20.25f, 17.84f)
                curveToRelative(-0.09f, 0.34f, -0.38f, 0.61f, -0.75f, 0.68f)
                curveToRelative(-4.84f, 0.89f, -10.17f, 0.89f, -15.01f, 0f)
                curveToRelative(-0.36f, -0.07f, -0.66f, -0.33f, -0.75f, -0.68f)
                curveToRelative(-0.72f, -2.74f, -0.92f, -5.69f, -0.59f, -8.54f)
                lineTo(20.84f, 9.3f)
                curveToRelative(0.33f, 2.85f, 0.14f, 5.8f, -0.59f, 8.54f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.63f, 14.3f)
                moveToRelative(-2.49f, 0f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.98f, 0f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.98f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.86f, 13.37f)
                horizontalLineToRelative(-3.31f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.31f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _CreditCard = it}
