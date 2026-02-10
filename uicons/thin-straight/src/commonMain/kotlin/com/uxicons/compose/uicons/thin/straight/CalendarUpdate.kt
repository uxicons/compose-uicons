package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarUpdate: ImageVector? = null

val Icons.Ts.CalendarUpdate: ImageVector
    get() = _CalendarUpdate ?: UXIcon(name = "CalendarUpdate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                horizontalLineToRelative(-3.5f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(17f, 2f)
                lineTo(7f, 2f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(6f, 2f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 3f)
                lineTo(21.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(1f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                lineTo(1f, 9f)
                lineTo(23f, 9f)
                verticalLineToRelative(14f)
                lineTo(1f, 23f)
                close()
                moveTo(16f, 11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.42f)
                curveToRelative(-0.69f, -1.19f, -1.95f, -2f, -3.42f, -2f)
                curveToRelative(-1.86f, 0f, -3.41f, 1.28f, -3.86f, 3f)
                horizontalLineToRelative(-1.04f)
                curveToRelative(0.47f, -2.28f, 2.48f, -4f, 4.9f, -4f)
                curveToRelative(1.64f, 0f, 3.09f, 0.8f, 4f, 2.02f)
                verticalLineToRelative(-2.02f)
                close()
                moveTo(15.96f, 17f)
                horizontalLineToRelative(1.04f)
                curveToRelative(-0.47f, 2.28f, -2.48f, 4f, -4.9f, 4f)
                curveToRelative(-1.64f, 0f, -3.09f, -0.8f, -4f, -2.02f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.42f)
                curveToRelative(0.69f, 1.19f, 1.95f, 2f, 3.42f, 2f)
                curveToRelative(1.86f, 0f, 3.41f, -1.28f, 3.86f, -3f)
                close()
            }
        }.also { _CalendarUpdate = it}
