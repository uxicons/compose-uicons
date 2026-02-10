package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD12: ImageVector? = null

val Icons.Rs.DiceD12: ImageVector
    get() = _DiceD12 ?: UXIcon(name = "DiceD12") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.73f, 3.27f)
                lineTo(15.28f, 0f)
                lineTo(8.72f, 0f)
                lineTo(3.27f, 3.27f)
                lineTo(0f, 8.72f)
                verticalLineToRelative(6.55f)
                lineToRelative(3.27f, 5.45f)
                lineTo(8.72f, 24f)
                horizontalLineToRelative(6.55f)
                lineToRelative(5.45f, -3.27f)
                lineTo(24f, 15.28f)
                lineTo(24f, 8.72f)
                close()
                moveTo(21.78f, 8.9f)
                lineToRelative(-4.04f, 4.85f)
                lineTo(13f, 11.38f)
                verticalLineToRelative(-4.6f)
                lineToRelative(6.52f, -1.63f)
                close()
                moveTo(14.31f, 22f)
                lineTo(9.69f, 22f)
                lineToRelative(-2.44f, -6.51f)
                lineTo(12f, 13.12f)
                lineToRelative(4.75f, 2.37f)
                close()
                moveTo(9.28f, 2f)
                horizontalLineToRelative(5.45f)
                lineToRelative(2.69f, 1.61f)
                lineTo(12f, 4.97f)
                lineTo(6.58f, 3.62f)
                close()
                moveTo(4.48f, 5.15f)
                lineTo(11f, 6.78f)
                verticalLineToRelative(4.6f)
                lineTo(6.26f, 13.75f)
                lineTo(2.22f, 8.9f)
                close()
                moveTo(2f, 14.72f)
                verticalLineToRelative(-2.96f)
                lineToRelative(3.12f, 3.75f)
                lineToRelative(1.93f, 5.16f)
                lineToRelative(-2.33f, -1.4f)
                close()
                moveTo(19.27f, 19.27f)
                lineTo(16.94f, 20.67f)
                lineTo(18.88f, 15.52f)
                lineTo(22f, 11.76f)
                verticalLineToRelative(2.96f)
                close()
            }
        }.also { _DiceD12 = it}
