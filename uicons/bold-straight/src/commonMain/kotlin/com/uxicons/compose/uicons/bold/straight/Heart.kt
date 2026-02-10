package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heart: ImageVector? = null

val Icons.Bs.Heart: ImageVector
    get() = _Heart ?: UXIcon(name = "Heart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23.46f)
                lineToRelative(-0.87f, -0.61f)
                curveTo(9.99f, 22.04f, 0f, 14.78f, 0f, 8.15f)
                arcTo(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.75f, 0.88f)
                arcTo(6.57f, 6.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3.58f)
                arcTo(6.57f, 6.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.25f, 0.88f)
                arcTo(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 8.15f)
                curveToRelative(0f, 6.63f, -9.99f, 13.89f, -11.13f, 14.7f)
                close()
                moveTo(6.75f, 3.88f)
                arcTo(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 8.15f)
                curveToRelative(0f, 3.92f, 5.86f, 9.21f, 9f, 11.61f)
                curveToRelative(3.14f, -2.4f, 9f, -7.7f, 9f, -11.61f)
                arcToRelative(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.75f, -4.28f)
                arcTo(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 8.15f)
                horizontalLineToRelative(-3f)
                arcTo(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.75f, 3.88f)
                close()
            }
        }.also { _Heart = it}
