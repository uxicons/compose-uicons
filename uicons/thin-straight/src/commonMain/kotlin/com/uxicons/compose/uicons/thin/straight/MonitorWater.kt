package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MonitorWater: ImageVector? = null

val Icons.Ts.MonitorWater: ImageVector
    get() = _MonitorWater ?: UXIcon(name = "MonitorWater") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.46f, 10.53f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                reflectiveCurveToRelative(1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                lineToRelative(-3.53f, -3.45f)
                lineToRelative(-3.54f, 3.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                close()
                moveTo(16.17f, 4.17f)
                lineTo(19f, 1.4f)
                lineTo(21.83f, 4.17f)
                curveToRelative(0.76f, 0.76f, 1.17f, 1.76f, 1.17f, 2.83f)
                reflectiveCurveToRelative(-0.42f, 2.07f, -1.17f, 2.83f)
                curveToRelative(-1.51f, 1.51f, -4.14f, 1.51f, -5.66f, 0f)
                curveToRelative(-1.56f, -1.56f, -1.56f, -4.1f, -0.0f, -5.65f)
                close()
                moveTo(23f, 12.73f)
                curveToRelative(0.34f, -0.23f, 0.7f, -0.55f, 1f, -0.84f)
                verticalLineToRelative(8.11f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11.6f)
                curveToRelative(-0.32f, 0.31f, -0.6f, 0.65f, -0.84f, 1f)
                horizontalLineToRelative(-10.76f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(22f)
                close()
            }
        }.also { _MonitorWater = it}
