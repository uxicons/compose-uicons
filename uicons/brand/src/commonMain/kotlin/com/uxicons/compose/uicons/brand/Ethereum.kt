package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ethereum: ImageVector? = null

val Icons.Brand.Ethereum: ImageVector
    get() = _Ethereum ?: UXIcon(name = "Ethereum") {
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(19.36f, 12.22f)
            lineToRelative(-7.37f, 4.35f)
            lineToRelative(-7.37f, -4.35f)
            lineToRelative(7.37f, -12.22f)
            close()
        }
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(19.37f, 13.62f)
            lineToRelative(-7.37f, 10.38f)
            lineToRelative(-7.37f, -10.38f)
            lineToRelative(7.37f, 4.35f)
            close()
        }
    }.also { _Ethereum = it }
