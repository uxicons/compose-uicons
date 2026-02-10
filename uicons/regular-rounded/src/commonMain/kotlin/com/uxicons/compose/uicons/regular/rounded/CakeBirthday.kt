package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeBirthday: ImageVector? = null

val Icons.Rr.CakeBirthday: ImageVector
    get() = _CakeBirthday ?: UXIcon(name = "CakeBirthday") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(13f)
                verticalLineTo(6.04f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 3.75f)
                arcTo(7.29f, 7.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.74f, 0.33f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.48f, 0f)
                arcTo(7.29f, 7.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 3.75f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 6.04f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(8f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(7f, 11f)
                horizontalLineTo(17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(1.98f)
                curveToRelative(-0.94f, -0.1f, -1.5f, -0.7f, -1.5f, -0.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                curveToRelative(0f, 0.34f, -0.68f, 1f, -1.75f, 1f)
                curveTo(13.66f, 16f, 13f, 15.31f, 13f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                curveToRelative(0f, 0.34f, -0.68f, 1f, -1.75f, 1f)
                curveToRelative(-1.09f, 0f, -1.75f, -0.69f, -1.75f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                curveToRelative(0f, 0.32f, -0.58f, 0.89f, -1.5f, 0.98f)
                verticalLineTo(14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 11f)
                close()
                moveTo(4f, 17.98f)
                arcTo(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 17f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 0.01f)
                arcTo(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 17f)
                arcToRelative(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 0.98f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                close()
            }
        }.also { _CakeBirthday = it}
