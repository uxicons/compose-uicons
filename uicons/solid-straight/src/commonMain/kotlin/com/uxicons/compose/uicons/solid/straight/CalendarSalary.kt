package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarSalary: ImageVector? = null

val Icons.Ss.CalendarSalary: ImageVector
    get() = _CalendarSalary ?: UXIcon(name = "CalendarSalary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                lineTo(0f, 8f)
                close()
                moveTo(19.5f, 16.5f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                reflectiveCurveToRelative(-7.5f, -3.36f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.36f, -7.5f, 7.5f, -7.5f)
                reflectiveCurveToRelative(7.5f, 3.36f, 7.5f, 7.5f)
                close()
                moveTo(10f, 14.62f)
                curveToRelative(0f, -0.34f, 0.28f, -0.62f, 0.62f, -0.62f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-0.38f)
                curveToRelative(-1.45f, 0f, -2.62f, 1.18f, -2.62f, 2.62f)
                curveToRelative(0f, 1.29f, 0.92f, 2.38f, 2.19f, 2.59f)
                lineToRelative(3.29f, 0.55f)
                curveToRelative(0.3f, 0.05f, 0.52f, 0.31f, 0.52f, 0.62f)
                curveToRelative(0f, 0.34f, -0.28f, 0.62f, -0.62f, 0.62f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(0.38f)
                curveToRelative(1.45f, 0f, 2.62f, -1.18f, 2.62f, -2.62f)
                curveToRelative(0f, -1.29f, -0.92f, -2.38f, -2.19f, -2.59f)
                lineToRelative(-3.29f, -0.55f)
                curveToRelative(-0.3f, -0.05f, -0.52f, -0.31f, -0.52f, -0.62f)
                close()
                moveTo(2.5f, 16.5f)
                curveToRelative(0f, -2.52f, 0.99f, -4.8f, 2.58f, -6.5f)
                lineTo(0f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(6.18f)
                curveToRelative(-2.24f, -1.74f, -3.68f, -4.45f, -3.68f, -7.5f)
                close()
                moveTo(18.91f, 10f)
                curveToRelative(1.6f, 1.7f, 2.58f, 3.98f, 2.58f, 6.5f)
                curveToRelative(0f, 3.05f, -1.45f, 5.76f, -3.68f, 7.5f)
                horizontalLineToRelative(6.18f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(-5.08f)
                close()
            }
        }.also { _CalendarSalary = it}
