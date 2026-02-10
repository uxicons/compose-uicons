package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BootHeeled: ImageVector? = null

val Icons.Ss.BootHeeled: ImageVector
    get() = _BootHeeled ?: UXIcon(name = "BootHeeled") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20.59f)
                verticalLineToRelative(3.41f)
                horizontalLineToRelative(-8.78f)
                curveToRelative(-1.33f, 0f, -2.6f, -0.53f, -3.54f, -1.47f)
                lineToRelative(-2.36f, -2.36f)
                curveToRelative(-0.75f, -0.75f, -1.77f, -1.17f, -2.83f, -1.17f)
                lineTo(0f, 19.0f)
                lineTo(0f, 2.08f)
                lineTo(6f, 0.91f)
                verticalLineToRelative(11.09f)
                horizontalLineToRelative(2f)
                lineTo(8f, 0.52f)
                lineToRelative(2.36f, -0.46f)
                curveToRelative(0.87f, -0.19f, 1.84f, 0.03f, 2.56f, 0.61f)
                curveToRelative(0.7f, 0.56f, 1.08f, 1.39f, 1.08f, 2.33f)
                verticalLineToRelative(8.26f)
                curveToRelative(0f, 0.38f, 0.21f, 0.72f, 0.55f, 0.89f)
                lineToRelative(6.13f, 3.07f)
                curveToRelative(2.03f, 1.02f, 3.32f, 3.09f, 3.32f, 5.37f)
                close()
                moveTo(7.91f, 21.59f)
                curveToRelative(-0.38f, -0.38f, -0.88f, -0.59f, -1.42f, -0.59f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1.32f)
                lineToRelative(-1.09f, -1.09f)
                close()
            }
        }.also { _BootHeeled = it}
