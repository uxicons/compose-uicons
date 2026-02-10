package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyStickPuck: ImageVector? = null

val Icons.Rr.HockeyStickPuck: ImageVector
    get() = _HockeyStickPuck ?: UXIcon(name = "HockeyStickPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.46f, 0.11f)
                curveToRelative(-0.49f, -0.25f, -1.09f, -0.06f, -1.35f, 0.43f)
                lineToRelative(-8.54f, 16.46f)
                lineTo(3.5f, 17.0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5.04f)
                curveToRelative(2.25f, 0f, 4.29f, -1.24f, 5.33f, -3.24f)
                lineTo(23.89f, 1.46f)
                curveToRelative(0.25f, -0.49f, 0.06f, -1.09f, -0.43f, -1.35f)
                close()
                moveTo(12.1f, 19.84f)
                curveToRelative(-0.69f, 1.33f, -2.05f, 2.16f, -3.55f, 2.16f)
                lineTo(3.5f, 22.0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.03f)
                lineToRelative(-0.44f, 0.84f)
                close()
                moveTo(24f, 23.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _HockeyStickPuck = it}
