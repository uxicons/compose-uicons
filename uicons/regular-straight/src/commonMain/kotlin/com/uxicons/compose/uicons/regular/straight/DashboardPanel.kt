package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DashboardPanel: ImageVector? = null

val Icons.Rs.DashboardPanel: ImageVector
    get() = _DashboardPanel ?: UXIcon(name = "DashboardPanel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                curveToRelative(0f, 1.02f, -0.31f, 1.96f, -0.83f, 2.75f)
                lineToRelative(-3.17f, -3.17f)
                lineTo(10f, 7.1f)
                curveToRelative(2.28f, 0.46f, 4f, 2.48f, 4f, 4.9f)
                close()
                moveTo(8f, 7.1f)
                curveToRelative(-2.28f, 0.46f, -4f, 2.48f, -4f, 4.9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(-3.75f, -3.75f)
                lineTo(8f, 7.1f)
                close()
                moveTo(16f, 9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 17f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(15f)
                lineTo(0f, 21f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(13f)
                lineTo(22f, 19f)
                lineTo(22f, 6f)
                close()
            }
        }.also { _DashboardPanel = it}
