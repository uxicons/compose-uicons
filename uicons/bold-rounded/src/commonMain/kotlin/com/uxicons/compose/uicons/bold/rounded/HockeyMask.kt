package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyMask: ImageVector? = null

val Icons.Br.HockeyMask: ImageVector
    get() = _HockeyMask ?: UXIcon(name = "HockeyMask") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 10.52f)
            curveTo(1f, 15.95f, 5.62f, 24f, 12f, 24f)
            reflectiveCurveToRelative(11f, -8.05f, 11f, -13.48f)
            arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.42f, 0f, -8f, -6.34f, -8f, -10.48f)
            arcTo(7.78f, 7.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
            arcToRelative(7.78f, 7.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 7.51f)
            curveTo(20f, 14.66f, 16.42f, 21f, 12f, 21f)
            close()
            moveTo(19f, 11f)
            arcToRelative(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2f)
            arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 11f)
            arcToRelative(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, -2f)
            arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 11f)
            close()
            moveTo(10f, 11f)
            arcToRelative(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2f)
            arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11f)
            arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 9f)
            arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11f)
            close()
            moveTo(13.5f, 14.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 13f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 14.5f)
            close()
            moveTo(13.5f, 18.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 17f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 18.5f)
            close()
            moveTo(13.5f, 6.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 6.5f)
            close()
        }
    }.also { _HockeyMask = it }
