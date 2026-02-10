package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToTop: ImageVector? = null

val Icons.Rs.ArrowToTop: ImageVector
    get() = _ArrowToTop ?: UXIcon(name = "ArrowToTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.55f, 2f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.32f, 0.26f)
                lineToRelative(-4.95f, 4.95f)
                lineTo(6.7f, 8.63f)
                lineToRelative(4.3f, -4.3f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(4.32f)
                lineToRelative(4.3f, 4.3f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.95f, -4.95f)
                arcTo(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.45f, 2f)
                horizontalLineTo(19f)
                verticalLineTo(0f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                close()
            }
        }.also { _ArrowToTop = it}
