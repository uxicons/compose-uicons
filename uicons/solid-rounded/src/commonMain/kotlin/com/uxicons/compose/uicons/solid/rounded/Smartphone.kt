package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smartphone: ImageVector? = null

val Icons.Sr.Smartphone: ImageVector
    get() = _Smartphone ?: UXIcon(name = "Smartphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 0f)
                horizontalLineTo(9f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(20f, 18f)
                lineTo(4f, 18f)
                close()
                moveTo(12f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
            }
        }.also { _Smartphone = it}
