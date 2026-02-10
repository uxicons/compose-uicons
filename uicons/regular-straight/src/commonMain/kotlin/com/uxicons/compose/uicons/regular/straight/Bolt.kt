package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bolt: ImageVector? = null

val Icons.Rs.Bolt: ImageVector
    get() = _Bolt ?: UXIcon(name = "Bolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.57f, 24f)
                lineTo(8.72f, 24f)
                lineToRelative(2f, -8f)
                lineTo(6.59f, 16f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.45f, -3.3f)
                lineTo(7.98f, 0f)
                horizontalLineToRelative(9.47f)
                lineToRelative(-3f, 8f)
                horizontalLineToRelative(4.02f)
                arcToRelative(2.53f, 2.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.11f, 3.93f)
                close()
                moveTo(11.28f, 22f)
                horizontalLineToRelative(0.21f)
                lineToRelative(7.42f, -11.17f)
                arcTo(0.53f, 0.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.47f, 10f)
                lineTo(11.56f, 10f)
                lineToRelative(3f, -8f)
                lineTo(9.46f, 2f)
                lineTo(6.05f, 13.28f)
                arcTo(0.56f, 0.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.59f, 14f)
                horizontalLineToRelative(6.7f)
                close()
            }
        }.also { _Bolt = it}
