package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarPaymentLoan: ImageVector? = null

val Icons.Ss.CalendarPaymentLoan: ImageVector
    get() = _CalendarPaymentLoan ?: UXIcon(name = "CalendarPaymentLoan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21.01f)
                curveToRelative(0f, 1.65f, -1.34f, 2.99f, -3f, 2.99f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -2.99f)
                curveToRelative(0f, -2.87f, 2.27f, -5.75f, 4.84f, -6.45f)
                curveToRelative(-0.71f, -0.67f, -1.47f, -1.61f, -1.47f, -2.56f)
                horizontalLineToRelative(5.26f)
                curveToRelative(0f, 0.95f, -0.77f, 1.9f, -1.47f, 2.56f)
                curveToRelative(2.57f, 0.7f, 4.84f, 3.58f, 4.84f, 6.45f)
                close()
                moveTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10f, 21.01f)
                curveToRelative(0f, -2.74f, 1.57f, -5.52f, 3.81f, -7.16f)
                curveToRelative(-0.3f, -0.62f, -0.45f, -1.24f, -0.45f, -1.86f)
                verticalLineToRelative(-2f)
                lineTo(0f, 10.0f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(11.02f)
                curveToRelative(-0.63f, -0.83f, -1.02f, -1.86f, -1.02f, -2.99f)
                close()
            }
        }.also { _CalendarPaymentLoan = it}
