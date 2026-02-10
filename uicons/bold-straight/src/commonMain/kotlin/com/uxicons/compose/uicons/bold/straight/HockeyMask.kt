package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyMask: ImageVector? = null

val Icons.Bs.HockeyMask: ImageVector
    get() = _HockeyMask ?: UXIcon(name = "HockeyMask") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.62f, 24f, 1f, 15.95f, 1f, 10.52f)
                arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 10.52f)
                curveTo(23f, 15.95f, 18.38f, 24f, 12f, 24f)
                close()
                moveTo(12f, 3f)
                arcToRelative(7.78f, 7.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 7.51f)
                curveTo(4f, 14.66f, 7.58f, 21f, 12f, 21f)
                reflectiveCurveToRelative(8f, -6.34f, 8f, -10.48f)
                arcTo(7.78f, 7.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
                moveTo(16.5f, 9f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 11f)
                arcToRelative(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 2f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 11f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 9f)
                close()
                moveTo(7.5f, 9f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 11f)
                arcToRelative(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 2f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 11f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 9f)
                close()
                moveTo(12f, 13f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                close()
                moveTo(12f, 17f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                close()
                moveTo(12f, 5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                close()
            }
        }.also { _HockeyMask = it}
