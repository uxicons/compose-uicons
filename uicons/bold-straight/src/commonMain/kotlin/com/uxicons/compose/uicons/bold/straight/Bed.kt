package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bed: ImageVector? = null

val Icons.Bs.Bed: ImageVector
    get() = _Bed ?: UXIcon(name = "Bed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 5f)
                horizontalLineToRelative(-7f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 8.5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                horizontalLineTo(0f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineTo(8.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 5f)
                close()
                moveTo(13f, 13f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineTo(13f)
                close()
                moveTo(6.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 12f)
                close()
            }
        }.also { _Bed = it}
