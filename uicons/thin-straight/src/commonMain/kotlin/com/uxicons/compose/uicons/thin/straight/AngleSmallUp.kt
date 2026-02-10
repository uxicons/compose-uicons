package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallUp: ImageVector? = null

val Icons.Ts.AngleSmallUp: ImageVector
    get() = _AngleSmallUp ?: UXIcon(name = "AngleSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.64f, 14.43f)
                lineToRelative(-5.28f, -5.28f)
                curveToRelative(-0.19f, -0.19f, -0.52f, -0.19f, -0.71f, 0f)
                lineToRelative(-5.28f, 5.28f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(5.28f, -5.28f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                lineToRelative(5.28f, 5.28f)
                lineToRelative(-0.71f, 0.71f)
                close()
            }
        }.also { _AngleSmallUp = it}
