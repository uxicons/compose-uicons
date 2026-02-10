package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD6: ImageVector? = null

val Icons.Bs.DiceD6: ImageVector
    get() = _DiceD6 ?: UXIcon(name = "DiceD6") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.75f, 0.49f)
                arcToRelative(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 0f)
                lineTo(1f, 6.06f)
                lineTo(1f, 17.94f)
                lineToRelative(9.25f, 5.57f)
                arcToRelative(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 0f)
                lineTo(23f, 17.94f)
                lineTo(23f, 6.06f)
                close()
                moveTo(11.8f, 3.06f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.4f, 0f)
                lineTo(18.6f, 6.91f)
                lineTo(12f, 10.89f)
                lineTo(5.41f, 6.91f)
                close()
                moveTo(4f, 16.24f)
                lineTo(4f, 9.57f)
                lineToRelative(6.5f, 3.92f)
                verticalLineToRelative(6.68f)
                close()
                moveTo(13.5f, 20.16f)
                lineTo(13.5f, 13.48f)
                lineTo(20f, 9.57f)
                verticalLineToRelative(6.68f)
                close()
            }
        }.also { _DiceD6 = it}
