package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldPlus: ImageVector? = null

val Icons.Sr.ShieldPlus: ImageVector
    get() = _ShieldPlus ?: UXIcon(name = "ShieldPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.58f, 2.14f)
                lineTo(12.32f, 0.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.63f, 0f)
                lineTo(5.42f, 2.14f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6.88f)
                verticalLineTo(12f)
                curveToRelative(0f, 7.56f, 9.2f, 11.74f, 9.59f, 11.91f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.81f, 0f)
                curveTo(12.8f, 23.74f, 22f, 19.56f, 22f, 12f)
                verticalLineTo(6.88f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.58f, 2.14f)
                close()
                moveTo(15f, 12f)
                horizontalLineTo(13f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
        }.also { _ShieldPlus = it}
