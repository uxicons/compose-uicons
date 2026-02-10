package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CitrusSlice: ImageVector? = null

val Icons.Ss.CitrusSlice: ImageVector
    get() = _CitrusSlice ?: UXIcon(name = "CitrusSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.98f, 0.79f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-8.91f, 8.91f)
                horizontalLineToRelative(11.54f)
                curveToRelative(0.06f, 0.47f, 0.1f, 0.95f, 0.1f, 1.44f)
                curveToRelative(0f, 0.19f, -0.02f, 0.37f, -0.03f, 0.56f)
                horizontalLineToRelative(-9.56f)
                lineToRelative(6.87f, 6.87f)
                curveToRelative(-0.21f, 0.26f, -0.44f, 0.51f, -0.68f, 0.74f)
                curveToRelative(-0.24f, 0.24f, -0.48f, 0.46f, -0.74f, 0.67f)
                lineToRelative(-6.87f, -6.87f)
                verticalLineToRelative(9.56f)
                curveToRelative(-0.19f, 0.01f, -0.38f, 0.03f, -0.57f, 0.03f)
                curveToRelative(-0.48f, 0f, -0.96f, -0.04f, -1.43f, -0.1f)
                verticalLineToRelative(-11.54f)
                lineTo(0.09f, 19.27f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(1.24f, 1.24f, 4.21f, 4.02f, 9.64f, 4.02f)
                curveToRelative(3.48f, 0f, 6.95f, -1.32f, 9.59f, -3.97f)
                curveToRelative(2.56f, -2.56f, 3.97f, -5.97f, 3.97f, -9.59f)
                curveToRelative(0f, -5.44f, -2.91f, -8.53f, -4.02f, -9.65f)
                close()
            }
        }.also { _CitrusSlice = it}
