package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ladder: ImageVector? = null

val Icons.Bs.Ladder: ImageVector
    get() = _Ladder ?: UXIcon(name = "Ladder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 0f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-24f)
                close()
                moveTo(17f, 12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                close()
                moveTo(10.21f, 4.85f)
                lineTo(8.0f, 3.62f)
                verticalLineToRelative(-0.61f)
                horizontalLineToRelative(2.9f)
                lineToRelative(0.78f, -3f)
                horizontalLineToRelative(0.65f)
                lineToRelative(0.78f, 3f)
                horizontalLineToRelative(2.88f)
                verticalLineToRelative(0.61f)
                lineToRelative(-2.2f, 1.27f)
                lineToRelative(0.88f, 2.69f)
                lineToRelative(-0.5f, 0.35f)
                lineToRelative(-2.17f, -1.68f)
                lineToRelative(-2.18f, 1.69f)
                lineToRelative(-0.48f, -0.36f)
                lineToRelative(0.87f, -2.72f)
                close()
            }
        }.also { _Ladder = it}
