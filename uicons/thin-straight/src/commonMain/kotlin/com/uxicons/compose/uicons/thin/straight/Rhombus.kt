package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rhombus: ImageVector? = null

val Icons.Ts.Rhombus: ImageVector
    get() = _Rhombus ?: UXIcon(name = "Rhombus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                lineTo(0f, 12f)
                lineTo(12f, 0f)
                lineToRelative(12f, 12f)
                lineToRelative(-12f, 12f)
                close()
                moveTo(1.41f, 12f)
                lineToRelative(10.59f, 10.59f)
                lineToRelative(10.59f, -10.59f)
                lineTo(12f, 1.41f)
                lineTo(1.41f, 12f)
                close()
            }
        }.also { _Rhombus = it}
