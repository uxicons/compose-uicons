package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Info: ImageVector? = null

val Icons.Bs.Info: ImageVector
    get() = _Info ?: UXIcon(name = "Info") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.46f, 18.68f)
                horizontalLineToRelative(-3f)
                verticalLineTo(12.54f)
                horizontalLineTo(10.09f)
                verticalLineToRelative(-3f)
                horizontalLineTo(12f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.46f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.28f, 6.75f)
                moveToRelative(-1.72f, 0f)
                arcToRelative(1.72f, 1.72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3.43f, 0f)
                arcToRelative(1.72f, 1.72f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3.43f, 0f)
            }
        }.also { _Info = it}
