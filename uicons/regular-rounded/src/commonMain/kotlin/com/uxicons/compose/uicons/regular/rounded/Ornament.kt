package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ornament: ImageVector? = null

val Icons.Rr.Ornament: ImageVector
    get() = _Ornament ?: UXIcon(name = "Ornament") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 4.84f)
                verticalLineToRelative(-0.34f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.77f)
                curveToRelative(0.17f, -0.29f, 0.27f, -0.64f, 0.27f, -1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.36f, 0.1f, 0.71f, 0.27f, 1f)
                horizontalLineToRelative(-0.77f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.34f)
                curveToRelative(-3.53f, 1.55f, -6f, 5.07f, -6f, 9.16f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                curveToRelative(0f, -4.09f, -2.47f, -7.62f, -6f, -9.16f)
                close()
                moveTo(12f, 6f)
                curveToRelative(4.17f, 0f, 7.61f, 3.21f, 7.97f, 7.29f)
                lineToRelative(-1.52f, -1.52f)
                curveToRelative(-1.03f, -1.03f, -2.7f, -1.03f, -3.69f, -0.04f)
                lineToRelative(-2.33f, 2.08f)
                curveToRelative(-0.12f, 0.12f, -0.28f, 0.18f, -0.45f, 0.19f)
                curveToRelative(-0.19f, 0.01f, -0.34f, -0.07f, -0.5f, -0.23f)
                lineToRelative(-2.19f, -1.98f)
                curveToRelative(-0.5f, -0.5f, -1.16f, -0.78f, -1.87f, -0.79f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.7f, 0f, -1.36f, 0.27f, -1.86f, 0.77f)
                lineToRelative(-1.52f, 1.51f)
                curveToRelative(0.36f, -4.08f, 3.8f, -7.28f, 7.97f, -7.28f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.75f, 0f, -6.91f, -2.6f, -7.77f, -6.09f)
                lineToRelative(2.73f, -2.71f)
                curveToRelative(0.12f, -0.12f, 0.28f, -0.19f, 0.45f, -0.19f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.17f, 0f, 0.33f, 0.07f, 0.49f, 0.23f)
                lineToRelative(2.19f, 1.98f)
                curveToRelative(0.5f, 0.51f, 1.18f, 0.77f, 1.91f, 0.79f)
                curveToRelative(0.69f, -0.01f, 1.34f, -0.28f, 1.79f, -0.73f)
                lineToRelative(2.33f, -2.08f)
                curveToRelative(0.24f, -0.24f, 0.66f, -0.24f, 0.91f, 0f)
                lineToRelative(2.73f, 2.73f)
                curveToRelative(-0.86f, 3.49f, -4.02f, 6.08f, -7.77f, 6.08f)
                close()
            }
        }.also { _Ornament = it}
