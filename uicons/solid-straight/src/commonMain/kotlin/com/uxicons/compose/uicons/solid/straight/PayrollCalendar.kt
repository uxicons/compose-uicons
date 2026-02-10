package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PayrollCalendar: ImageVector? = null

val Icons.Ss.PayrollCalendar: ImageVector
    get() = _PayrollCalendar ?: UXIcon(name = "PayrollCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                verticalLineToRelative(3f)
                lineTo(0f, 8f)
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
                close()
                moveTo(19f, 14f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.36f, 0.97f, 2.51f, 2.31f, 2.73f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(0.37f, 0.06f, 0.65f, 0.38f, 0.65f, 0.76f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.36f, -0.97f, -2.51f, -2.31f, -2.73f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-0.37f, -0.06f, -0.65f, -0.38f, -0.65f, -0.76f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(14f, 19f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.04f, 1.24f, -3.8f, 3f, -4.58f)
                verticalLineToRelative(-0.42f)
                lineTo(0f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-0.42f)
                curveToRelative(-1.76f, -0.77f, -3f, -2.53f, -3f, -4.58f)
                close()
            }
        }.also { _PayrollCalendar = it}
