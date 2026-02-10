package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelope: ImageVector? = null

val Icons.Rs.Envelope: ImageVector
    get() = _Envelope ?: UXIcon(name = "Envelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 1f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                verticalLineTo(23f)
                horizontalLineTo(24f)
                verticalLineTo(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 1f)
                close()
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(0.67f)
                lineToRelative(-7.88f, 7.88f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                lineTo(2f, 4.67f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(2f, 21f)
                verticalLineTo(7.5f)
                lineTo(8.46f, 13.96f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.07f, 0f)
                lineTo(22f, 7.5f)
                verticalLineTo(21f)
                close()
            }
        }.also { _Envelope = it}
