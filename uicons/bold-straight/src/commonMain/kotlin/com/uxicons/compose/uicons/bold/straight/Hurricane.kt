package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hurricane: ImageVector? = null

val Icons.Bs.Hurricane: ImageVector
    get() = _Hurricane ?: UXIcon(name = "Hurricane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
                moveTo(9.86f, 24f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.08f, -0.43f)
                arcTo(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 11f)
                curveTo(2f, 4.52f, 6.99f, 0f, 14.14f, 0f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.08f, 0.43f)
                arcTo(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 13f)
                curveTo(22f, 19.48f, 17.01f, 24f, 9.86f, 24f)
                close()
                moveTo(10.28f, 3.62f)
                arcTo(7.54f, 7.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 11f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 7f)
                horizontalLineToRelative(3.06f)
                reflectiveCurveToRelative(-1.29f, 2.3f, -1.34f, 2.38f)
                arcTo(7.54f, 7.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 13f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, -7f)
                horizontalLineTo(8.94f)
                reflectiveCurveTo(10.23f, 3.7f, 10.28f, 3.62f)
                close()
            }
        }.also { _Hurricane = it}
