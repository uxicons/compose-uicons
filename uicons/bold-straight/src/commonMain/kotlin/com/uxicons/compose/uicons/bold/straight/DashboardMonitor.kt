package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DashboardMonitor: ImageVector? = null

val Icons.Bs.DashboardMonitor: ImageVector
    get() = _DashboardMonitor ?: UXIcon(name = "DashboardMonitor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(10.5f, 19f)
                verticalLineToRelative(2f)
                lineTo(6f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                lineTo(3f, 16f)
                lineTo(3f, 3.5f)
                close()
                moveTo(13f, 9.5f)
                curveToRelative(0f, 0.74f, -0.21f, 1.43f, -0.57f, 2.02f)
                lineToRelative(-2.43f, -2.43f)
                verticalLineToRelative(-3.44f)
                curveToRelative(1.72f, 0.45f, 3f, 2.0f, 3f, 3.86f)
                close()
                moveTo(8f, 9.91f)
                lineToRelative(3.02f, 3.02f)
                curveToRelative(-0.59f, 0.35f, -1.28f, 0.57f, -2.02f, 0.57f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.86f, 1.28f, -3.41f, 3f, -3.86f)
                verticalLineToRelative(4.27f)
                close()
                moveTo(15f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(15f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _DashboardMonitor = it}
