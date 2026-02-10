package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeWatchCalendar: ImageVector? = null

val Icons.Sr.TimeWatchCalendar: ImageVector
    get() = _TimeWatchCalendar ?: UXIcon(name = "TimeWatchCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 19f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22f, 14.18f)
                verticalLineToRelative(-1.18f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                verticalLineToRelative(0.14f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-0.14f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                close()
                moveTo(10f, 21f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.59f, 0.77f, -3.06f, 2f, -3.99f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                curveToRelative(1.3f, 0f, 2.42f, 0.84f, 2.83f, 2f)
                horizontalLineToRelative(0.34f)
                curveToRelative(0.41f, -1.16f, 1.52f, -2f, 2.83f, -2f)
                curveToRelative(0.34f, 0f, 0.66f, 0.07f, 0.96f, 0.17f)
                curveToRelative(-0.42f, -5.69f, -5.16f, -10.17f, -10.96f, -10.17f)
                curveTo(4.92f, 0f, 0f, 4.92f, 0f, 11f)
                curveToRelative(0f, 5.77f, 4.45f, 10.49f, 10.1f, 10.95f)
                curveToRelative(-0.06f, -0.31f, -0.1f, -0.63f, -0.1f, -0.95f)
                close()
                moveTo(7.5f, 14f)
                curveToRelative(-0.35f, 0f, -0.69f, -0.18f, -0.87f, -0.5f)
                curveToRelative(-0.27f, -0.48f, -0.11f, -1.09f, 0.37f, -1.36f)
                lineToRelative(3.0f, -1.71f)
                verticalLineToRelative(-4.42f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.36f, -0.19f, 0.69f, -0.5f, 0.87f)
                lineToRelative(-3.5f, 2f)
                curveToRelative(-0.16f, 0.09f, -0.33f, 0.13f, -0.49f, 0.13f)
                close()
            }
        }.also { _TimeWatchCalendar = it}
