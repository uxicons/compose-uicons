package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpRight: ImageVector? = null

val Icons.Ss.UpRight: ImageVector
    get() = _UpRight ?: UXIcon(name = "UpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.84f, 23.23f)
                lineTo(0.77f, 16.16f)
                lineTo(10.96f, 5.97f)
                lineTo(6.02f, 0.99f)
                horizontalLineToRelative(13.98f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0.8f, 0f, 1.55f, 0.31f, 2.12f, 0.88f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.13f)
                verticalLineToRelative(13.96f)
                reflectiveCurveToRelative(-4.97f, -4.92f, -4.97f, -4.92f)
                lineTo(7.84f, 23.23f)
                close()
            }
        }.also { _UpRight = it}
