package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyMask: ImageVector? = null

val Icons.Sr.HockeyMask: ImageVector
    get() = _HockeyMask ?: UXIcon(name = "HockeyMask") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.93f, 0f, 1f, 4.69f, 1f, 10.44f)
                curveTo(1f, 15.9f, 5.62f, 24f, 12f, 24f)
                reflectiveCurveToRelative(11f, -8.1f, 11f, -13.56f)
                curveTo(23f, 4.69f, 18.07f, 0f, 12f, 0f)
                close()
                moveTo(14f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4f)
                close()
                moveTo(10f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                close()
                moveTo(5f, 11f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 9f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11f)
                arcToRelative(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11f)
                close()
                moveTo(10f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 20f)
                close()
                moveTo(10f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 17f)
                close()
                moveTo(12f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                close()
                moveTo(14f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 20f)
                close()
                moveTo(14f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 17f)
                close()
                moveTo(16.5f, 13f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 11f)
                arcToRelative(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, -2f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 11f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 13f)
                close()
            }
        }.also { _HockeyMask = it}
