package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glass: ImageVector? = null

val Icons.Ss.Glass: ImageVector
    get() = _Glass ?: UXIcon(name = "Glass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.35f, 0f)
                lineToRelative(0.95f, 7f)
                horizontalLineTo(17f)
                lineToRelative(-0.42f, 2f)
                horizontalLineTo(2.58f)
                lineTo(4.27f, 21.41f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.25f, 24f)
                horizontalLineToRelative(9.51f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.97f, -2.6f)
                lineTo(22.65f, 0f)
                close()
            }
        }.also { _Glass = it}
