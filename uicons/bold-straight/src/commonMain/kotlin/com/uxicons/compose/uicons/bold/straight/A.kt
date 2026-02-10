package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _A: ImageVector? = null

val Icons.Bs.A: ImageVector
    get() = _A ?: UXIcon(name = "A") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.77f, 24f)
                horizontalLineToRelative(3.23f)
                lineTo(15.31f, 1.94f)
                curveToRelative(-0.6f, -1.2f, -1.8f, -1.94f, -3.13f, -1.94f)
                curveToRelative(-1.36f, 0f, -2.54f, 0.75f, -3.17f, 2.03f)
                lineTo(0f, 24f)
                horizontalLineTo(3.25f)
                lineToRelative(2.46f, -6f)
                horizontalLineToRelative(12.7f)
                lineToRelative(2.36f, 6f)
                close()
                moveTo(6.93f, 15f)
                lineTo(11.73f, 3.28f)
                curveToRelative(0.18f, -0.36f, 0.78f, -0.23f, 0.84f, -0.11f)
                lineToRelative(4.65f, 11.83f)
                horizontalLineTo(6.93f)
                close()
            }
        }.also { _A = it}
