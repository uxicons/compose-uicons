package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rhombus: ImageVector? = null

val Icons.Rs.Rhombus: ImageVector
    get() = _Rhombus ?: UXIcon(name = "Rhombus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.83f)
                lineTo(21.17f, 12f)
                lineTo(12f, 21.17f)
                lineTo(2.83f, 12f)
                lineTo(12f, 2.83f)
                moveTo(12f, 0f)
                lineTo(0f, 12f)
                lineTo(12f, 24f)
                lineTo(24f, 12f)
                lineTo(12f, 0f)
                close()
            }
        }.also { _Rhombus = it}
