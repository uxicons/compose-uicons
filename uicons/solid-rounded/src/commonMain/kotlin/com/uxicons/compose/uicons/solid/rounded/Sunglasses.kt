package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sunglasses: ImageVector? = null

val Icons.Sr.Sunglasses: ImageVector
    get() = _Sunglasses ?: UXIcon(name = "Sunglasses") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.9f, 13.75f)
                lineToRelative(-1.4f, -9.48f)
                curveToRelative(-0.36f, -2.43f, -2.49f, -4.27f, -4.95f, -4.27f)
                horizontalLineToRelative(-1.55f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.55f)
                curveToRelative(1.48f, 0f, 2.75f, 1.1f, 2.97f, 2.56f)
                lineToRelative(1.25f, 8.44f)
                horizontalLineToRelative(-3.76f)
                curveToRelative(-1.63f, 0f, -3.06f, 0.8f, -3.98f, 2.0f)
                curveToRelative(-0.01f, 0f, -0.01f, -0.0f, -0.02f, -0.0f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.01f, 0f, -0.01f, 0.0f, -0.02f, 0.0f)
                curveToRelative(-0.91f, -1.21f, -2.35f, -2.0f, -3.98f, -2.0f)
                horizontalLineToRelative(-3.76f)
                lineToRelative(1.25f, -8.44f)
                curveToRelative(0.22f, -1.46f, 1.49f, -2.56f, 2.97f, -2.56f)
                horizontalLineToRelative(1.55f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.55f)
                curveTo(3.99f, 0f, 1.86f, 1.83f, 1.51f, 4.27f)
                lineTo(0.1f, 13.74f)
                curveToRelative(-0.07f, 0.45f, -0.1f, 0.91f, -0.1f, 1.37f)
                verticalLineToRelative(3.89f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.34f, -0.04f, -0.68f, -0.1f, -1f)
                horizontalLineToRelative(2.2f)
                curveToRelative(-0.07f, 0.32f, -0.1f, 0.66f, -0.1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-3.89f)
                curveToRelative(0f, -0.46f, -0.04f, -0.92f, -0.1f, -1.36f)
                close()
            }
        }.also { _Sunglasses = it}
