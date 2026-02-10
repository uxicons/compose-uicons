package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallUp: ImageVector? = null

val Icons.Bs.AngleDoubleSmallUp: ImageVector
    get() = _AngleDoubleSmallUp ?: UXIcon(name = "AngleDoubleSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.93f, 12.11f)
                lineToRelative(-4.93f, -4.93f)
                lineToRelative(-4.93f, 4.93f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(5.28f, -5.28f)
                curveToRelative(0.94f, -0.94f, 2.59f, -0.94f, 3.54f, 0f)
                lineToRelative(5.28f, 5.28f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(19.05f, 17.36f)
                lineToRelative(-5.87f, -5.87f)
                curveToRelative(-0.63f, -0.64f, -1.74f, -0.63f, -2.36f, -0.0f)
                lineToRelative(-5.87f, 5.87f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.93f, -4.93f)
                lineToRelative(4.93f, 4.93f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(11.06f, 13.62f)
                lineToRelative(-0.01f, -0.01f)
                lineToRelative(0.01f, 0.01f)
                close()
                moveTo(12.94f, 13.61f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(-0.01f, 0.01f)
                close()
            }
        }.also { _AngleDoubleSmallUp = it}
