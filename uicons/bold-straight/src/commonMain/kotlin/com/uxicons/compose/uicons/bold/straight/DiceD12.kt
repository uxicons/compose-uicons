package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD12: ImageVector? = null

val Icons.Bs.DiceD12: ImageVector
    get() = _DiceD12 ?: UXIcon(name = "DiceD12") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.73f, 3.27f)
                lineTo(15.28f, 0f)
                lineTo(8.72f, 0f)
                lineTo(3.27f, 3.27f)
                lineTo(0f, 8.72f)
                verticalLineToRelative(6.56f)
                lineTo(3.27f, 20.73f)
                lineTo(8.72f, 24f)
                horizontalLineToRelative(6.56f)
                lineToRelative(5.45f, -3.27f)
                lineTo(24f, 15.28f)
                lineTo(24f, 8.72f)
                close()
                moveTo(10.5f, 7.67f)
                verticalLineToRelative(3.4f)
                lineTo(7.34f, 12.65f)
                lineTo(3.59f, 8.56f)
                lineTo(4.96f, 6.29f)
                close()
                moveTo(8.83f, 15.26f)
                lineTo(12f, 13.68f)
                lineToRelative(3.17f, 1.58f)
                lineTo(13.25f, 21f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(16.66f, 12.65f)
                lineTo(13.5f, 11.07f)
                verticalLineToRelative(-3.4f)
                lineToRelative(5.54f, -1.39f)
                lineToRelative(1.37f, 2.28f)
                close()
                moveTo(9.55f, 3f)
                horizontalLineToRelative(4.9f)
                lineToRelative(1.58f, 0.95f)
                lineTo(12f, 4.95f)
                lineTo(7.97f, 3.95f)
                close()
                moveTo(3f, 14.45f)
                lineTo(3f, 12.36f)
                lineToRelative(2.68f, 2.92f)
                lineToRelative(1.42f, 4.25f)
                lineToRelative(-1.64f, -0.98f)
                close()
                moveTo(18.54f, 18.54f)
                lineTo(16.91f, 19.52f)
                lineTo(18.32f, 15.28f)
                lineTo(21f, 12.36f)
                verticalLineToRelative(2.09f)
                close()
            }
        }.also { _DiceD12 = it}
