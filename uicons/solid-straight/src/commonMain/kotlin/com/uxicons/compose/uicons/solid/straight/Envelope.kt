package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelope: ImageVector? = null

val Icons.Ss.Envelope: ImageVector
    get() = _Envelope ?: UXIcon(name = "Envelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.88f, 12.55f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(9.66f, -9.66f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 1f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.22f, 2.89f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.54f, 13.96f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(0f, 5.5f)
                verticalLineTo(23f)
                horizontalLineTo(24f)
                verticalLineTo(5.5f)
                close()
            }
        }.also { _Envelope = it}
