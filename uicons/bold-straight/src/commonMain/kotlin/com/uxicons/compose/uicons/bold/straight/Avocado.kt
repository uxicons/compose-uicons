package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Avocado: ImageVector? = null

val Icons.Bs.Avocado: ImageVector
    get() = _Avocado ?: UXIcon(name = "Avocado") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 16.02f)
                curveToRelative(0f, -2.53f, 1.71f, -4.97f, 3f, -4.97f)
                reflectiveCurveToRelative(3f, 2.44f, 3f, 4.97f)
                arcTo(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                arcTo(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 16.02f)
                close()
                moveTo(22f, 14.69f)
                arcToRelative(8.53f, 8.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.96f, -5.77f)
                arcToRelative(13.83f, 13.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.23f, -4.37f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                curveTo(8.02f, 0f, 2f, 5.86f, 2f, 14.69f)
                curveTo(2f, 19.82f, 6.49f, 24f, 12f, 24f)
                reflectiveCurveTo(22f, 19.82f, 22f, 14.69f)
                close()
                moveTo(14.94f, 5.4f)
                arcToRelative(16.72f, 16.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.7f, 5.32f)
                arcTo(5.61f, 5.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 14.69f)
                curveTo(19f, 18.17f, 15.86f, 21f, 12f, 21f)
                reflectiveCurveToRelative(-7f, -2.83f, -7f, -6.31f)
                curveTo(5f, 7.1f, 9.97f, 3f, 12f, 3f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.94f, 5.4f)
                close()
            }
        }.also { _Avocado = it}
