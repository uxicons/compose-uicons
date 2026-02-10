package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD8: ImageVector? = null

val Icons.Ss.DiceD8: ImageVector
    get() = _DiceD8 ?: UXIcon(name = "DiceD8") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.5f, 10.58f)
                lineTo(9.85f, 0.72f)
                arcTo(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 0.01f)
                lineTo(11f, 13.66f)
                close()
                moveTo(13f, 13.66f)
                lineToRelative(10.5f, -3.09f)
                lineTo(14.15f, 0.72f)
                lineTo(14.11f, 0.68f)
                arcTo(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 0f)
                close()
                moveTo(13f, 15.75f)
                lineTo(13f, 24f)
                arcToRelative(3.11f, 3.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.16f, -0.73f)
                lineTo(24f, 12.51f)
                close()
                moveTo(11f, 15.75f)
                lineTo(0f, 12.51f)
                lineToRelative(9.89f, 10.8f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 24f)
                close()
            }
        }.also { _DiceD8 = it}
