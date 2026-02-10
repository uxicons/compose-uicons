package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallDown: ImageVector? = null

val Icons.Rs.AngleDoubleSmallDown: ImageVector
    get() = _AngleDoubleSmallDown ?: UXIcon(name = "AngleDoubleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveToRelative(-0.53f, 0f, -1.04f, -0.21f, -1.41f, -0.59f)
                lineToRelative(-5.28f, -5.28f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(5.28f, 5.28f)
                lineToRelative(5.28f, -5.28f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-5.28f, 5.28f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.41f, 0.59f)
                close()
                moveTo(12.82f, 13.0f)
                lineToRelative(5.87f, -5.87f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-5.28f, 5.28f)
                lineTo(6.72f, 5.71f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(5.87f, 5.87f)
                curveToRelative(0.23f, 0.23f, 0.52f, 0.34f, 0.82f, 0.34f)
                reflectiveCurveToRelative(0.6f, -0.11f, 0.83f, -0.34f)
                close()
            }
        }.also { _AngleDoubleSmallDown = it}
