package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pause: ImageVector? = null

val Icons.Sr.Pause: ImageVector
    get() = _Pause ?: UXIcon(name = "Pause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 0f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3.5f)
                verticalLineToRelative(17f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 0f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 3.5f)
                verticalLineToRelative(17f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 0f)
                close()
            }
        }.also { _Pause = it}
