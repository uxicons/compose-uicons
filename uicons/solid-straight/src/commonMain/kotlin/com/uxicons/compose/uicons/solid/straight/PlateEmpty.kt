package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEmpty: ImageVector? = null

val Icons.Ss.PlateEmpty: ImageVector
    get() = _PlateEmpty ?: UXIcon(name = "PlateEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 8.48f)
                curveToRelative(-0.78f, 4.6f, -3.87f, 8.69f, -7.73f, 10.52f)
                horizontalLineTo(7.78f)
                curveTo(3.91f, 17.18f, 0.82f, 13.09f, 0.04f, 8.48f)
                curveToRelative(-0.34f, -1.77f, 1.17f, -3.53f, 2.97f, -3.48f)
                horizontalLineTo(20.99f)
                curveToRelative(1.79f, -0.04f, 3.31f, 1.72f, 2.97f, 3.48f)
                close()
            }
        }.also { _PlateEmpty = it}
