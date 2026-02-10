package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppleWhole: ImageVector? = null

val Icons.Bs.AppleWhole: ImageVector
    get() = _AppleWhole ?: UXIcon(name = "AppleWhole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.43f, 6.08f)
                arcToRelative(5.54f, 5.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.98f, -1.22f)
                curveToRelative(1.81f, -1.81f, 1.58f, -4.85f, 1.58f, -4.85f)
                reflectiveCurveToRelative(-3.04f, -0.23f, -4.85f, 1.58f)
                arcToRelative(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.7f, 4.16f)
                arcToRelative(15.77f, 15.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.7f, -5.73f)
                lineTo(9.08f, 1.41f)
                arcTo(12.7f, 12.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.45f, 6f)
                horizontalLineTo(8.66f)
                arcTo(8.85f, 8.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15f)
                curveToRelative(-0.11f, 6.25f, 6.38f, 10.84f, 12f, 8.3f)
                curveToRelative(5.62f, 2.54f, 12.11f, -2.05f, 12f, -8.3f)
                arcTo(8.9f, 8.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.43f, 6.08f)
                close()
                moveTo(15.34f, 21f)
                arcToRelative(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.61f, -0.68f)
                lineToRelative(-0.73f, -0.4f)
                lineToRelative(-0.73f, 0.4f)
                curveTo(7.54f, 22.45f, 2.92f, 19.35f, 3f, 15f)
                arcTo(5.84f, 5.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.66f, 9f)
                horizontalLineToRelative(6.68f)
                curveTo(22.82f, 9.25f, 22.81f, 20.76f, 15.34f, 21f)
                close()
            }
        }.also { _AppleWhole = it}
