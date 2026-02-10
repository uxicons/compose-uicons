package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hexagon: ImageVector? = null

val Icons.Ss.Hexagon: ImageVector
    get() = _Hexagon ?: UXIcon(name = "Hexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12.02f)
                curveToRelative(0f, -0.5f, 0.12f, -1f, 0.37f, -1.46f)
                lineTo(4.64f, 2.59f)
                curveToRelative(0.52f, -0.97f, 1.54f, -1.58f, 2.64f, -1.58f)
                horizontalLineToRelative(9.46f)
                curveToRelative(1.11f, 0f, 2.12f, 0.61f, 2.65f, 1.59f)
                lineToRelative(4.25f, 7.96f)
                curveToRelative(0.48f, 0.91f, 0.48f, 1.99f, 0f, 2.9f)
                lineToRelative(-4.25f, 7.96f)
                curveToRelative(-0.52f, 0.98f, -1.54f, 1.59f, -2.65f, 1.59f)
                horizontalLineTo(7.28f)
                curveToRelative(-1.11f, 0f, -2.12f, -0.61f, -2.64f, -1.58f)
                lineTo(0.37f, 13.47f)
                curveTo(0.12f, 13.02f, 0f, 12.52f, 0f, 12.02f)
                close()
            }
        }.also { _Hexagon = it}
