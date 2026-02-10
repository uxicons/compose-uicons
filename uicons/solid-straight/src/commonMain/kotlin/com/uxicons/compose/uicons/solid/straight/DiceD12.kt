package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD12: ImageVector? = null

val Icons.Ss.DiceD12: ImageVector
    get() = _DiceD12 ?: UXIcon(name = "DiceD12") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.84f, 7.32f)
                lineTo(2.46f, 4.63f)
                lineTo(11f, 6.78f)
                verticalLineToRelative(4.6f)
                lineTo(6.26f, 13.75f)
                close()
                moveTo(12f, 13.12f)
                lineTo(7.26f, 15.49f)
                lineTo(10.5f, 24f)
                horizontalLineToRelative(3f)
                lineToRelative(3.24f, -8.51f)
                close()
                moveTo(21.53f, 4.61f)
                lineTo(13f, 6.78f)
                verticalLineToRelative(4.6f)
                lineToRelative(4.74f, 2.37f)
                lineToRelative(5.38f, -6.51f)
                close()
                moveTo(5.12f, 15.51f)
                lineTo(0f, 9.43f)
                verticalLineToRelative(5.85f)
                lineToRelative(3.27f, 5.45f)
                lineTo(8.25f, 23.72f)
                close()
                moveTo(18.88f, 15.51f)
                lineTo(15.75f, 23.72f)
                lineToRelative(4.98f, -2.99f)
                lineTo(24f, 15.28f)
                lineTo(24f, 9.31f)
                close()
                moveTo(12f, 4.97f)
                lineTo(20.12f, 2.9f)
                lineTo(15.28f, 0f)
                lineTo(8.72f, 0f)
                lineTo(3.86f, 2.92f)
                close()
            }
        }.also { _DiceD12 = it}
