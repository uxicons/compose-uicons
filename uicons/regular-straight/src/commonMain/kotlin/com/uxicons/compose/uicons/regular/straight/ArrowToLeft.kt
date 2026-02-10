package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToLeft: ImageVector? = null

val Icons.Rs.ArrowToLeft: ImageVector
    get() = _ArrowToLeft ?: UXIcon(name = "ArrowToLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                horizontalLineTo(4.32f)
                lineToRelative(4.3f, -4.3f)
                lineTo(7.21f, 5.28f)
                lineToRelative(-4.95f, 4.95f)
                arcTo(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 10.55f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(13.45f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.26f, 0.32f)
                lineToRelative(4.95f, 4.95f)
                lineTo(8.63f, 17.3f)
                lineTo(4.32f, 13f)
                horizontalLineTo(24f)
                close()
            }
        }.also { _ArrowToLeft = it}
