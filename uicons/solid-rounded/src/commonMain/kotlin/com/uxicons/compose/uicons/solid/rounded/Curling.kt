package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Curling: ImageVector? = null

val Icons.Sr.Curling: ImageVector
    get() = _Curling ?: UXIcon(name = "Curling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 18f)
                lineTo(24f, 18f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 6f)
                lineTo(6f, 24f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18f)
                close()
                moveTo(18f, 10f)
                lineTo(6f, 10f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 6f)
                lineTo(24f, 16f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 10f)
                close()
                moveTo(6f, 8f)
                lineTo(18f, 8f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.57f, 0.15f)
                lineToRelative(-0.03f, -0.12f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.66f, 5f)
                lineTo(7.14f, 5f)
                lineToRelative(0.14f, -0.65f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.21f, 2f)
                lineTo(17f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(10.21f, 0f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.33f, 3.92f)
                lineTo(4.4f, 8.16f)
                arcTo(8.02f, 8.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                close()
            }
        }.also { _Curling = it}
