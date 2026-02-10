package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyStickPuck: ImageVector? = null

val Icons.Tr.HockeyStickPuck: ImageVector
    get() = _HockeyStickPuck ?: UXIcon(name = "HockeyStickPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.73f, 0.06f)
                curveToRelative(-0.24f, -0.13f, -0.55f, -0.03f, -0.67f, 0.21f)
                lineToRelative(-9.23f, 17.73f)
                lineTo(3f, 18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6.1f)
                curveToRelative(1.68f, 0f, 3.21f, -0.93f, 3.99f, -2.42f)
                lineTo(23.94f, 0.73f)
                curveToRelative(0.13f, -0.24f, 0.03f, -0.55f, -0.21f, -0.67f)
                close()
                moveTo(12.21f, 21.12f)
                curveToRelative(-0.6f, 1.16f, -1.8f, 1.89f, -3.1f, 1.89f)
                lineTo(3f, 23.0f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(10.31f)
                lineToRelative(-1.1f, 2.12f)
                close()
                moveTo(22.5f, 21.0f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 23.0f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.23f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }.also { _HockeyStickPuck = it}
