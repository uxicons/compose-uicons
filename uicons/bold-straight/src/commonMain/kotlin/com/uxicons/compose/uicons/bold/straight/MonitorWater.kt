package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MonitorWater: ImageVector? = null

val Icons.Bs.MonitorWater: ImageVector
    get() = _MonitorWater ?: UXIcon(name = "MonitorWater") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.46f, 10.54f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.48f, -3.55f)
                lineToRelative(-3.52f, -3.45f)
                lineToRelative(-3.54f, 3.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                close()
                moveTo(17.57f, 5.6f)
                lineTo(19f, 4.2f)
                lineTo(20.41f, 5.59f)
                curveToRelative(0.38f, 0.38f, 0.59f, 0.88f, 0.59f, 1.41f)
                reflectiveCurveToRelative(-0.21f, 1.04f, -0.59f, 1.42f)
                curveToRelative(-0.76f, 0.76f, -2.07f, 0.76f, -2.83f, 0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, -0.01f, -2.82f)
                close()
                moveTo(23.95f, 11.95f)
                curveToRelative(0.02f, -0.02f, 0.03f, -0.04f, 0.05f, -0.06f)
                verticalLineToRelative(7.11f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.1f)
                lineToRelative(-0.05f, 0.05f)
                curveToRelative(-0.85f, 0.85f, -1.44f, 1.87f, -1.76f, 2.95f)
                horizontalLineToRelative(-9.29f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2.29f)
                curveToRelative(1.1f, -0.33f, 2.11f, -0.92f, 2.95f, -1.76f)
                close()
            }
        }.also { _MonitorWater = it}
