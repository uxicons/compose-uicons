package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DashboardMonitor: ImageVector? = null

val Icons.Rs.DashboardMonitor: ImageVector
    get() = _DashboardMonitor ?: UXIcon(name = "DashboardMonitor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 10f)
                curveToRelative(0f, 1.02f, -0.31f, 1.96f, -0.83f, 2.75f)
                lineToRelative(-3.17f, -3.17f)
                lineTo(10f, 5.1f)
                curveToRelative(2.28f, 0.46f, 4f, 2.48f, 4f, 4.9f)
                close()
                moveTo(8f, 5.1f)
                curveToRelative(-2.28f, 0.46f, -4f, 2.48f, -4f, 4.9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(-3.75f, -3.75f)
                lineTo(8f, 5.1f)
                close()
                moveTo(16f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(6f, 23f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                lineTo(0f, 4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                lineTo(21f, 1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(15f)
                lineTo(13f, 19f)
                close()
                moveTo(2f, 17f)
                lineTo(22f, 17f)
                lineTo(22f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _DashboardMonitor = it}
