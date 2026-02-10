package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallDown: ImageVector? = null

val Icons.Ts.AngleDoubleSmallDown: ImageVector
    get() = _AngleDoubleSmallDown ?: UXIcon(name = "AngleDoubleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19f)
                curveToRelative(-0.4f, 0f, -0.78f, -0.16f, -1.06f, -0.44f)
                lineToRelative(-5.28f, -5.28f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(5.28f, 5.28f)
                curveToRelative(0.19f, 0.19f, 0.52f, 0.19f, 0.71f, 0f)
                lineToRelative(5.28f, -5.28f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-5.28f, 5.28f)
                curveToRelative(-0.28f, 0.28f, -0.66f, 0.44f, -1.06f, 0.44f)
                close()
                moveTo(12.47f, 11.8f)
                lineToRelative(5.87f, -5.87f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-5.63f, 5.63f)
                lineTo(6.37f, 5.23f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(5.87f, 5.87f)
                curveToRelative(0.13f, 0.13f, 0.3f, 0.2f, 0.47f, 0.2f)
                reflectiveCurveToRelative(0.34f, -0.07f, 0.47f, -0.2f)
                close()
            }
        }.also { _AngleDoubleSmallDown = it}
