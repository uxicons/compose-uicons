package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Curling: ImageVector? = null

val Icons.Ss.Curling: ImageVector
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
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.57f, 0.16f)
                lineTo(18.78f, 5f)
                lineTo(7.14f, 5f)
                lineToRelative(0.49f, -2.22f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.6f, 2f)
                lineTo(17f, 2f)
                lineTo(17f, 0f)
                lineTo(8.6f, 0f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.68f, 2.35f)
                lineTo(4.38f, 8.16f)
                arcTo(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                close()
            }
        }.also { _Curling = it}
