package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD12: ImageVector? = null

val Icons.Ts.DiceD12: ImageVector
    get() = _DiceD12 ?: UXIcon(name = "DiceD12") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.73f, 3.27f)
                lineTo(15.28f, 0f)
                horizontalLineToRelative(-6.55f)
                lineTo(3.27f, 3.27f)
                lineTo(0f, 8.72f)
                verticalLineToRelative(6.55f)
                lineToRelative(3.27f, 5.45f)
                lineToRelative(5.45f, 3.27f)
                horizontalLineToRelative(6.55f)
                lineToRelative(5.45f, -3.27f)
                lineToRelative(3.27f, -5.45f)
                verticalLineToRelative(-6.55f)
                lineToRelative(-3.27f, -5.45f)
                close()
                moveTo(22.89f, 8.82f)
                lineToRelative(-4.75f, 5.7f)
                lineToRelative(-5.64f, -2.82f)
                lineTo(12.5f, 6.12f)
                lineToRelative(7.63f, -1.91f)
                lineToRelative(2.76f, 4.6f)
                close()
                moveTo(14.79f, 23f)
                horizontalLineToRelative(-5.58f)
                lineToRelative(-2.86f, -7.62f)
                lineToRelative(5.65f, -2.82f)
                lineToRelative(5.65f, 2.82f)
                lineToRelative(-2.86f, 7.62f)
                close()
                moveTo(9.0f, 1f)
                horizontalLineToRelative(6.0f)
                lineToRelative(4.07f, 2.44f)
                lineToRelative(-7.07f, 1.77f)
                lineToRelative(-7.07f, -1.77f)
                lineTo(9.0f, 1f)
                close()
                moveTo(3.87f, 4.21f)
                lineToRelative(7.63f, 1.91f)
                verticalLineToRelative(5.57f)
                lineToRelative(-5.64f, 2.82f)
                lineTo(1.11f, 8.82f)
                lineTo(3.87f, 4.21f)
                close()
                moveTo(1f, 15.0f)
                verticalLineToRelative(-4.75f)
                lineToRelative(4.29f, 5.15f)
                lineToRelative(2.6f, 6.94f)
                lineToRelative(-3.89f, -2.33f)
                lineTo(1f, 15.0f)
                close()
                moveTo(20.0f, 20.0f)
                lineToRelative(-3.89f, 2.33f)
                lineToRelative(2.6f, -6.94f)
                lineToRelative(4.29f, -5.15f)
                verticalLineToRelative(4.75f)
                lineToRelative(-3.0f, 5.0f)
                close()
            }
        }.also { _DiceD12 = it}
