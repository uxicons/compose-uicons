package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DashboardPanel: ImageVector? = null

val Icons.Ts.DashboardPanel: ImageVector
    get() = _DashboardPanel ?: UXIcon(name = "DashboardPanel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(17f, 11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                close()
                moveTo(17f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                close()
                moveTo(17f, 17f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(15.5f)
                lineTo(0f, 21f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                lineTo(21.5f, 3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 4f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                lineTo(23f, 20f)
                lineTo(23f, 5.5f)
                close()
                moveTo(15f, 12f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(9f, 17f)
                curveToRelative(1.2f, 0f, 2.28f, -0.44f, 3.15f, -1.15f)
                lineToRelative(-3.65f, -3.65f)
                lineTo(8.5f, 7.05f)
                curveToRelative(-2.52f, 0.26f, -4.5f, 2.36f, -4.5f, 4.95f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                close()
                moveTo(14f, 12f)
                curveToRelative(0f, -2.59f, -1.98f, -4.69f, -4.5f, -4.95f)
                verticalLineToRelative(4.74f)
                lineToRelative(3.35f, 3.35f)
                curveToRelative(0.7f, -0.86f, 1.15f, -1.95f, 1.15f, -3.15f)
                close()
            }
        }.also { _DashboardPanel = it}
