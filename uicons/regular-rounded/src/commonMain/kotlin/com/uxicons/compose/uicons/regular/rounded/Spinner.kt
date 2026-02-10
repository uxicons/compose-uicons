package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spinner: ImageVector? = null

val Icons.Rr.Spinner: ImageVector
    get() = _Spinner ?: UXIcon(name = "Spinner") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22.71f, 6.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.78f, 0.9f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.01f, 9.04f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.78f, 0.91f)
                arcTo(11.96f, 11.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
            }
        }.also { _Spinner = it}
