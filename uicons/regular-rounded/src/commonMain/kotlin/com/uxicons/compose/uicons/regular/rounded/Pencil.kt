package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pencil: ImageVector? = null

val Icons.Rr.Pencil: ImageVector
    get() = _Pencil ?: UXIcon(name = "Pencil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 1.15f)
                arcToRelative(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.12f, 0f)
                lineTo(1.47f, 17.41f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 20.95f)
                verticalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(3.05f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, -1.46f)
                lineTo(22.85f, 6.27f)
                arcTo(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.85f, 1.15f)
                close()
                moveTo(5.17f, 21.12f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.05f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20.95f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.88f, -2.12f)
                lineTo(15.22f, 6.48f)
                lineToRelative(2.3f, 2.3f)
                close()
                moveTo(21.44f, 4.86f)
                lineTo(18.93f, 7.36f)
                lineToRelative(-2.3f, -2.29f)
                lineToRelative(2.51f, -2.51f)
                arcToRelative(1.62f, 1.62f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.29f, 2.3f)
                close()
            }
        }.also { _Pencil = it}
