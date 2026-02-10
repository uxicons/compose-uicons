package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeTwentyFour: ImageVector? = null

val Icons.Bs.TimeTwentyFour: ImageVector
    get() = _TimeTwentyFour ?: UXIcon(name = "TimeTwentyFour") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15.62f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.5f, 0f)
                verticalLineTo(16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.38f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 0f)
                curveToRelative(0f, 0.62f, -1.19f, 1.52f, -2.15f, 2.24f)
                curveTo(8.28f, 19.04f, 6.5f, 20.38f, 6.5f, 22.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 24f)
                horizontalLineToRelative(7f)
                verticalLineTo(21f)
                horizontalLineTo(10.7f)
                curveToRelative(0.31f, -0.25f, 0.65f, -0.5f, 0.95f, -0.74f)
                curveTo(13.22f, 19.09f, 15f, 17.75f, 15f, 15.62f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-0.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 15.75f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineToRelative(3.75f)
                arcTo(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.25f, 20f)
                horizontalLineTo(21f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineTo(12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.47f, 3.53f)
                arcTo(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.83f, 18.34f)
                lineToRelative(2.19f, -2.19f)
                arcTo(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                arcToRelative(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.35f, 2.65f)
                lineTo(16f, 8f)
                horizontalLineToRelative(5.91f)
                arcTo(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 6.91f)
                verticalLineTo(1f)
                close()
            }
        }.also { _TimeTwentyFour = it}
