package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Horse: ImageVector? = null

val Icons.Ss.Horse: ImageVector
    get() = _Horse ?: UXIcon(name = "Horse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.59f, 6.66f)
                curveToRelative(-1.79f, -0.86f, -2.96f, -2.17f, -3.4f, -3.91f)
                lineToRelative(-0.19f, -0.76f)
                verticalLineTo(0f)
                curveToRelative(-1.43f, 0f, -2.62f, 1.0f, -2.92f, 2.34f)
                curveToRelative(-3.16f, 1.04f, -4.08f, 4.29f, -4.08f, 6.16f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4.01f)
                curveToRelative(-1.25f, 0f, -2.36f, 0.59f, -3.1f, 1.5f)
                horizontalLineToRelative(-0.06f)
                lineToRelative(-0.15f, 0.05f)
                curveToRelative(-2.14f, 0.72f, -4.68f, 2.77f, -4.68f, 8.45f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.79f, 0.68f, -4.73f, 2.0f, -5.81f)
                curveToRelative(0.05f, 1.59f, 0.64f, 3.32f, 1.13f, 4.72f)
                curveToRelative(0.15f, 0.42f, 0.28f, 0.81f, 0.4f, 1.17f)
                lineToRelative(-0.68f, 4.92f)
                horizontalLineToRelative(4.15f)
                lineToRelative(0.62f, -5f)
                horizontalLineToRelative(4.38f)
                reflectiveCurveToRelative(0f, 5f, 0f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5.39f)
                lineToRelative(0.39f, -1.81f)
                curveToRelative(0.42f, -1.46f, 0.61f, -2.42f, 0.61f, -3.9f)
                verticalLineToRelative(-2.9f)
                lineToRelative(5f, -0.5f)
                verticalLineToRelative(-0.58f)
                curveToRelative(0f, -0.96f, -0.56f, -1.84f, -1.41f, -2.25f)
                close()
            }
        }.also { _Horse = it}
