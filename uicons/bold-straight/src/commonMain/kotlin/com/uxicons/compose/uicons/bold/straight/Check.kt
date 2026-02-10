package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Check: ImageVector? = null

val Icons.Bs.Check: ImageVector
    get() = _Check ?: UXIcon(name = "Check") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.8f, 21.43f)
                arcTo(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 20.68f)
                lineTo(0.44f, 15.12f)
                lineTo(2.56f, 13f)
                lineTo(7.8f, 18.24f)
                lineTo(21.44f, 4.6f)
                lineToRelative(2.12f, 2.12f)
                lineTo(9.6f, 20.68f)
                arcTo(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.8f, 21.43f)
                close()
            }
        }.also { _Check = it}
