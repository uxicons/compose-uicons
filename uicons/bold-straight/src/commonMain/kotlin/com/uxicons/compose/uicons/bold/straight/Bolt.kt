package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bolt: ImageVector? = null

val Icons.Bs.Bolt: ImageVector
    get() = _Bolt ?: UXIcon(name = "Bolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.31f, 24f)
                horizontalLineTo(8.07f)
                lineTo(10.1f, 16f)
                horizontalLineTo(6.96f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.1f, 12.14f)
                lineTo(8.44f, 0f)
                horizontalLineToRelative(9.63f)
                lineTo(15.23f, 7f)
                horizontalLineToRelative(2.81f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 11.6f)
                close()
                moveTo(13.95f, 13f)
                lineToRelative(-1.26f, 4.98f)
                lineTo(18f, 9.94f)
                lineTo(10.77f, 10f)
                lineToRelative(2.84f, -7f)
                horizontalLineTo(10.56f)
                lineTo(6.95f, 13.08f)
                close()
            }
        }.also { _Bolt = it}
