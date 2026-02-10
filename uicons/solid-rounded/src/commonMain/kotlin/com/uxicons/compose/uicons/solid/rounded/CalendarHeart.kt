package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarHeart: ImageVector? = null

val Icons.Sr.CalendarHeart: ImageVector
    get() = _CalendarHeart ?: UXIcon(name = "CalendarHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.98f, 16.08f)
                curveToRelative(0f, -0.66f, 0.43f, -1.2f, 0.97f, -1.2f)
                reflectiveCurveToRelative(0.97f, 0.54f, 0.97f, 1.2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.66f, 0.43f, -1.2f, 0.97f, -1.2f)
                reflectiveCurveToRelative(0.97f, 0.54f, 0.97f, 1.2f)
                curveToRelative(0f, 0.42f, -0.29f, 1.63f, -2.92f, 3.81f)
                curveToRelative(-2.67f, -2.18f, -2.96f, -3.39f, -2.96f, -3.81f)
                close()
                moveTo(0f, 10f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-9f)
                close()
                moveTo(6.99f, 16.08f)
                curveToRelative(0f, 1.58f, 1.21f, 3.33f, 3.69f, 5.36f)
                curveToRelative(0.36f, 0.29f, 0.8f, 0.44f, 1.24f, 0.44f)
                curveToRelative(0.44f, 0f, 0.88f, -0.15f, 1.24f, -0.44f)
                curveToRelative(2.49f, -2.03f, 3.69f, -3.78f, 3.69f, -5.36f)
                curveToRelative(0f, -1.76f, -1.33f, -3.2f, -2.97f, -3.2f)
                curveToRelative(-0.76f, 0f, -1.44f, 0.3f, -1.97f, 0.81f)
                curveToRelative(-0.52f, -0.5f, -1.21f, -0.81f, -1.97f, -0.81f)
                curveToRelative(-1.64f, 0f, -2.97f, 1.44f, -2.97f, 3.2f)
                close()
                moveTo(19f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _CalendarHeart = it}
