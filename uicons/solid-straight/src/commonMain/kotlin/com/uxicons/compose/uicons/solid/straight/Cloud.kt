package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cloud: ImageVector? = null

val Icons.Ss.Cloud: ImageVector
    get() = _Cloud ?: UXIcon(name = "Cloud") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.79f, 7.21f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 3.67f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 23f)
                horizontalLineTo(16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.79f, 7.21f)
                close()
            }
        }.also { _Cloud = it}
