package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hamburger: ImageVector? = null

val Icons.Bs.Hamburger: ImageVector
    get() = _Hamburger ?: UXIcon(name = "Hamburger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8.5f)
                close()
                moveTo(11.5f, 8f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 8f)
                close()
                moveTo(23f, 15.72f)
                verticalLineTo(19.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 24f)
                horizontalLineTo(5.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 19.5f)
                verticalLineTo(15.72f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.45f)
                verticalLineTo(9.14f)
                arcTo(9.15f, 9.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.14f, 0f)
                horizontalLineToRelative(3.73f)
                arcTo(9.15f, 9.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 9.14f)
                verticalLineToRelative(3.14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 15.72f)
                close()
                moveTo(4f, 9.14f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(9.14f)
                arcTo(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.86f, 3f)
                horizontalLineTo(10.14f)
                arcTo(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 9.14f)
                close()
                moveTo(20f, 19.5f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                curveToRelative(-3.13f, 0f, -3.18f, 0.29f, -5.5f, 2.3f)
                arcToRelative(2.81f, 2.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.72f, 0f)
                curveTo(6.17f, 16.9f, 5.59f, 16.15f, 4f, 16.03f)
                verticalLineTo(19.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
                horizontalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 19.5f)
                close()
            }
        }.also { _Hamburger = it}
