package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarBirhtdayCake: ImageVector? = null

val Icons.Ts.CalendarBirhtdayCake: ImageVector
    get() = _CalendarBirhtdayCake ?: UXIcon(name = "CalendarBirhtdayCake") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.75f, 1.02f, -1.64f, 1.02f, -1.64f)
                curveToRelative(0f, 0f, 0.98f, 0.89f, 0.98f, 1.64f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(17f, 20f)
                verticalLineToRelative(4f)
                lineTo(7f, 24f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(16f, 20f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-14f)
                lineTo(1f, 9f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                lineTo(0f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.5f)
                lineTo(6f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                lineTo(17f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(22f)
                close()
            }
        }.also { _CalendarBirhtdayCake = it}
