package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sunglasses: ImageVector? = null

val Icons.Ss.Sunglasses: ImageVector
    get() = _Sunglasses ?: UXIcon(name = "Sunglasses") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.9f, 13.75f)
                lineToRelative(-1.65f, -11.19f)
                curveToRelative(-0.22f, -1.46f, -1.49f, -2.56f, -2.97f, -2.56f)
                horizontalLineToRelative(-3.27f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.27f)
                curveToRelative(0.49f, 0f, 0.92f, 0.37f, 0.99f, 0.85f)
                lineToRelative(1.5f, 10.15f)
                horizontalLineToRelative(-4.76f)
                curveToRelative(-1.47f, 0f, -2.75f, 0.81f, -3.44f, 2f)
                horizontalLineToRelative(-3.11f)
                curveToRelative(-0.69f, -1.19f, -1.97f, -2f, -3.44f, -2f)
                horizontalLineTo(2.24f)
                lineTo(3.74f, 2.85f)
                curveToRelative(0.07f, -0.49f, 0.5f, -0.85f, 0.99f, -0.85f)
                horizontalLineToRelative(3.27f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3.27f)
                curveTo(3.25f, 0f, 1.98f, 1.1f, 1.76f, 2.56f)
                lineTo(0.1f, 13.74f)
                curveToRelative(-0.07f, 0.45f, -0.1f, 0.91f, -0.1f, 1.37f)
                verticalLineToRelative(4.89f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4.89f)
                curveToRelative(0f, -0.46f, -0.04f, -0.92f, -0.1f, -1.36f)
                close()
            }
        }.also { _Sunglasses = it}
