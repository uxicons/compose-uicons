package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarPaymentLoan: ImageVector? = null

val Icons.Sr.CalendarPaymentLoan: ImageVector
    get() = _CalendarPaymentLoan ?: UXIcon(name = "CalendarPaymentLoan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 8f)
                verticalLineToRelative(-1f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                lineTo(0f, 8f)
                close()
                moveTo(19.33f, 14.63f)
                curveToRelative(0.38f, -0.37f, 0.77f, -0.81f, 1.05f, -1.29f)
                curveToRelative(0.35f, -0.59f, -0.12f, -1.33f, -0.8f, -1.33f)
                horizontalLineToRelative(-3.17f)
                curveToRelative(-0.68f, 0f, -1.14f, 0.74f, -0.8f, 1.33f)
                curveToRelative(0.28f, 0.48f, 0.67f, 0.92f, 1.05f, 1.29f)
                curveToRelative(-2.5f, 0.78f, -4.67f, 3.58f, -4.67f, 6.39f)
                curveToRelative(0f, 1.65f, 1.34f, 2.99f, 3f, 2.99f)
                horizontalLineToRelative(6f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -2.99f)
                curveToRelative(0f, -2.81f, -2.17f, -5.61f, -4.67f, -6.39f)
                close()
                moveTo(10f, 21.01f)
                curveToRelative(0f, -2.7f, 1.51f, -5.42f, 3.7f, -7.07f)
                curveToRelative(-0.31f, -0.8f, -0.25f, -1.72f, 0.18f, -2.48f)
                curveToRelative(0.52f, -0.91f, 1.49f, -1.47f, 2.53f, -1.47f)
                lineTo(0f, 10f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6.02f)
                curveToRelative(-0.63f, -0.83f, -1.02f, -1.86f, -1.02f, -2.99f)
                close()
            }
        }.also { _CalendarPaymentLoan = it}
