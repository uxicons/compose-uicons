package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Caravan: ImageVector? = null

val Icons.Bs.Caravan: ImageVector
    get() = _Caravan ?: UXIcon(name = "Caravan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 20.5f)
                close()
                moveTo(10f, 7f)
                horizontalLineTo(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                close()
                moveTo(22f, 17f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.5f)
                verticalLineTo(19.89f)
                horizontalLineTo(2f)
                arcToRelative(5.45f, 5.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -2.67f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                horizontalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(17.36f)
                arcTo(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.97f, 20f)
                horizontalLineTo(24f)
                verticalLineTo(17f)
                close()
            }
        }.also { _Caravan = it}
