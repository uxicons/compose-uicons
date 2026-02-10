package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wave: ImageVector? = null

val Icons.Bs.Wave: ImageVector
    get() = _Wave ?: UXIcon(name = "Wave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineTo(0f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(1.36f, 0f, 2.6f, -0.55f, 3.5f, -1.44f)
                curveToRelative(0.9f, 0.89f, 2.14f, 1.44f, 3.5f, 1.44f)
                reflectiveCurveToRelative(2.6f, -0.55f, 3.5f, -1.44f)
                curveToRelative(0.9f, 0.89f, 2.14f, 1.44f, 3.5f, 1.44f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.12f, 17.0f)
                curveTo(1.92f, 17.0f, 0.12f, 15.21f, 0.12f, 13f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 0.56f, 0.45f, 1.0f, 1f, 1.0f)
                reflectiveCurveToRelative(1f, -0.45f, 0.88f, -1f)
                verticalLineToRelative(-1.5f)
                curveTo(5.12f, 5.16f, 10.28f, 0.01f, 16.62f, 0.01f)
                curveToRelative(1.94f, 0f, 3.87f, 0.5f, 5.57f, 1.44f)
                lineToRelative(1.34f, 0.74f)
                lineToRelative(-1.35f, 2.32f)
                lineToRelative(-1.14f, -0.27f)
                curveToRelative(-0.45f, -0.12f, -0.91f, -0.26f, -1.43f, -0.24f)
                curveToRelative(-1.95f, 0f, -3.4f, 0.53f, -4.33f, 1.57f)
                curveToRelative(-1.62f, 1.81f, -1.3f, 4.72f, -1.3f, 4.75f)
                lineToRelative(0.01f, 0.18f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -4f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 4.08f, -2.92f, 7f, -6.5f, 7f)
                curveToRelative(-3.56f, 0f, -6.46f, -2.87f, -6.5f, -6.42f)
                curveToRelative(-0.06f, -0.65f, -0.28f, -4.04f, 1.74f, -6.64f)
                curveToRelative(-2.74f, 1.41f, -4.62f, 4.27f, -4.74f, 7.56f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.12f, 2.21f, -1.67f, 4f, -3.88f, 4f)
                close()
            }
        }.also { _Wave = it}
