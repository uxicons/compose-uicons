package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DashboardMonitor: ImageVector? = null

val Icons.Ss.DashboardMonitor: ImageVector
    get() = _DashboardMonitor ?: UXIcon(name = "DashboardMonitor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                lineTo(24f, 4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(15f)
                lineTo(11f, 19f)
                verticalLineToRelative(2f)
                lineTo(6f, 21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                close()
                moveTo(16f, 5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(16f, 9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(8f, 15f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -2.42f, 1.72f, -4.44f, 4f, -4.9f)
                verticalLineToRelative(5.31f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(-0.79f, 0.52f, -1.74f, 0.83f, -2.75f, 0.83f)
                close()
                moveTo(12.17f, 12.75f)
                lineToRelative(-3.17f, -3.17f)
                lineTo(9f, 5.1f)
                curveToRelative(2.28f, 0.46f, 4f, 2.48f, 4f, 4.9f)
                curveToRelative(0f, 1.02f, -0.31f, 1.96f, -0.83f, 2.75f)
                close()
            }
        }.also { _DashboardMonitor = it}
