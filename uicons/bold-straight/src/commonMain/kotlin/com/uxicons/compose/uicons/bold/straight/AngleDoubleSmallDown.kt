package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallDown: ImageVector? = null

val Icons.Bs.AngleDoubleSmallDown: ImageVector
    get() = _AngleDoubleSmallDown ?: UXIcon(name = "AngleDoubleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 13.03f)
                curveToRelative(-0.45f, 0f, -0.86f, -0.17f, -1.18f, -0.49f)
                lineTo(4.95f, 6.67f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(4.93f, 4.93f)
                lineToRelative(4.93f, -4.93f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-5.87f, 5.87f)
                curveToRelative(-0.32f, 0.32f, -0.73f, 0.49f, -1.18f, 0.49f)
                close()
                moveTo(13.72f, 19.31f)
                lineToRelative(5.34f, -5.34f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-4.99f, 4.99f)
                lineToRelative(-4.9f, -4.9f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(5.25f, 5.25f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.3f, -0.26f, 1.77f, -0.73f)
                close()
            }
        }.also { _AngleDoubleSmallDown = it}
