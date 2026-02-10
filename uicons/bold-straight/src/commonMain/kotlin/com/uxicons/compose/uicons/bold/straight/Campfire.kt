package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Campfire: ImageVector? = null

val Icons.Bs.Campfire: ImageVector
    get() = _Campfire ?: UXIcon(name = "Campfire") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.53f, 18.51f)
                lineToRelative(7.35f, 2.58f)
                lineToRelative(-0.99f, 2.83f)
                lineToRelative(-10.89f, -3.82f)
                lineToRelative(-10.89f, 3.82f)
                lineToRelative(-0.99f, -2.83f)
                lineToRelative(7.35f, -2.58f)
                lineTo(0.12f, 15.93f)
                lineToRelative(0.99f, -2.83f)
                lineToRelative(10.89f, 3.82f)
                lineToRelative(10.89f, -3.82f)
                lineToRelative(0.99f, 2.83f)
                lineToRelative(-7.35f, 2.58f)
                close()
                moveTo(6f, 8f)
                curveToRelative(0f, -1.73f, 1f, -3.06f, 2.0f, -4.09f)
                curveToRelative(0f, 0f, 0.68f, 2.09f, 1.29f, 2.09f)
                curveToRelative(1.26f, 0f, 0.9f, -3.9f, 2.72f, -6f)
                curveToRelative(1.9f, 1.9f, 6f, 4.53f, 6f, 8f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(10.59f, 11.41f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                reflectiveCurveToRelative(0.78f, -2.05f, 0f, -2.83f)
                horizontalLineToRelative(0f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(-1.42f, 1.42f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                close()
            }
        }.also { _Campfire = it}
