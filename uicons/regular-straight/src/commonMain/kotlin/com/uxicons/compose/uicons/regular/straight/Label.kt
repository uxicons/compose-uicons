package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Label: ImageVector? = null

val Icons.Rs.Label: ImageVector
    get() = _Label ?: UXIcon(name = "Label") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 24f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -2.98f)
                verticalLineTo(5.52f)
                lineTo(12f, 0f)
                lineTo(22f, 5.52f)
                verticalLineToRelative(15.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 24f)
                close()
                moveTo(4f, 6.69f)
                verticalLineTo(21.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 0.99f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -0.99f)
                verticalLineTo(6.69f)
                lineTo(12f, 2.27f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.07f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
        }.also { _Label = it}
