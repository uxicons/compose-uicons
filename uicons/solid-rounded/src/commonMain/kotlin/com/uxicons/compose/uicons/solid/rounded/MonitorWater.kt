package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MonitorWater: ImageVector? = null

val Icons.Sr.MonitorWater: ImageVector
    get() = _MonitorWater ?: UXIcon(name = "MonitorWater") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 11f)
                curveToRelative(-1.33f, 0f, -2.59f, -0.52f, -3.54f, -1.47f)
                curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0f, -7.07f)
                lineToRelative(1.79f, -1.76f)
                curveToRelative(0.48f, -0.47f, 1.11f, -0.71f, 1.75f, -0.71f)
                curveToRelative(0.66f, 0f, 1.26f, 0.24f, 1.75f, 0.71f)
                lineToRelative(1.78f, 1.75f)
                curveToRelative(1.96f, 1.96f, 1.96f, 5.13f, 0.01f, 7.08f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.47f, -3.54f, 1.47f)
                close()
                moveTo(23.95f, 10.95f)
                curveToRelative(-1.32f, 1.32f, -3.08f, 2.05f, -4.95f, 2.05f)
                reflectiveCurveToRelative(-3.63f, -0.73f, -4.95f, -2.05f)
                curveToRelative(-2.43f, -2.43f, -2.69f, -6.22f, -0.79f, -8.95f)
                horizontalLineToRelative(-8.26f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4.11f)
                curveToRelative(-0.02f, 0.02f, -0.03f, 0.04f, -0.05f, 0.06f)
                close()
            }
        }.also { _MonitorWater = it}
