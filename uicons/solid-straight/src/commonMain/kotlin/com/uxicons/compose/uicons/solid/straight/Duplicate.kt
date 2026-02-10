package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duplicate: ImageVector? = null

val Icons.Ss.Duplicate: ImageVector
    get() = _Duplicate ?: UXIcon(name = "Duplicate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0.02f)
                lineToRelative(0f, 4.98f)
                lineToRelative(4.86f, 0f)
                lineToRelative(-4.86f, -4.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7f)
                verticalLineTo(0f)
                horizontalLineTo(10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 3f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 21f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                verticalLineTo(24f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                close()
            }
        }.also { _Duplicate = it}
