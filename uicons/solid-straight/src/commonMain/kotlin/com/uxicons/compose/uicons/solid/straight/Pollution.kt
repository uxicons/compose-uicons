package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pollution: ImageVector? = null

val Icons.Ss.Pollution: ImageVector
    get() = _Pollution ?: UXIcon(name = "Pollution") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 8.75f)
                curveTo(0f, 5.69f, 2.4f, 3.18f, 5.42f, 3.01f)
                curveToRelative(1.12f, -1.85f, 3.15f, -3.01f, 5.33f, -3.01f)
                curveToRelative(1.44f, 0f, 2.81f, 0.49f, 3.92f, 1.39f)
                curveToRelative(0.57f, -0.26f, 1.19f, -0.39f, 1.83f, -0.39f)
                curveToRelative(1.94f, 0f, 3.65f, 1.27f, 4.25f, 3.07f)
                curveToRelative(1.85f, 0.35f, 3.25f, 1.98f, 3.25f, 3.93f)
                curveToRelative(0f, 0.98f, -0.36f, 1.86f, -0.95f, 2.55f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.26f, -0.97f, -2.84f, -1.55f, -4.55f, -1.55f)
                curveToRelative(-0.44f, 0f, -0.87f, 0.04f, -1.3f, 0.12f)
                curveToRelative(-1.28f, -0.73f, -2.71f, -1.11f, -4.2f, -1.11f)
                curveToRelative(-1.93f, 0f, -3.95f, 0.79f, -5.47f, 2f)
                horizontalLineToRelative(-1.53f)
                lineToRelative(-2.5f, 4.04f)
                curveToRelative(-2.05f, -0.88f, -3.5f, -2.92f, -3.5f, -5.29f)
                close()
                moveTo(18.5f, 11f)
                curveToRelative(-0.56f, 0f, -1.12f, 0.09f, -1.66f, 0.26f)
                curveToRelative(-1.11f, -0.82f, -2.46f, -1.26f, -3.84f, -1.26f)
                curveToRelative(-1.52f, 0f, -2.92f, 0.53f, -4.03f, 1.41f)
                lineToRelative(6.47f, 11.09f)
                curveToRelative(0.49f, -0.2f, 0.97f, -0.44f, 1.4f, -0.76f)
                curveToRelative(0.54f, 0.17f, 1.1f, 0.26f, 1.66f, 0.26f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(7f, 12f)
                lineToRelative(7f, 12f)
                lineTo(0f, 24f)
                lineToRelative(7f, -12f)
                close()
                moveTo(8f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _Pollution = it}
