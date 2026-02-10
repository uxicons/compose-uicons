package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whale: ImageVector? = null

val Icons.Ss.Whale: ImageVector
    get() = _Whale ?: UXIcon(name = "Whale") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.51f, 8.0f)
                reflectiveCurveToRelative(-1.14f, 0f, -1.21f, 0.0f)
                curveToRelative(0f, 0f, -0.0f, 0f, -0.0f, 0f)
                curveToRelative(-4.24f, 0.11f, -8.6f, 3.62f, -10.3f, 5.36f)
                verticalLineToRelative(-2.78f)
                curveToRelative(0.66f, -0.59f, 1.43f, -1.2f, 2.3f, -1.78f)
                curveToRelative(0.03f, -0.23f, 0.07f, -0.46f, 0.11f, -0.68f)
                lineToRelative(0.47f, -2.77f)
                curveToRelative(2.37f, -0.61f, 4.13f, -2.79f, 4.13f, -5.35f)
                curveToRelative(-4.17f, 0f, -5.5f, 2.78f, -5.5f, 2.78f)
                curveToRelative(0f, 0f, -1.38f, -2.78f, -5.5f, -2.78f)
                curveToRelative(0f, 2.28f, 1.39f, 4.25f, 3.36f, 5.09f)
                lineToRelative(-0.5f, 0.75f)
                curveTo(0.99f, 8.64f, 0f, 11.9f, 0f, 15.27f)
                verticalLineToRelative(2.73f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(13f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -4.68f, -3.81f, -8.5f, -8.49f, -8.5f)
                close()
                moveTo(15.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Whale = it}
