package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Earnings: ImageVector? = null

val Icons.Bs.Earnings: ImageVector
    get() = _Earnings ?: UXIcon(name = "Earnings") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.55f, 0f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineToRelative(5.88f)
                lineTo(0f, 21.88f)
                lineTo(2.12f, 24f)
                lineTo(21f, 5.12f)
                verticalLineTo(11f)
                horizontalLineToRelative(3f)
                verticalLineTo(2.45f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.55f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 11f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 6.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 11f)
                close()
                moveTo(6.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 13f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22f, 17.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 13f)
                close()
                moveTo(17.5f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 19f)
                close()
            }
        }.also { _Earnings = it}
