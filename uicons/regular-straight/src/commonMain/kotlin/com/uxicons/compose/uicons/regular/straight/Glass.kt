package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glass: ImageVector? = null

val Icons.Rs.Glass: ImageVector
    get() = _Glass ?: UXIcon(name = "Glass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.35f, 0f)
                lineTo(4.27f, 21.41f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.25f, 24f)
                horizontalLineToRelative(9.51f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.97f, -2.6f)
                lineTo(22.65f, 0f)
                close()
                moveTo(17.75f, 21.14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.99f, 0.86f)
                horizontalLineTo(7.25f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.99f, -0.86f)
                lineTo(4.6f, 9f)
                horizontalLineTo(16.69f)
                lineTo(17f, 7f)
                horizontalLineTo(4.33f)
                lineTo(3.65f, 2f)
                horizontalLineTo(20.35f)
                close()
            }
        }.also { _Glass = it}
