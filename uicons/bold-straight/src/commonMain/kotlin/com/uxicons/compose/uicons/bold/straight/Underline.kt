package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Underline: ImageVector? = null

val Icons.Bs.Underline: ImageVector
    get() = _Underline ?: UXIcon(name = "Underline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18.5f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, -9f)
                verticalLineTo(0f)
                horizontalLineTo(18f)
                verticalLineTo(9.5f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 0f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                verticalLineTo(9.5f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _Underline = it}
