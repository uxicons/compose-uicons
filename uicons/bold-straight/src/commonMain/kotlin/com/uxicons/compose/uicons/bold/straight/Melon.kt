package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Melon: ImageVector? = null

val Icons.Bs.Melon: ImageVector
    get() = _Melon ?: UXIcon(name = "Melon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.0f, 1f)
                lineTo(18.95f, -0.06f)
                lineTo(-0.06f, 18.95f)
                lineTo(0.99f, 20f)
                arcTo(13.44f, 13.44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.0f, 1f)
                close()
                moveTo(17.89f, 17.9f)
                arcToRelative(10.46f, 10.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 0.98f)
                lineToRelative(3.64f, -3.64f)
                arcToRelative(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.36f, -7.36f)
                lineToRelative(3.64f, -3.64f)
                arcTo(10.47f, 10.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.89f, 17.89f)
                close()
            }
        }.also { _Melon = it}
