package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bed: ImageVector? = null

val Icons.Rs.Bed: ImageVector
    get() = _Bed ?: UXIcon(name = "Bed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                horizontalLineTo(11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.06f, 8.39f)
                arcTo(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 8f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11.5f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, 13f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(0f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 6f)
                close()
                moveTo(10f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineTo(10f)
                close()
                moveTo(5f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11.5f)
                close()
                moveTo(2f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Bed = it}
