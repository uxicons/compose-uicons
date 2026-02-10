package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EggFried: ImageVector? = null

val Icons.Bs.EggFried: ImageVector
    get() = _EggFried ?: UXIcon(name = "EggFried") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 9.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 5f)
                close()
                moveTo(9.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 11f)
                close()
                moveTo(18.47f, 5.14f)
                arcTo(9.67f, 9.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.09f, 0f)
                arcTo(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.09f)
                verticalLineToRelative(0.95f)
                arcTo(12.97f, 12.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.95f, 24f)
                arcToRelative(7.87f, 7.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.99f, -6.72f)
                arcTo(7.16f, 7.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.52f)
                arcTo(6.7f, 6.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.47f, 5.14f)
                close()
                moveTo(18.81f, 15.07f)
                lineTo(18f, 15.58f)
                lineTo(18f, 16.5f)
                curveToRelative(0f, 2.44f, -2.31f, 4.5f, -5.05f, 4.5f)
                arcTo(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 11.04f)
                verticalLineToRelative(-0.95f)
                arcTo(7.1f, 7.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.09f, 3f)
                arcToRelative(6.86f, 6.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.06f, 4.16f)
                lineToRelative(0.37f, 0.74f)
                lineToRelative(0.83f, 0.08f)
                curveTo(19.14f, 8.18f, 21f, 9.55f, 21f, 11.52f)
                arcTo(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.81f, 15.07f)
                close()
                moveTo(19f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 11.5f)
                close()
                moveTo(16f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16.5f)
                close()
            }
        }.also { _EggFried = it}
