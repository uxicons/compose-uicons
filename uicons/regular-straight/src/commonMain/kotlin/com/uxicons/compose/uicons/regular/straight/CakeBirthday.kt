package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeBirthday: ImageVector? = null

val Icons.Rs.CakeBirthday: ImageVector
    get() = _CakeBirthday ?: UXIcon(name = "CakeBirthday") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(13f)
                verticalLineTo(5.79f)
                arcToRelative(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.54f, -2.33f)
                curveTo(14.54f, 2.06f, 12f, 0f, 12f, 0f)
                reflectiveCurveTo(9.46f, 2.06f, 9.46f, 3.46f)
                arcTo(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 5.79f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineTo(22f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                close()
                moveTo(5f, 11f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(2.98f)
                curveToRelative(-0.94f, -0.1f, -1.5f, -0.7f, -1.5f, -0.98f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.34f, -0.68f, 1f, -1.75f, 1f)
                curveTo(13.66f, 15f, 13f, 14.31f, 13f, 14f)
                horizontalLineTo(11f)
                curveToRelative(0f, 0.34f, -0.68f, 1f, -1.75f, 1f)
                curveToRelative(-1.09f, 0f, -1.75f, -0.69f, -1.75f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.32f, -0.58f, 0.89f, -1.5f, 0.98f)
                verticalLineTo(12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11f)
                close()
                moveTo(4f, 16.98f)
                arcTo(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 16f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 0.01f)
                arcTo(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 16f)
                arcToRelative(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 0.98f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                close()
            }
        }.also { _CakeBirthday = it}
