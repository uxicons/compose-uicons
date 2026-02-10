package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownLeft: ImageVector? = null

val Icons.Ss.DownLeft: ImageVector
    get() = _DownLeft ?: UXIcon(name = "DownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.97f, 23f)
                horizontalLineTo(4f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-0.8f, 0f, -1.55f, -0.31f, -2.12f, -0.88f)
                curveToRelative(-0.57f, -0.57f, -0.88f, -1.32f, -0.88f, -2.13f)
                verticalLineTo(6.03f)
                reflectiveCurveToRelative(4.97f, 4.92f, 4.97f, 4.92f)
                lineTo(16.16f, 0.76f)
                lineToRelative(7.07f, 7.07f)
                lineToRelative(-10.19f, 10.19f)
                lineToRelative(4.94f, 4.98f)
                close()
            }
        }.also { _DownLeft = it}
