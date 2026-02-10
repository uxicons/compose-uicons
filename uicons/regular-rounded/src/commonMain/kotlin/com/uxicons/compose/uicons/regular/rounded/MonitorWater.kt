package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MonitorWater: ImageVector? = null

val Icons.Rr.MonitorWater: ImageVector
    get() = _MonitorWater ?: UXIcon(name = "MonitorWater") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(15.46f, 9.53f)
                curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0f, -7.08f)
                lineToRelative(1.79f, -1.75f)
                curveToRelative(0.96f, -0.94f, 2.53f, -0.94f, 3.49f, 0f)
                lineToRelative(1.78f, 1.74f)
                curveToRelative(1.96f, 1.96f, 1.96f, 5.13f, 0.01f, 7.08f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.47f, -3.54f, 1.47f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.47f)
                close()
                moveTo(16.88f, 8.12f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.08f, 0f, -4.25f)
                lineToRelative(-1.77f, -1.74f)
                curveToRelative(-0.1f, -0.1f, -0.22f, -0.14f, -0.35f, -0.14f)
                reflectiveCurveToRelative(-0.25f, 0.05f, -0.35f, 0.14f)
                lineToRelative(-1.78f, 1.74f)
                curveToRelative(-1.16f, 1.16f, -1.16f, 3.07f, 0.01f, 4.24f)
                close()
            }
        }.also { _MonitorWater = it}
