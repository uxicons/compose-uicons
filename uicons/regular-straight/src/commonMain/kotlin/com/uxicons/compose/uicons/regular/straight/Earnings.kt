package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Earnings: ImageVector? = null

val Icons.Rs.Earnings: ImageVector
    get() = _Earnings ?: UXIcon(name = "Earnings") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                horizontalLineToRelative(7.59f)
                lineTo(0f, 22.59f)
                lineTo(1.41f, 24f)
                lineTo(22f, 3.41f)
                verticalLineTo(11f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10f)
                close()
                moveTo(6f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14f)
                close()
                moveTo(18f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 20f)
                close()
            }
        }.also { _Earnings = it}
