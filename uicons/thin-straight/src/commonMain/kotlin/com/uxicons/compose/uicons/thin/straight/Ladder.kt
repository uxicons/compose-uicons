package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ladder: ImageVector? = null

val Icons.Ts.Ladder: ImageVector
    get() = _Ladder ?: UXIcon(name = "Ladder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-24f)
                close()
                moveTo(19f, 21f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(14f)
                close()
                moveTo(19f, 17f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(14f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(14f)
                close()
                moveTo(9.86f, 5.29f)
                lineTo(9.15f, 7.66f)
                lineTo(9.78f, 8.14f)
                lineTo(12f, 6.7f)
                lineTo(14.2f, 8.13f)
                lineTo(14.85f, 7.66f)
                lineTo(14.14f, 5.29f)
                lineTo(16f, 3.79f)
                verticalLineToRelative(-0.8f)
                horizontalLineToRelative(-2.68f)
                lineToRelative(-0.88f, -2.63f)
                horizontalLineToRelative(-0.83f)
                lineToRelative(-0.92f, 2.63f)
                horizontalLineToRelative(-2.68f)
                verticalLineToRelative(0.8f)
                lineToRelative(1.86f, 1.5f)
                close()
                moveTo(11.39f, 4f)
                lineTo(12f, 2.27f)
                lineTo(12.61f, 4f)
                horizontalLineToRelative(1.54f)
                lineToRelative(-1.16f, 0.94f)
                lineToRelative(0.45f, 1.5f)
                lineToRelative(-1.44f, -0.93f)
                lineToRelative(-1.44f, 0.93f)
                lineToRelative(0.45f, -1.5f)
                lineToRelative(-1.16f, -0.94f)
                horizontalLineToRelative(1.54f)
                close()
            }
        }.also { _Ladder = it}
