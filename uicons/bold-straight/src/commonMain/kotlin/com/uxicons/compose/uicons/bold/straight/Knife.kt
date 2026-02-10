package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Knife: ImageVector? = null

val Icons.Bs.Knife: ImageVector
    get() = _Knife ?: UXIcon(name = "Knife") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.36f, 0.19f)
                arcToRelative(2.72f, 2.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0.69f)
                lineTo(0.02f, 21.86f)
                lineToRelative(2.21f, 2.03f)
                lineToRelative(4.44f, -4.82f)
                arcTo(17.31f, 17.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 3f)
                verticalLineTo(2.65f)
                arcTo(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.36f, 0.19f)
                close()
                moveTo(9.74f, 15.74f)
                lineTo(20.96f, 3.57f)
                curveTo(20.64f, 6.28f, 18.23f, 14.04f, 9.74f, 15.74f)
                close()
            }
        }.also { _Knife = it}
