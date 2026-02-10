package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarLinesPen: ImageVector? = null

val Icons.Rs.CalendarLinesPen: ImageVector
    get() = _CalendarLinesPen ?: UXIcon(name = "CalendarLinesPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.93f, 15f)
                lineTo(5f, 15f)
                verticalLineToRelative(-2f)
                lineTo(15.93f, 13f)
                lineToRelative(-2f, 2f)
                close()
                moveTo(5f, 19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-0.07f)
                lineToRelative(1.93f, -1.93f)
                lineTo(5f, 17f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(5f)
                lineTo(2f, 10f)
                verticalLineToRelative(12f)
                lineTo(10f, 22f)
                verticalLineToRelative(2f)
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
                moveTo(22f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                lineTo(22f, 8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(23.12f, 12.88f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                lineToRelative(-6.88f, 6.88f)
                horizontalLineToRelative(-4.24f)
                verticalLineToRelative(-4.24f)
                lineToRelative(6.88f, -6.88f)
                curveToRelative(1.13f, -1.13f, 3.11f, -1.13f, 4.24f, 0f)
                close()
                moveTo(22f, 15f)
                curveToRelative(0f, -0.27f, -0.1f, -0.52f, -0.29f, -0.71f)
                curveToRelative(-0.38f, -0.38f, -1.04f, -0.38f, -1.41f, 0f)
                lineToRelative(-6.29f, 6.29f)
                verticalLineToRelative(1.42f)
                horizontalLineToRelative(1.42f)
                lineToRelative(6.29f, -6.29f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                close()
            }
        }.also { _CalendarLinesPen = it}
