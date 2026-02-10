package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDown: ImageVector? = null

val Icons.Ts.AngleDown: ImageVector
    get() = _AngleDown ?: UXIcon(name = "AngleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 18f)
                curveToRelative(-0.4f, 0f, -0.78f, -0.16f, -1.06f, -0.44f)
                lineTo(0.11f, 6.73f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(10.83f, 10.83f)
                curveToRelative(0.19f, 0.19f, 0.52f, 0.19f, 0.71f, 0f)
                lineToRelative(10.83f, -10.83f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-10.83f, 10.83f)
                curveToRelative(-0.28f, 0.28f, -0.66f, 0.44f, -1.06f, 0.44f)
                close()
            }
        }.also { _AngleDown = it}
