package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffin: ImageVector? = null

val Icons.Ss.Coffin: ImageVector
    get() = _Coffin ?: UXIcon(name = "Coffin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.31f, 24f)
                horizontalLineTo(5.69f)
                lineToRelative(-3.23f, -15.59f)
                lineTo(5.07f, 1.89f)
                curveToRelative(0.46f, -1.15f, 1.55f, -1.89f, 2.79f, -1.89f)
                horizontalLineToRelative(8.29f)
                curveToRelative(1.23f, 0f, 2.33f, 0.74f, 2.79f, 1.89f)
                lineToRelative(2.61f, 6.52f)
                lineToRelative(-3.23f, 15.59f)
                close()
            }
        }.also { _Coffin = it}
