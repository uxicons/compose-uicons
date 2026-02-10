package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Knife: ImageVector? = null

val Icons.Br.Knife: ImageVector
    get() = _Knife ?: UXIcon(name = "Knife") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.36f, 0.19f)
            arcToRelative(2.72f, 2.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0.69f)
            lineTo(0.4f, 21.48f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 23.52f)
            lineToRelative(4.09f, -4.44f)
            arcTo(17.31f, 17.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 3f)
            verticalLineTo(2.65f)
            arcTo(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.36f, 0.19f)
            close()
            moveTo(9.76f, 15.74f)
            lineToRelative(11.2f, -12.16f)
            curveTo(20.63f, 6.28f, 18.23f, 14.02f, 9.76f, 15.74f)
            close()
        }
    }.also { _Knife = it }
