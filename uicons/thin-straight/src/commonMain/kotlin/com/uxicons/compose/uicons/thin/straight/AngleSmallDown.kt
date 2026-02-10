package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallDown: ImageVector? = null

val Icons.Ts.AngleSmallDown: ImageVector
    get() = _AngleSmallDown ?: UXIcon(name = "AngleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 16.07f)
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
            }
        }.also { _AngleSmallDown = it}
