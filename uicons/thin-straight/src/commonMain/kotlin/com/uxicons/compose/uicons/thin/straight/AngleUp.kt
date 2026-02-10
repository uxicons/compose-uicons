package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleUp: ImageVector? = null

val Icons.Ts.AngleUp: ImageVector
    get() = _AngleUp ?: UXIcon(name = "AngleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.18f, 17.97f)
                lineTo(12.35f, 7.15f)
                curveToRelative(-0.19f, -0.19f, -0.52f, -0.19f, -0.71f, 0f)
                lineTo(0.82f, 17.97f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(10.94f, 6.44f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                lineToRelative(10.83f, 10.83f)
                lineToRelative(-0.71f, 0.71f)
                close()
            }
        }.also { _AngleUp = it}
