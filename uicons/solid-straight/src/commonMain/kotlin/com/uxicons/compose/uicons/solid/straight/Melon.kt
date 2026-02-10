package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Melon: ImageVector? = null

val Icons.Ss.Melon: ImageVector
    get() = _Melon ?: UXIcon(name = "Melon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.04f, 10.4f)
                arcTo(13.63f, 13.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.4f, 24.04f)
                arcTo(13.6f, 13.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 20.05f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.83f, -4.83f)
                lineToRelative(0.51f, 0.51f)
                arcToRelative(6.82f, 6.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.64f, -9.64f)
                lineToRelative(-0.51f, -0.51f)
                lineTo(19.34f, 0.04f)
                lineToRelative(0.71f, 0.71f)
                arcTo(13.56f, 13.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.04f, 10.4f)
                close()
                moveTo(6.8f, 13.6f)
                arcToRelative(4.81f, 4.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.8f, -6.8f)
                lineToRelative(-0.51f, -0.51f)
                lineToRelative(-6.8f, 6.8f)
                close()
            }
        }.also { _Melon = it}
