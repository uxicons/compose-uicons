package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tilde: ImageVector? = null

val Icons.Ts.Tilde: ImageVector
    get() = _Tilde ?: UXIcon(name = "Tilde") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.77f, 20f)
                curveToRelative(-2.66f, 0f, -4.93f, -1.8f, -6.25f, -4.94f)
                lineToRelative(-1.92f, -5.82f)
                curveToRelative(-1.12f, -2.68f, -3.07f, -4.24f, -5.34f, -4.24f)
                curveToRelative(-2.39f, 0f, -4.26f, 1.85f, -4.26f, 4.21f)
                verticalLineToRelative(5.79f)
                horizontalLineTo(0f)
                verticalLineToRelative(-5.79f)
                curveToRelative(0f, -2.92f, 2.31f, -5.21f, 5.26f, -5.21f)
                curveToRelative(2.69f, 0f, 4.98f, 1.78f, 6.27f, 4.89f)
                lineToRelative(1.92f, 5.82f)
                curveToRelative(1.14f, 2.71f, 3.08f, 4.29f, 5.31f, 4.29f)
                curveToRelative(2.37f, 0f, 4.23f, -1.85f, 4.23f, -4.21f)
                verticalLineToRelative(-5.79f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.79f)
                curveToRelative(0f, 2.92f, -2.3f, 5.21f, -5.23f, 5.21f)
                close()
            }
        }.also { _Tilde = it}
