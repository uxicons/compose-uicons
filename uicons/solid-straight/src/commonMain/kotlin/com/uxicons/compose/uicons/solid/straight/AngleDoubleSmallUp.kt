package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallUp: ImageVector? = null

val Icons.Ss.AngleDoubleSmallUp: ImageVector
    get() = _AngleDoubleSmallUp ?: UXIcon(name = "AngleDoubleSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.28f, 11.28f)
                lineToRelative(-5.28f, -5.28f)
                lineToRelative(-5.28f, 5.28f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(5.28f, -5.28f)
                curveToRelative(0.76f, -0.76f, 2.07f, -0.76f, 2.83f, 0f)
                lineToRelative(5.28f, 5.28f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(18.7f, 16.87f)
                lineToRelative(-5.87f, -5.87f)
                curveToRelative(-0.46f, -0.46f, -1.19f, -0.46f, -1.65f, 0f)
                lineToRelative(-5.87f, 5.87f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5.28f, -5.28f)
                lineToRelative(5.28f, 5.28f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _AngleDoubleSmallUp = it}
