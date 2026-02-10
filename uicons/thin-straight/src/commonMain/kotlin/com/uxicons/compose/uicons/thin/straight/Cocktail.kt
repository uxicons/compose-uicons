package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cocktail: ImageVector? = null

val Icons.Ts.Cocktail: ImageVector
    get() = _Cocktail ?: UXIcon(name = "Cocktail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.53f, 1.03f)
                curveToRelative(-0.47f, -0.65f, -1.23f, -1.03f, -2.03f, -1.03f)
                lineTo(2.5f, 0f)
                curveTo(1.7f, 0f, 0.94f, 0.39f, 0.47f, 1.03f)
                curveTo(0.0f, 1.67f, -0.13f, 2.47f, 0.11f, 3.22f)
                curveToRelative(1.09f, 3.44f, 5.01f, 8.51f, 11.39f, 8.77f)
                verticalLineToRelative(11.01f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-11.01f)
                curveToRelative(6.38f, -0.25f, 10.29f, -5.33f, 11.39f, -8.77f)
                curveToRelative(0.24f, -0.75f, 0.11f, -1.55f, -0.36f, -2.19f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-4.91f, 0f, -8.31f, -3.1f, -10.0f, -6f)
                horizontalLineToRelative(19.99f)
                curveToRelative(-1.69f, 2.9f, -5.08f, 6f, -10.0f, 6f)
                close()
                moveTo(22.94f, 2.92f)
                curveToRelative(-0.11f, 0.35f, -0.26f, 0.73f, -0.44f, 1.11f)
                verticalLineToRelative(-0.03f)
                lineTo(1.5f, 4f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.18f, -0.38f, -0.32f, -0.76f, -0.44f, -1.11f)
                curveToRelative(-0.14f, -0.45f, -0.06f, -0.92f, 0.21f, -1.3f)
                curveToRelative(0.29f, -0.4f, 0.73f, -0.62f, 1.22f, -0.62f)
                horizontalLineToRelative(19f)
                curveToRelative(0.49f, 0f, 0.93f, 0.23f, 1.22f, 0.62f)
                curveToRelative(0.28f, 0.38f, 0.36f, 0.85f, 0.21f, 1.3f)
                close()
            }
        }.also { _Cocktail = it}
