package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarPaymentLoan: ImageVector? = null

val Icons.Bs.CalendarPaymentLoan: ImageVector
    get() = _CalendarPaymentLoan ?: UXIcon(name = "CalendarPaymentLoan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.9f, 13.33f)
                curveToRelative(0.63f, -0.64f, 1.24f, -1.48f, 1.24f, -2.33f)
                horizontalLineToRelative(-5.26f)
                curveToRelative(0f, 0.85f, 0.6f, 1.69f, 1.24f, 2.33f)
                curveToRelative(-2.77f, 0.76f, -5.1f, 3.65f, -5.1f, 6.68f)
                curveToRelative(0f, 2.2f, 1.79f, 3.99f, 4f, 3.99f)
                horizontalLineToRelative(5f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -3.99f)
                curveToRelative(0f, -3.04f, -2.33f, -5.92f, -5.1f, -6.68f)
                close()
                moveTo(20f, 21f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, -0.44f, -1f, -0.99f)
                curveToRelative(0f, -1.89f, 1.8f, -3.88f, 3.5f, -3.88f)
                reflectiveCurveToRelative(3.5f, 2.0f, 3.5f, 3.88f)
                curveToRelative(0f, 0.55f, -0.45f, 0.99f, -1f, 0.99f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(3.5f)
                lineTo(3f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(6.09f)
                curveToRelative(0.19f, 1.14f, 0.71f, 2.17f, 1.45f, 3f)
                lineTo(0f, 24f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.5f)
                lineTo(6f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                lineTo(15f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }.also { _CalendarPaymentLoan = it}
