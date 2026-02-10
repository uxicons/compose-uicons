package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Earnings: ImageVector? = null

val Icons.Br.Earnings: ImageVector
    get() = _Earnings ?: UXIcon(name = "Earnings") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 0f)
            horizontalLineTo(13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(5.5f)
            arcToRelative(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.34f, 0.04f)
            lineToRelative(-18.4f, 18.4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(18.4f, -18.4f)
            arcTo(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.5f)
            verticalLineTo(11f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
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
    }.also { _Earnings = it }
