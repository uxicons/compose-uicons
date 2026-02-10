package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LunchBox: ImageVector? = null

val Icons.Bs.LunchBox: ImageVector
    get() = _LunchBox ?: UXIcon(name = "LunchBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.1f, 15f)
                lineToRelative(-0.34f, -2.91f)
                curveToRelative(-0.21f, -1.76f, -1.7f, -3.09f, -3.48f, -3.09f)
                horizontalLineToRelative(-14.56f)
                curveToRelative(-1.77f, 0f, -3.27f, 1.33f, -3.48f, 3.09f)
                lineToRelative(-0.34f, 2.91f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.9f)
                lineToRelative(0.34f, 2.91f)
                curveToRelative(0.21f, 1.76f, 1.7f, 3.09f, 3.48f, 3.09f)
                horizontalLineToRelative(14.56f)
                curveToRelative(1.77f, 0f, 3.27f, -1.33f, 3.48f, -3.09f)
                lineToRelative(0.34f, -2.91f)
                horizontalLineToRelative(0.9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-0.9f)
                close()
                moveTo(19.78f, 20.56f)
                curveToRelative(-0.03f, 0.25f, -0.24f, 0.44f, -0.5f, 0.44f)
                horizontalLineToRelative(-14.56f)
                curveToRelative(-0.25f, 0f, -0.47f, -0.19f, -0.5f, -0.44f)
                lineToRelative(-0.3f, -2.56f)
                horizontalLineToRelative(5.16f)
                lineToRelative(0.25f, 1f)
                horizontalLineToRelative(5.34f)
                lineToRelative(0.25f, -1f)
                horizontalLineToRelative(5.16f)
                close()
                moveTo(3.92f, 15f)
                lineTo(4.22f, 12.44f)
                curveToRelative(0.03f, -0.25f, 0.24f, -0.44f, 0.5f, -0.44f)
                horizontalLineToRelative(14.56f)
                curveToRelative(0.25f, 0f, 0.47f, 0.19f, 0.5f, 0.44f)
                lineToRelative(0.3f, 2.56f)
                close()
                moveTo(2f, 4f)
                curveToRelative(0f, -2.21f, 3.79f, -4f, 6f, -4f)
                curveToRelative(1.68f, 0f, 3.11f, 1.03f, 3.7f, 2.5f)
                horizontalLineToRelative(10.3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10.3f)
                curveToRelative(-0.59f, 1.47f, -2.03f, 2.5f, -3.7f, 2.5f)
                curveToRelative(-2.21f, 0f, -6f, -1.79f, -6f, -4f)
                close()
            }
        }.also { _LunchBox = it}
