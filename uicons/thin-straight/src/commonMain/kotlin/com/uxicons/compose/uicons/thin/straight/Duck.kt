package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duck: ImageVector? = null

val Icons.Ts.Duck: ImageVector
    get() = _Duck ?: UXIcon(name = "Duck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 13f)
                curveToRelative(-2.85f, 0f, -7.05f, 3.57f, -7.23f, 3.72f)
                lineToRelative(-0.48f, 0.41f)
                lineToRelative(0.51f, 0.37f)
                curveToRelative(0.14f, 0.1f, 3.48f, 2.5f, 7.19f, 2.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(14.5f, 19f)
                curveToRelative(-2.55f, 0f, -4.99f, -1.29f, -6.05f, -1.94f)
                curveToRelative(1.18f, -0.93f, 4.1f, -3.06f, 6.05f, -3.06f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(24f, 6.81f)
                verticalLineToRelative(-1.12f)
                lineToRelative(-3.13f, -0.95f)
                curveToRelative(-0.58f, -2.7f, -2.99f, -4.74f, -5.87f, -4.74f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 1.29f, 0.41f, 2.49f, 1.11f, 3.47f)
                curveToRelative(-1.08f, 1.25f, -3.36f, 3.53f, -5.61f, 3.53f)
                curveToRelative(-1.06f, 0f, -2.15f, -1.31f, -2.48f, -1.82f)
                lineToRelative(-0.5f, -0.7f)
                lineToRelative(-0.39f, 0.8f)
                curveToRelative(-1.52f, 3.15f, -1.5f, 6.53f, 0.07f, 9.04f)
                curveToRelative(1.47f, 2.34f, 4.13f, 3.69f, 7.3f, 3.69f)
                horizontalLineToRelative(7.27f)
                curveToRelative(3.5f, 0f, 7.21f, -2.49f, 7.21f, -7.1f)
                curveToRelative(0f, -2.56f, -1.91f, -5.81f, -3.21f, -7.3f)
                curveToRelative(0.38f, -0.5f, 0.68f, -1.06f, 0.88f, -1.66f)
                lineToRelative(3.32f, -1.13f)
                close()
                moveTo(15.79f, 23f)
                horizontalLineToRelative(-7.27f)
                curveToRelative(-2.86f, 0f, -5.16f, -1.14f, -6.46f, -3.22f)
                curveToRelative(-1.27f, -2.02f, -1.39f, -4.71f, -0.33f, -7.36f)
                curveToRelative(0.59f, 0.67f, 1.6f, 1.58f, 2.78f, 1.58f)
                curveToRelative(2.52f, 0f, 4.89f, -2.19f, 6.26f, -3.76f)
                curveToRelative(1.09f, 1.08f, 2.58f, 1.76f, 4.24f, 1.76f)
                curveToRelative(1.59f, 0f, 3.04f, -0.62f, 4.12f, -1.64f)
                curveToRelative(1.1f, 1.32f, 2.88f, 4.28f, 2.88f, 6.54f)
                curveToRelative(0f, 4.48f, -3.72f, 6.1f, -6.21f, 6.1f)
                close()
                moveTo(15f, 11f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(12.24f, 1f, 15f, 1f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _Duck = it}
