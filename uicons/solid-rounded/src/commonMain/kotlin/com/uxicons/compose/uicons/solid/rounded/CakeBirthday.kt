package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeBirthday: ImageVector? = null

val Icons.Sr.CakeBirthday: ImageVector
    get() = _CakeBirthday ?: UXIcon(name = "CakeBirthday") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 23f)
                close()
                moveTo(3.75f, 15f)
                curveToRelative(1.07f, 0f, 1.75f, -0.66f, 1.75f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                curveToRelative(0f, 0.31f, 0.66f, 1f, 1.75f, 1f)
                curveToRelative(1.07f, 0f, 1.75f, -0.66f, 1.75f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                curveToRelative(0f, 0.31f, 0.66f, 1f, 1.75f, 1f)
                curveToRelative(1.07f, 0f, 1.75f, -0.66f, 1.75f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                curveToRelative(0f, 0.31f, 0.66f, 1f, 1.75f, 1f)
                reflectiveCurveTo(22f, 14.31f, 22f, 14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(13f)
                verticalLineTo(6.82f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 4f)
                arcTo(6.68f, 6.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.33f, 0.59f)
                arcToRelative(1.86f, 1.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.66f, 0f)
                arcTo(6.68f, 6.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2.82f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                curveTo(2f, 14.31f, 2.66f, 15f, 3.75f, 15f)
                close()
                moveTo(3f, 20f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(16.62f)
                arcTo(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.25f, 17f)
                arcToRelative(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.75f, -1f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 0.01f)
                arcTo(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 16f)
                arcToRelative(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.75f, 1f)
                arcTo(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16.62f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 20f)
                close()
            }
        }.also { _CakeBirthday = it}
