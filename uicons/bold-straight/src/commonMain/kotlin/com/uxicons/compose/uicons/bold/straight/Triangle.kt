package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Triangle: ImageVector? = null

val Icons.Bs.Triangle: ImageVector
    get() = _Triangle ?: UXIcon(name = "Triangle", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(512f, 448f)
                horizontalLineTo(0f)
                lineTo(209.41f, 86.61f)
                curveToRelative(14.95f, -25.73f, 47.94f, -34.47f, 73.67f, -19.52f)
                curveToRelative(8.09f, 4.7f, 14.81f, 11.43f, 19.52f, 19.52f)
                lineTo(512f, 448f)
                close()
                moveTo(111.25f, 384f)
                horizontalLineToRelative(289.49f)
                lineTo(256f, 134.19f)
                lineTo(111.25f, 384f)
                close()
            }
        }.also { _Triangle = it}
