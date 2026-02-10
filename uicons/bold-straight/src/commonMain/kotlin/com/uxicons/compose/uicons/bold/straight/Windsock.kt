package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Windsock: ImageVector? = null

val Icons.Bs.Windsock: ImageVector
    get() = _Windsock ?: UXIcon(name = "Windsock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.27f)
                lineTo(4.22f, 4.31f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 4.5f)
                lineTo(1f, 24f)
                lineTo(4f, 24f)
                lineTo(4f, 19.73f)
                lineToRelative(20f, -4f)
                close()
                moveTo(14f, 9.33f)
                lineToRelative(2f, 0.4f)
                verticalLineToRelative(4.54f)
                lineToRelative(-2f, 0.4f)
                close()
                moveTo(11f, 15.27f)
                lineTo(9f, 15.67f)
                lineTo(9f, 8.33f)
                lineToRelative(2f, 0.4f)
                close()
                moveTo(4f, 7.33f)
                lineToRelative(2f, 0.4f)
                verticalLineToRelative(8.54f)
                lineToRelative(-2f, 0.4f)
                close()
                moveTo(21f, 13.27f)
                lineTo(19f, 13.67f)
                lineTo(19f, 10.33f)
                lineToRelative(2f, 0.4f)
                close()
            }
        }.also { _Windsock = it}
