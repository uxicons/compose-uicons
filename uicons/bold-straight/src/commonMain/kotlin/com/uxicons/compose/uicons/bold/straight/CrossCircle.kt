package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrossCircle: ImageVector? = null

val Icons.Bs.CrossCircle: ImageVector
    get() = _CrossCircle ?: UXIcon(name = "CrossCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.88f, 9.24f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.76f, 2.76f)
                lineToRelative(-2.76f, -2.76f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.76f, 2.76f)
                lineToRelative(-2.76f, 2.76f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.76f, -2.76f)
                lineToRelative(2.76f, 2.76f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.76f, -2.76f)
                lineToRelative(2.76f, -2.76f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
            }
        }.also { _CrossCircle = it}
