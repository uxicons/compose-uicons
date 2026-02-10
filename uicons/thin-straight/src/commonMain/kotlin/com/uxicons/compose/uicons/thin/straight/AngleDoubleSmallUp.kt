package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallUp: ImageVector? = null

val Icons.Ts.AngleDoubleSmallUp: ImageVector
    get() = _AngleDoubleSmallUp ?: UXIcon(name = "AngleDoubleSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.64f, 11.43f)
                lineToRelative(-5.28f, -5.28f)
                curveToRelative(-0.19f, -0.19f, -0.52f, -0.19f, -0.71f, 0f)
                lineToRelative(-5.28f, 5.28f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(5.28f, -5.28f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                lineToRelative(5.28f, 5.28f)
                lineToRelative(-0.71f, 0.71f)
                close()
                moveTo(18.34f, 18.07f)
                lineToRelative(-5.87f, -5.87f)
                curveToRelative(-0.25f, -0.25f, -0.69f, -0.25f, -0.94f, -0.0f)
                lineToRelative(-5.87f, 5.87f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(5.63f, -5.63f)
                lineToRelative(5.63f, 5.63f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _AngleDoubleSmallUp = it}
