package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Harp: ImageVector? = null

val Icons.Bs.Harp: ImageVector
    get() = _Harp ?: UXIcon(name = "Harp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-1.21f, 0f, -2.41f, 0.61f, -3.56f, 1.2f)
                curveToRelative(-0.66f, 0.34f, -1.56f, 0.8f, -1.94f, 0.8f)
                curveToRelative(-1.01f, 0f, -1.72f, -0.49f, -2.9f, -1.37f)
                curveToRelative(-1.58f, -1.17f, -3.54f, -2.63f, -7.1f, -2.63f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.06f)
                curveToRelative(7.06f, -6.07f, 12.06f, -12.0f, 12.06f, -14.5f)
                close()
                moveTo(19.5f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.44f)
                curveToRelative(-0.1f, 0.59f, -1.3f, 2.58f, -4.0f, 5.56f)
                verticalLineToRelative(-5.98f)
                curveToRelative(0.78f, -0.39f, 1.95f, -1.02f, 2.5f, -1.02f)
                close()
                moveTo(11f, 6.17f)
                verticalLineToRelative(11.67f)
                curveToRelative(-0.63f, 0.56f, -1.3f, 1.13f, -2f, 1.72f)
                verticalLineToRelative(-14.75f)
                curveToRelative(0.64f, 0.47f, 1.26f, 0.95f, 2f, 1.36f)
                close()
                moveTo(5f, 3.06f)
                curveToRelative(0.77f, 0.09f, 1.42f, 0.28f, 2f, 0.53f)
                verticalLineToRelative(17.41f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13f, 16.04f)
                verticalLineToRelative(-9.13f)
                curveToRelative(0.32f, 0.06f, 0.65f, 0.1f, 1f, 0.1f)
                curveToRelative(0.33f, 0f, 0.67f, -0.06f, 1f, -0.15f)
                verticalLineToRelative(7.25f)
                curveToRelative(-0.61f, 0.62f, -1.28f, 1.26f, -2f, 1.94f)
                close()
            }
        }.also { _Harp = it}
