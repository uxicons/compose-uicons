package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToRight: ImageVector? = null

val Icons.Ss.ArrowToRight: ImageVector
    get() = _ArrowToRight ?: UXIcon(name = "ArrowToRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10.55f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.26f, -0.32f)
                lineToRelative(-4.95f, -4.95f)
                lineTo(15.37f, 6.7f)
                lineToRelative(4.3f, 4.3f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(19.68f)
                lineToRelative(-4.3f, 4.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.95f, -4.95f)
                arcTo(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13.45f)
                verticalLineTo(19f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                close()
            }
        }.also { _ArrowToRight = it}
