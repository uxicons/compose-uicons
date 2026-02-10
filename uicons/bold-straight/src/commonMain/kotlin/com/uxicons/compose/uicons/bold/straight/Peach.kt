package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peach: ImageVector? = null

val Icons.Bs.Peach: ImageVector
    get() = _Peach ?: UXIcon(name = "Peach") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.78f, 6.34f)
                arcToRelative(8.68f, 8.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.04f, 0.99f)
                arcToRelative(9.09f, 9.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, 0.89f)
                arcToRelative(4.76f, 4.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, 3.3f)
                curveTo(21f, 16.9f, 14.61f, 21f, 12f, 21f)
                reflectiveCurveToRelative(-9f, -4.1f, -9f, -9.48f)
                arcTo(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 7f)
                curveTo(10.1f, 7f, 13f, 8.93f, 13f, 11.5f)
                arcToRelative(9.67f, 9.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.7f, 5.1f)
                lineToRelative(2.4f, 1.8f)
                arcTo(12.61f, 12.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 11.5f)
                arcToRelative(6.58f, 6.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, -4.01f)
                arcToRelative(8.54f, 8.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.88f, -1.72f)
                arcToRelative(6.72f, 6.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.43f, -4.23f)
                lineToRelative(0.07f, -0.69f)
                lineTo(21.36f, 0.55f)
                arcTo(6.82f, 6.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.52f, 0f)
                arcToRelative(7.31f, 7.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.91f, 2.87f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
                verticalLineTo(3f)
                arcToRelative(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.03f, 1.39f)
                arcTo(8.78f, 8.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 4f)
                arcTo(7.35f, 7.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.52f)
                curveTo(0f, 18.73f, 7.89f, 24f, 12f, 24f)
                reflectiveCurveToRelative(12f, -5.27f, 12f, -12.48f)
                arcTo(7.76f, 7.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.78f, 6.34f)
                close()
            }
        }.also { _Peach = it}
