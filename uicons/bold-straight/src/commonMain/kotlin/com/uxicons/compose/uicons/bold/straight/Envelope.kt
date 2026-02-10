package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelope: ImageVector? = null

val Icons.Bs.Envelope: ImageVector
    get() = _Envelope ?: UXIcon(name = "Envelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 1f)
                lineTo(3f, 1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                lineTo(0f, 23f)
                lineTo(24f, 23f)
                lineTo(24f, 4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 1f)
                close()
                moveTo(20.77f, 4f)
                lineTo(13.64f, 11.13f)
                arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.28f, 0f)
                lineTo(3.23f, 4f)
                close()
                moveTo(3f, 20f)
                lineTo(3f, 8.02f)
                lineToRelative(5.24f, 5.24f)
                arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.52f, 0f)
                lineTo(21f, 8.02f)
                lineTo(21f, 20f)
                close()
            }
        }.also { _Envelope = it}
