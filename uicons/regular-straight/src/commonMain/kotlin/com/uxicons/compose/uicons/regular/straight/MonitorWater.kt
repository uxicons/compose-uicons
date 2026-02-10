package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MonitorWater: ImageVector? = null

val Icons.Rs.MonitorWater: ImageVector
    get() = _MonitorWater ?: UXIcon(name = "MonitorWater") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.46f, 10.54f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, -0.01f, -7.08f)
                lineToRelative(-3.53f, -3.46f)
                lineToRelative(-3.54f, 3.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                close()
                moveTo(16.87f, 4.89f)
                lineTo(19f, 2.8f)
                lineTo(21.12f, 4.88f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, -0.01f, -4.24f)
                close()
                moveTo(24f, 11.89f)
                verticalLineToRelative(8.11f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.1f)
                curveToRelative(-0.6f, 0.59f, -1.07f, 1.28f, -1.42f, 2f)
                horizontalLineToRelative(-9.69f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-4.68f)
                curveToRelative(0.71f, -0.34f, 1.38f, -0.79f, 1.95f, -1.37f)
                curveToRelative(0.02f, -0.02f, 0.03f, -0.04f, 0.05f, -0.06f)
                close()
            }
        }.also { _MonitorWater = it}
