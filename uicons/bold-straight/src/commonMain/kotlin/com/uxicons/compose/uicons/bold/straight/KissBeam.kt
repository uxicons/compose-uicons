package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KissBeam: ImageVector? = null

val Icons.Bs.KissBeam: ImageVector
    get() = _KissBeam ?: UXIcon(name = "KissBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                curveTo(-3.9f, 23.4f, -3.89f, 0.6f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(21f, 12f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                curveTo(0.08f, 3.45f, 0.08f, 20.55f, 12f, 21f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                close()
                moveTo(8f, 6f)
                curveTo(5.73f, 6f, 5f, 9.37f, 5f, 11f)
                curveToRelative(2.76f, -2.61f, 3.25f, -2.59f, 6f, 0f)
                curveTo(11f, 9.37f, 10.27f, 6f, 8f, 6f)
                close()
                moveTo(16f, 6f)
                curveToRelative(-2.27f, 0f, -3f, 3.37f, -3f, 5f)
                curveToRelative(2.76f, -2.61f, 3.25f, -2.59f, 6f, 0f)
                curveTo(19f, 9.37f, 18.27f, 6f, 16f, 6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 12f)
                horizontalLineTo(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1f)
                horizontalLineTo(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1f)
                horizontalLineTo(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.99f, -4f)
                arcTo(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14.5f)
                close()
            }
        }.also { _KissBeam = it}
