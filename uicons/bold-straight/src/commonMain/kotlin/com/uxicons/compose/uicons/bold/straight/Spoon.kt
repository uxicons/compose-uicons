package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spoon: ImageVector? = null

val Icons.Bs.Spoon: ImageVector
    get() = _Spoon ?: UXIcon(name = "Spoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.84f, 1.16f)
                curveToRelative(-2.71f, -2.71f, -8.75f, -0.13f, -11f, 2.12f)
                arcToRelative(6.28f, 6.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.93f, 7.68f)
                lineTo(0.06f, 21.81f)
                lineToRelative(2.12f, 2.12f)
                lineTo(13.03f, 13.09f)
                arcToRelative(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.68f, -0.93f)
                curveTo(22.97f, 9.91f, 25.55f, 3.87f, 22.84f, 1.16f)
                close()
                moveTo(18.59f, 10.04f)
                arcToRelative(3.36f, 3.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.63f, 0f)
                arcToRelative(3.28f, 3.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.63f)
                arcToRelative(9.81f, 9.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.71f, -2.42f)
                arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.05f, 0.3f)
                curveTo(21.63f, 4.19f, 20.34f, 8.3f, 18.59f, 10.04f)
                close()
            }
        }.also { _Spoon = it}
