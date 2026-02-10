package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Om: ImageVector? = null

val Icons.Bs.Om: ImageVector
    get() = _Om ?: UXIcon(name = "Om") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 2f)
                curveToRelative(1.3f, 1.83f, 3.09f, 2f, 4.17f, 2f)
                curveToRelative(1.87f, 0f, 3.33f, -1.5f, 3.33f, -1.5f)
                lineToRelative(2f, 2.5f)
                curveToRelative(-1.31f, 1.28f, -2.76f, 1.82f, -4.26f, 1.82f)
                curveToRelative(-3f, 0f, -4.42f, -2.25f, -5.24f, -4.82f)
                close()
                moveTo(14.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(18.75f, 8f)
                curveToRelative(-1.97f, 0f, -3.05f, 1.08f, -3.92f, 1.95f)
                curveToRelative(-0.47f, 0.47f, -0.92f, 0.92f, -1.5f, 1.21f)
                curveToRelative(-0.26f, 0.13f, -1.01f, 0.23f, -1.95f, 0.21f)
                curveToRelative(0.38f, -0.71f, 0.62f, -1.5f, 0.62f, -2.37f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(-2.47f, 0f, -4.79f, 2.17f, -5.04f, 2.42f)
                lineToRelative(2.08f, 2.16f)
                curveToRelative(0.54f, -0.52f, 1.97f, -1.58f, 2.96f, -1.58f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-4f, 0f, -6.5f, -5.53f, -6.5f, -7.46f)
                verticalLineToRelative(3.96f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                curveToRelative(3.55f, -0.04f, 6.5f, -2.94f, 6.5f, -6.5f)
                curveToRelative(0f, -1.14f, -0.3f, -2.21f, -0.82f, -3.15f)
                curveToRelative(0.97f, -0.04f, 1.86f, -0.2f, 2.49f, -0.51f)
                curveToRelative(1.02f, -0.51f, 1.72f, -1.21f, 2.28f, -1.77f)
                curveToRelative(0.76f, -0.76f, 1.1f, -1.07f, 1.8f, -1.07f)
                curveToRelative(1.06f, 0f, 2.25f, 1.71f, 2.25f, 4f)
                curveToRelative(0f, 2.63f, -1.26f, 4f, -2.5f, 4f)
                curveToRelative(-2.25f, 0f, -3.61f, -1.94f, -4f, -3f)
                curveToRelative(-0.36f, 2.55f, 0.75f, 6f, 4f, 6f)
                curveToRelative(2.72f, -0.03f, 5.5f, -2.44f, 5.5f, -7f)
                curveToRelative(0f, -3.92f, -2.31f, -7f, -5.25f, -7f)
                close()
            }
        }.also { _Om = it}
