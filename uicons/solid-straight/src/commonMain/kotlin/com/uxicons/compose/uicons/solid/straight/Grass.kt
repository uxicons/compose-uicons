package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grass: ImageVector? = null

val Icons.Ss.Grass: ImageVector
    get() = _Grass ?: UXIcon(name = "Grass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.17f, 4.66f)
                lineTo(1.51f, 2.17f)
                lineToRelative(2.82f, 0.99f)
                curveToRelative(2.42f, 0.85f, 4.49f, 2.4f, 6.18f, 4.61f)
                curveToRelative(-2.41f, 5.41f, -2.53f, 11.43f, -2.51f, 13.23f)
                verticalLineToRelative(0.2f)
                curveToRelative(0f, -3.03f, -1.18f, -11.07f, -4.83f, -16.55f)
                close()
                moveTo(19.99f, 20.7f)
                curveToRelative(-0.03f, -2.99f, -0.08f, -7.51f, 2.34f, -11.14f)
                lineToRelative(1.72f, -2.58f)
                lineToRelative(-2.9f, 1.09f)
                curveToRelative(-0.7f, 0.26f, -1.36f, 0.59f, -1.97f, 0.97f)
                curveToRelative(-1.49f, 3.37f, -2.17f, 7.2f, -2.17f, 11.97f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -7.96f, 1.85f, -13.54f, 5.83f, -18.45f)
                lineTo(22.49f, 0.07f)
                lineToRelative(-2.45f, 0.89f)
                curveToRelative(-10.55f, 3.69f, -10.04f, 19.38f, -10.04f, 20.04f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.99f)
                lineToRelative(-0.01f, -0.8f)
                curveToRelative(0f, -1.86f, -0.53f, -6.05f, -1.95f, -10.12f)
                curveToRelative(-0.39f, -0.19f, -0.77f, -0.37f, -1.16f, -0.52f)
                lineTo(-0.01f, 9.47f)
                reflectiveCurveToRelative(3.01f, 3.02f, 3.01f, 12.53f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-0.0f, -1.3f)
                close()
            }
        }.also { _Grass = it}
