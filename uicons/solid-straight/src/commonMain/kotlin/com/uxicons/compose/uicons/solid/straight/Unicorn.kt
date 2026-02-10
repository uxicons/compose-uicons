package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Unicorn: ImageVector? = null

val Icons.Ss.Unicorn: ImageVector
    get() = _Unicorn ?: UXIcon(name = "Unicorn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.92f)
                verticalLineToRelative(0.74f)
                lineToRelative(-5f, 0.5f)
                verticalLineToRelative(2.75f)
                curveToRelative(0f, 1.48f, -0.2f, 2.44f, -0.61f, 3.9f)
                lineToRelative(-0.39f, 1.81f)
                verticalLineToRelative(5.4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(-0.69f, 5f)
                horizontalLineToRelative(-3.95f)
                lineToRelative(0.68f, -4.92f)
                curveToRelative(-0.11f, -0.36f, -0.25f, -0.76f, -0.4f, -1.17f)
                curveToRelative(-0.49f, -1.4f, -1.09f, -3.13f, -1.13f, -4.72f)
                curveToRelative(-1.32f, 1.08f, -2.0f, 3.02f, -2.0f, 5.81f)
                horizontalLineTo(0f)
                curveToRelative(0f, -5.68f, 2.55f, -7.73f, 4.68f, -8.45f)
                lineToRelative(0.15f, -0.05f)
                horizontalLineToRelative(0.06f)
                curveToRelative(0.73f, -0.91f, 1.84f, -1.5f, 3.1f, -1.5f)
                horizontalLineToRelative(4.01f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.87f, 0.92f, -5.12f, 4.08f, -6.16f)
                curveToRelative(0.3f, -1.34f, 1.49f, -2.34f, 2.92f, -2.34f)
                verticalLineToRelative(1.65f)
                lineTo(23.63f, 0.05f)
                curveToRelative(0.2f, 0.34f, 0.17f, 0.28f, 0.37f, 0.61f)
                lineToRelative(-4.18f, 3.44f)
                curveToRelative(0.59f, 0.99f, 1.55f, 1.97f, 2.76f, 2.56f)
                curveToRelative(0.86f, 0.41f, 1.41f, 1.3f, 1.41f, 2.25f)
                close()
            }
        }.also { _Unicorn = it}
