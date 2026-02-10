package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpLeft: ImageVector? = null

val Icons.Ss.UpLeft: ImageVector
    get() = _UpLeft ?: UXIcon(name = "UpLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.17f, 23.24f)
                lineTo(5.97f, 13.05f)
                lineTo(1f, 17.97f)
                verticalLineTo(4.01f)
                curveToRelative(0f, -0.8f, 0.32f, -1.56f, 0.88f, -2.13f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                horizontalLineToRelative(13.98f)
                reflectiveCurveToRelative(-4.94f, 4.97f, -4.94f, 4.97f)
                lineToRelative(10.19f, 10.19f)
                lineToRelative(-7.07f, 7.07f)
                close()
            }
        }.also { _UpLeft = it}
