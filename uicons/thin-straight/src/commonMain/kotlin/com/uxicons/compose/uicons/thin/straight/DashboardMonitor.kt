package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DashboardMonitor: ImageVector? = null

val Icons.Ts.DashboardMonitor: ImageVector
    get() = _DashboardMonitor ?: UXIcon(name = "DashboardMonitor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(17f, 9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                close()
                moveTo(17f, 12f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                close()
                moveTo(15f, 10f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(9f, 15f)
                curveToRelative(1.2f, 0f, 2.28f, -0.44f, 3.15f, -1.15f)
                lineToRelative(-3.65f, -3.65f)
                lineTo(8.5f, 5.05f)
                curveToRelative(-2.52f, 0.26f, -4.5f, 2.36f, -4.5f, 4.95f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                close()
                moveTo(14f, 10f)
                curveToRelative(0f, -2.59f, -1.98f, -4.69f, -4.5f, -4.95f)
                verticalLineToRelative(4.74f)
                lineToRelative(3.35f, 3.35f)
                curveToRelative(0.7f, -0.86f, 1.15f, -1.95f, 1.15f, -3.15f)
                close()
                moveTo(12.5f, 19f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1f)
                lineTo(6f, 23f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3f)
                lineTo(0f, 19f)
                lineTo(0f, 3.5f)
                curveTo(0f, 2.12f, 1.12f, 1f, 2.5f, 1f)
                lineTo(21.5f, 1f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                lineTo(12.5f, 19f)
                close()
                moveTo(1f, 18f)
                lineTo(23f, 18f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                close()
            }
        }.also { _DashboardMonitor = it}
