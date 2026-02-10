package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EditAlt: ImageVector? = null

val Icons.Bs.EditAlt: ImageVector
    get() = _EditAlt ?: UXIcon(name = "EditAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.13f, 1.86f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.28f, 0.12f)
                lineToRelative(-8.14f, 9.09f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.01f, 3.36f)
                lineToRelative(8.4f, -8.4f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.13f, 1.86f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 19f)
                reflectiveCurveToRelative(1f, -6f, 5f, -6f)
                horizontalLineToRelative(0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                horizontalLineToRelative(0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10.98f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineToRelative(5f)
                horizontalLineTo(3f)
                verticalLineTo(3.41f)
                arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.41f, 3f)
                horizontalLineTo(15.25f)
                lineTo(17.36f, 0.65f)
                arcTo(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.07f, 0f)
                horizontalLineTo(3.41f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.41f)
                verticalLineTo(24f)
                horizontalLineTo(18.35f)
                lineTo(24f, 18.35f)
                verticalLineTo(7.98f)
                close()
            }
        }.also { _EditAlt = it}
