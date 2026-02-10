package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H2: ImageVector? = null

val Icons.Ts.H2: ImageVector
    get() = _H2 ?: UXIcon(name = "H2") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7.5f)
                lineTo(1f, 12.5f)
                verticalLineToRelative(7.5f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(18.79f, 15.48f)
                curveToRelative(2.44f, -1.56f, 5.21f, -3.32f, 5.21f, -6.49f)
                curveToRelative(0f, -2.8f, -2.21f, -5f, -5.04f, -5f)
                curveToRelative(-2.74f, 0f, -4.96f, 2.24f, -4.96f, 5f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.21f, 1.78f, -4f, 3.96f, -4f)
                curveToRelative(2.26f, 0f, 4.04f, 1.76f, 4.04f, 4f)
                curveToRelative(0f, 2.61f, -2.42f, 4.15f, -4.75f, 5.64f)
                curveToRelative(-2.19f, 1.39f, -4.25f, 2.71f, -4.25f, 4.86f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-8.94f)
                curveToRelative(0.33f, -1.35f, 1.99f, -2.41f, 3.72f, -3.52f)
                close()
            }
        }.also { _H2 = it}
