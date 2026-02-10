package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lambda: ImageVector? = null

val Icons.Ts.Lambda: ImageVector
    get() = _Lambda ?: UXIcon(name = "Lambda") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.24f)
                curveToRelative(-0.96f, 0f, -1.84f, -0.56f, -2.26f, -1.42f)
                lineToRelative(-7.13f, -14.92f)
                lineTo(2.66f, 24f)
                horizontalLineToRelative(-1.13f)
                lineTo(10.83f, 6.52f)
                lineToRelative(-2.23f, -4.67f)
                curveToRelative(-0.25f, -0.52f, -0.78f, -0.85f, -1.35f, -0.85f)
                horizontalLineToRelative(-3.24f)
                verticalLineTo(0f)
                horizontalLineToRelative(3.24f)
                curveToRelative(0.96f, 0f, 1.84f, 0.56f, 2.26f, 1.42f)
                lineToRelative(9.91f, 20.73f)
                curveToRelative(0.25f, 0.52f, 0.78f, 0.85f, 1.35f, 0.85f)
                horizontalLineToRelative(3.24f)
                close()
            }
        }.also { _Lambda = it}
