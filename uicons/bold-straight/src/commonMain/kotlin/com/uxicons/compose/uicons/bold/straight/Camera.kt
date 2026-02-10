package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camera: ImageVector? = null

val Icons.Bs.Camera: ImageVector
    get() = _Camera ?: UXIcon(name = "Camera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                lineTo(18.73f, 4f)
                lineTo(15.64f, 0f)
                lineTo(8.36f, 0f)
                lineTo(5.27f, 4f)
                lineTo(3f, 4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 4f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 7f)
                lineTo(21f, 7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.5f, 14f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19.5f)
                close()
                moveTo(12f, 11.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11.5f)
                close()
            }
        }.also { _Camera = it}
