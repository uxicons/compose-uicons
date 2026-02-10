package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sticker: ImageVector? = null

val Icons.Br.Sticker: ImageVector
    get() = _Sticker ?: UXIcon(name = "Sticker") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.96f, 10.42f)
            arcToRelative(12.04f, 12.04f, 0f, isMoreThanHalf = true, isPositiveArc = false, -13.55f, 13.55f)
            arcToRelative(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, 0.04f)
            arcToRelative(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.07f, -1.29f)
            lineToRelative(8.69f, -8.69f)
            arcToRelative(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.25f, -3.6f)
            close()
            moveTo(3.06f, 11f)
            arcToRelative(9.04f, 9.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, -1.98f)
            arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.54f, 11.54f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.96f, -9.56f)
            close()
            moveTo(12.03f, 20.46f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.43f, -8.43f)
            close()
        }
    }.also { _Sticker = it }
