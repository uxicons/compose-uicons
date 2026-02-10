package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rhombus: ImageVector? = null

val Icons.Bs.Rhombus: ImageVector
    get() = _Rhombus ?: UXIcon(name = "Rhombus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.24f)
                lineTo(19.76f, 12f)
                lineTo(12f, 19.76f)
                lineTo(4.24f, 12f)
                lineTo(12f, 4.24f)
                moveTo(12f, 0f)
                lineTo(0f, 12f)
                lineTo(12f, 24f)
                lineTo(24f, 12f)
                lineTo(12f, 0f)
                close()
            }
        }.also { _Rhombus = it}
