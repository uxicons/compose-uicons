package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exchange: ImageVector? = null

val Icons.Bs.Exchange: ImageVector
    get() = _Exchange ?: UXIcon(name = "Exchange") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18.96f)
                horizontalLineTo(4.71f)
                lineToRelative(1.9f, 1.9f)
                lineTo(4.48f, 22.98f)
                lineToRelative(-3.75f, -3.75f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.54f)
                lineToRelative(3.75f, -3.75f)
                lineTo(6.6f, 14.06f)
                lineToRelative(-1.9f, 1.9f)
                horizontalLineTo(24f)
                close()
                moveTo(17.4f, 9.9f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.75f, -3.75f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.54f)
                lineTo(19.52f, 0.98f)
                lineTo(17.4f, 3.1f)
                lineToRelative(1.9f, 1.9f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(19.29f)
                close()
            }
        }.also { _Exchange = it}
