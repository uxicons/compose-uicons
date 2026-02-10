package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Underline: ImageVector? = null

val Icons.Rs.Underline: ImageVector
    get() = _Underline ?: UXIcon(name = "Underline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(0f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(12f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 22f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _Underline = it}
