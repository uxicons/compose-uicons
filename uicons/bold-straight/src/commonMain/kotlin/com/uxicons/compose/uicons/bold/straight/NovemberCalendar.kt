package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NovemberCalendar: ImageVector? = null

val Icons.Bs.NovemberCalendar: ImageVector
    get() = _NovemberCalendar ?: UXIcon(name = "NovemberCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.4f, 16f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-1.8f, -4.05f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(0.01f)
                lineToRelative(1.8f, 4.05f)
                close()
                moveTo(17.8f, 18.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 1.27f, -1.03f, 2.3f, -2.3f, 2.3f)
                reflectiveCurveToRelative(-2.3f, -1.03f, -2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -1.27f, 1.03f, -2.3f, 2.3f, -2.3f)
                reflectiveCurveToRelative(2.3f, 1.03f, 2.3f, 2.3f)
                close()
                moveTo(16.2f, 18.3f)
                curveToRelative(0f, -0.39f, -0.31f, -0.7f, -0.7f, -0.7f)
                reflectiveCurveToRelative(-0.7f, 0.31f, -0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 0.39f, 0.31f, 0.7f, 0.7f, 0.7f)
                reflectiveCurveToRelative(0.7f, -0.31f, 0.7f, -0.7f)
                close()
                moveTo(21f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22.36f, 16f)
                lineTo(21.26f, 22.14f)
                lineTo(20.13f, 16.01f)
                lineTo(18.5f, 16.0f)
                lineTo(19.71f, 22.58f)
                curveToRelative(0.1f, 0.58f, 0.61f, 1.42f, 1.55f, 1.42f)
                reflectiveCurveToRelative(1.44f, -0.79f, 1.55f, -1.46f)
                lineToRelative(1.19f, -6.54f)
                close()
            }
        }.also { _NovemberCalendar = it}
