package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BalletDance: ImageVector? = null

val Icons.Ss.BalletDance: ImageVector
    get() = _BalletDance ?: UXIcon(name = "BalletDance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(23.28f, 10.04f)
                lineToRelative(-3.73f, 1.09f)
                curveToRelative(0.09f, -0.16f, 0.19f, -0.32f, 0.25f, -0.47f)
                curveToRelative(0.35f, -0.89f, 0.19f, -1.57f, -0.0f, -1.99f)
                curveToRelative(-0.42f, -0.89f, -1.61f, -1.9f, -4.92f, -1.62f)
                curveToRelative(-1.1f, 0.14f, -1.94f, 0.34f, -2.67f, 0.55f)
                curveToRelative(0.24f, 0.49f, 0.69f, 1.25f, 1.49f, 2.07f)
                lineToRelative(0.58f, 0.58f)
                lineToRelative(-1.52f, 1.24f)
                reflectiveCurveToRelative(-0.33f, -0.27f, -0.81f, -0.77f)
                curveToRelative(-0.86f, -0.96f, -1.4f, -2.03f, -1.67f, -2.62f)
                curveToRelative(2.53f, -1.73f, 4.72f, -5.88f, 4.72f, -8.1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.36f, -1.46f, 4.4f, -3.28f, 6f)
                horizontalLineToRelative(-5.5f)
                curveTo(2.5f, 3.5f, 2f, 1.72f, 2f, 0f)
                lineTo(0f, 0f)
                curveToRelative(0f, 3.77f, 2.83f, 7.49f, 3.04f, 7.81f)
                curveToRelative(2.15f, 3.19f, 5.12f, 5.55f, 5.12f, 5.55f)
                curveToRelative(-0.21f, 0.01f, -0.41f, 0.01f, -0.59f, 0.01f)
                curveToRelative(-1.39f, 0f, -2.73f, -0.54f, -2.73f, -0.54f)
                curveToRelative(0f, 0f, -0.32f, -0.21f, -1.31f, -1.27f)
                curveToRelative(-2.11f, 1.67f, -2.99f, 3.37f, -2.33f, 4.76f)
                curveToRelative(0.55f, 1.17f, 2.0f, 1.66f, 3.87f, 1.66f)
                curveToRelative(1.18f, 0f, 2.53f, -0.2f, 3.92f, -0.55f)
                verticalLineToRelative(6.56f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.16f)
                curveToRelative(0.42f, -0.15f, 0.85f, -0.3f, 1.26f, -0.47f)
                curveToRelative(1.63f, -0.66f, 3.09f, -1.45f, 4.3f, -2.29f)
                lineToRelative(7.28f, -2.12f)
                lineToRelative(-0.56f, -1.92f)
                close()
            }
        }.also { _BalletDance = it}
