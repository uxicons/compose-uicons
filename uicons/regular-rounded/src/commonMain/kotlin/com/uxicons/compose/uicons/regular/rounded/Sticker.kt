package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sticker: ImageVector? = null

val Icons.Rr.Sticker: ImageVector
    get() = _Sticker ?: UXIcon(name = "Sticker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 10.42f)
                arcToRelative(12.04f, 12.04f, 0f, isMoreThanHalf = true, isPositiveArc = false, -13.55f, 13.55f)
                arcToRelative(3.81f, 3.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.49f, 0.03f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.81f, -1.18f)
                lineToRelative(9.1f, -9.1f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.16f, -3.3f)
                close()
                moveTo(2.07f, 10.89f)
                arcToRelative(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.8f, -0.88f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.86f, 11.85f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.94f, -10.97f)
                close()
                moveTo(12.3f, 21.4f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.28f, 0.23f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.61f, -9.61f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.22f, 0.28f)
                close()
            }
        }.also { _Sticker = it}
