package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelope: ImageVector? = null

val Icons.Sr.Envelope: ImageVector
    get() = _Envelope ?: UXIcon(name = "Envelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.95f, 5.54f)
                lineTo(15.54f, 13.96f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(0.05f, 5.54f)
                curveTo(0.03f, 5.7f, 0f, 5.84f, 0f, 6f)
                verticalLineTo(18f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(6f)
                curveTo(24f, 5.84f, 23.97f, 5.7f, 23.95f, 5.54f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.12f, 12.55f)
                lineToRelative(9.13f, -9.13f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 1f)
                horizontalLineTo(5f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.74f, 3.41f)
                lineToRelative(9.13f, 9.13f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.12f, 12.55f)
                close()
            }
        }.also { _Envelope = it}
