package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wind: ImageVector? = null

val Icons.Bs.Wind: ImageVector
    get() = _Wind ?: UXIcon(name = "Wind") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 10.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 13.5f)
                horizontalLineTo(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8.5f)
                curveToRelative(2.8f, 0.05f, 3.58f, -4.29f, 0.5f, -4.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                horizontalLineTo(14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                curveTo(26.07f, 3.35f, 25.28f, 13.41f, 18.5f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.4f, 9f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                horizontalLineTo(8.4f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.9f, 4.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 0f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.7f, 24f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, -4.5f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15.7f, 18f)
                horizontalLineTo(0f)
                verticalLineTo(15f)
                horizontalLineTo(15.7f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.7f, 24f)
                close()
            }
        }.also { _Wind = it}
