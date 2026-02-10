package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD10: ImageVector? = null

val Icons.Ss.DiceD10: ImageVector
    get() = _DiceD10 ?: UXIcon(name = "DiceD10") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.81f, 11.64f)
                lineToRelative(-2.8f, 2.1f)
                lineTo(9.19f, 11.64f)
                lineToRelative(2.89f, -7.8f)
                close()
                moveTo(16.74f, 11.11f)
                lineTo(24f, 12.31f)
                lineTo(14.24f, 0.84f)
                lineTo(14.16f, 0.76f)
                arcTo(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.82f, 0.03f)
                close()
                moveTo(11.01f, 15.5f)
                lineTo(7.75f, 13.06f)
                lineTo(0.62f, 14.42f)
                lineToRelative(9.24f, 8.9f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.14f, 0.69f)
                close()
                moveTo(16.25f, 13.06f)
                lineTo(13.01f, 15.5f)
                lineTo(13.01f, 24f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.09f, -0.69f)
                lineToRelative(9.39f, -9.06f)
                close()
                moveTo(7.25f, 11.12f)
                lineTo(11.35f, 0.01f)
                arcTo(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.95f, 0.76f)
                lineTo(0f, 12.5f)
                close()
            }
        }.also { _DiceD10 = it}
