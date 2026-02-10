package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heart: ImageVector? = null

val Icons.Ss.Heart: ImageVector
    get() = _Heart ?: UXIcon(name = "Heart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 0.92f)
                arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 3.3f)
                arcTo(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 0.92f)
                arcTo(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.97f)
                curveToRelative(0f, 6.78f, 10.96f, 14.6f, 11.42f, 14.93f)
                lineToRelative(0.58f, 0.41f)
                lineToRelative(0.58f, -0.41f)
                curveTo(13.04f, 22.57f, 24f, 14.74f, 24f, 7.97f)
                arcTo(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 0.92f)
                close()
            }
        }.also { _Heart = it}
