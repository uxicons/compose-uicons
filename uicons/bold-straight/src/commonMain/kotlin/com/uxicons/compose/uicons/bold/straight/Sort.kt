package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sort: ImageVector? = null

val Icons.Bs.Sort: ImageVector
    get() = _Sort ?: UXIcon(name = "Sort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.38f, 10f)
                lineTo(1.62f, 10f)
                lineTo(9.93f, 0.92f)
                arcTo(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.08f, 0.93f)
                close()
                moveTo(8.43f, 7f)
                horizontalLineToRelative(7.14f)
                lineTo(12f, 3.1f)
                close()
                moveTo(11.86f, 2.94f)
                horizontalLineToRelative(0f)
                close()
                moveTo(12.15f, 2.93f)
                lineTo(12.15f, 2.93f)
                close()
                moveTo(12f, 24f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.08f, -0.93f)
                lineTo(1.62f, 14f)
                lineTo(22.38f, 14f)
                lineToRelative(-8.31f, 9.08f)
                arcTo(2.79f, 2.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(11.85f, 21.07f)
                lineTo(11.85f, 21.07f)
                close()
                moveTo(12.14f, 21.06f)
                horizontalLineToRelative(0f)
                close()
                moveTo(8.43f, 17f)
                lineTo(12f, 20.9f)
                lineTo(15.57f, 17f)
                close()
            }
        }.also { _Sort = it}
