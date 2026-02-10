package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarUpdate: ImageVector? = null

val Icons.Rs.CalendarUpdate: ImageVector
    get() = _CalendarUpdate ?: UXIcon(name = "CalendarUpdate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.82f, 17f)
                horizontalLineToRelative(2.08f)
                curveToRelative(-0.47f, 2.28f, -2.48f, 4f, -4.9f, 4f)
                curveToRelative(-1.34f, 0f, -2.61f, -0.54f, -3.53f, -1.47f)
                lineToRelative(-1.47f, 1.47f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                lineToRelative(-1.12f, 1.12f)
                curveToRelative(0.56f, 0.55f, 1.32f, 0.88f, 2.12f, 0.88f)
                curveToRelative(1.3f, 0f, 2.4f, -0.84f, 2.82f, -2f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                horizontalLineToRelative(2.08f)
                curveToRelative(0.41f, -1.16f, 1.51f, -2f, 2.82f, -2f)
                curveToRelative(0.8f, 0f, 1.56f, 0.33f, 2.12f, 0.88f)
                lineToRelative(-1.12f, 1.12f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                lineToRelative(-1.47f, 1.47f)
                curveToRelative(-0.93f, -0.92f, -2.2f, -1.47f, -3.53f, -1.47f)
                close()
                moveTo(24f, 5f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                lineTo(8f, 2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                lineTo(18f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 5f)
                verticalLineToRelative(3f)
                lineTo(22f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(22f, 22f)
                lineTo(22f, 10f)
                lineTo(2f, 10f)
                verticalLineToRelative(12f)
                lineTo(22f, 22f)
                close()
            }
        }.also { _CalendarUpdate = it}
