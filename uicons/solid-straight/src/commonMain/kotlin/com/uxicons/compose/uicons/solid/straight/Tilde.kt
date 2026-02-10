package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tilde: ImageVector? = null

val Icons.Ss.Tilde: ImageVector
    get() = _Tilde ?: UXIcon(name = "Tilde") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.47f, 20f)
                curveToRelative(-2.77f, 0f, -5.12f, -1.92f, -6.46f, -5.26f)
                lineToRelative(-1.83f, -4.8f)
                curveToRelative(-0.47f, -1.17f, -1.87f, -3.94f, -4.63f, -3.94f)
                curveToRelative(-1.99f, 0f, -3.55f, 1.63f, -3.55f, 3.71f)
                verticalLineToRelative(5.29f)
                horizontalLineTo(0f)
                verticalLineToRelative(-5.29f)
                curveToRelative(0f, -3.2f, 2.44f, -5.71f, 5.55f, -5.71f)
                curveToRelative(2.8f, 0f, 5.17f, 1.9f, 6.49f, 5.21f)
                lineToRelative(1.83f, 4.8f)
                curveToRelative(0.59f, 1.48f, 1.99f, 3.99f, 4.6f, 3.99f)
                curveToRelative(2.01f, 0f, 3.53f, -1.6f, 3.53f, -3.71f)
                verticalLineToRelative(-5.29f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.29f)
                curveToRelative(0f, 3.2f, -2.43f, 5.71f, -5.53f, 5.71f)
                close()
            }
        }.also { _Tilde = it}
