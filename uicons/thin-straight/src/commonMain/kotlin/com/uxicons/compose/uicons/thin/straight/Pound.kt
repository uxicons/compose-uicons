package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pound: ImageVector? = null

val Icons.Ts.Pound: ImageVector
    get() = _Pound ?: UXIcon(name = "Pound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.05f, -0.81f, -3.96f, -2.28f, -5.38f)
                curveTo(17.25f, 0.69f, 15.31f, -0.05f, 13.27f, 0.0f)
                curveToRelative(-4.01f, 0.12f, -7.27f, 3.62f, -7.27f, 7.79f)
                verticalLineToRelative(4.21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-1f)
                horizontalLineTo(5.0f)
                curveToRelative(1.22f, -0.91f, 2.0f, -2.37f, 2.0f, -4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                horizontalLineTo(7f)
                verticalLineToRelative(-4.21f)
                curveToRelative(0f, -3.64f, 2.83f, -6.69f, 6.3f, -6.79f)
                curveToRelative(1.78f, -0.07f, 3.45f, 0.6f, 4.73f, 1.83f)
                curveToRelative(1.27f, 1.24f, 1.97f, 2.89f, 1.97f, 4.67f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _Pound = it}
