package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grass: ImageVector? = null

val Icons.Sr.Grass: ImageVector
    get() = _Grass ?: UXIcon(name = "Grass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveTo(4f, 15.54f, 1.66f, 12.77f, 0.11f, 10.2f)
                curveToRelative(-0.44f, -0.72f, 0.5f, -1.45f, 1.25f, -1.06f)
                curveToRelative(0.81f, 0.42f, 1.61f, 0.91f, 2.38f, 1.45f)
                curveToRelative(1.43f, 3.86f, 2.27f, 7.62f, 2.27f, 10.52f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                curveTo(10f, 16.5f, 12.12f, 4.95f, 19.89f, 0.11f)
                curveToRelative(0.64f, -0.4f, 1.37f, 0.33f, 1.03f, 1f)
                curveToRelative(-3.0f, 5.84f, -5.91f, 12.89f, -5.91f, 19.89f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.68f, 0.89f, -7.38f, 2.08f, -10.76f)
                curveToRelative(1.33f, -1.31f, 2.73f, -2.52f, 3.69f, -3.15f)
                curveToRelative(0.66f, -0.43f, 1.47f, 0.29f, 1.16f, 1.01f)
                curveToRelative(-1.9f, 4.33f, -3.86f, 6.19f, -3.92f, 13.9f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(8f, 21.11f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0f, -2.32f, 0.55f, -6.92f, 2.35f, -11.56f)
                curveToRelative(-1.76f, -2.39f, -4.32f, -5.19f, -6.11f, -6.31f)
                curveToRelative(-0.69f, -0.44f, -1.53f, 0.3f, -1.16f, 1.03f)
                curveToRelative(2.84f, 5.5f, 4.91f, 12.0f, 4.91f, 16.95f)
                close()
            }
        }.also { _Grass = it}
