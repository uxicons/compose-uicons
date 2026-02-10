package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeBirthday: ImageVector? = null

val Icons.Bs.CakeBirthday: ImageVector
    get() = _CakeBirthday ?: UXIcon(name = "CakeBirthday") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 9f)
                horizontalLineToRelative(-5f)
                verticalLineTo(7.01f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 4.42f)
                curveToRelative(0f, -1.26f, -1.21f, -2.67f, -1.93f, -3.4f)
                lineTo(12f, -0.06f)
                lineTo(10.93f, 1.02f)
                curveTo(10.21f, 1.75f, 9f, 3.17f, 9f, 4.42f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 2.58f)
                verticalLineTo(9f)
                horizontalLineToRelative(-5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12.5f)
                verticalLineTo(21f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(24f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                close()
                moveTo(5f, 15.69f)
                arcTo(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.28f, 16f)
                arcToRelative(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, -2.5f)
                arcTo(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.95f, 16f)
                arcToRelative(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, -2.5f)
                arcTo(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.61f, 16f)
                arcTo(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15.64f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                close()
            }
        }.also { _CakeBirthday = it}
