package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MonitorWater: ImageVector? = null

val Icons.Ss.MonitorWater: ImageVector
    get() = _MonitorWater ?: UXIcon(name = "MonitorWater") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.47f, 3.46f)
                lineToRelative(3.54f, -3.46f)
                lineToRelative(3.53f, 3.45f)
                curveToRelative(1.96f, 1.96f, 1.96f, 5.13f, 0.01f, 7.08f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0f, -7.07f)
                close()
                moveTo(19.0f, 13.99f)
                curveToRelative(-1.87f, 0f, -3.63f, -0.73f, -4.95f, -2.05f)
                curveToRelative(-2.73f, -2.73f, -2.73f, -7.17f, 0f, -9.9f)
                lineToRelative(0.04f, -0.04f)
                horizontalLineToRelative(-11.1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-8.11f)
                curveToRelative(-0.02f, 0.02f, -0.03f, 0.04f, -0.05f, 0.05f)
                curveToRelative(-1.32f, 1.32f, -3.08f, 2.05f, -4.95f, 2.05f)
                close()
            }
        }.also { _MonitorWater = it}
