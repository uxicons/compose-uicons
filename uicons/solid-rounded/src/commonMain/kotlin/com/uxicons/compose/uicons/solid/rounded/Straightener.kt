package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Straightener: ImageVector? = null

val Icons.Sr.Straightener: ImageVector
    get() = _Straightener ?: UXIcon(name = "Straightener") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.67f, 15.31f)
                lineToRelative(4.03f, -12.52f)
                curveToRelative(0.66f, -2.1f, 2.9f, -3.27f, 5.01f, -2.62f)
                curveToRelative(1.6f, 0.77f, 1.31f, 1.84f, 1.31f, 1.84f)
                reflectiveCurveToRelative(0.83f, 0.03f, 0.52f, 1.01f)
                reflectiveCurveToRelative(-1.49f, 4.69f, -1.77f, 5.54f)
                reflectiveCurveToRelative(-0.98f, 0.46f, -0.98f, 0.46f)
                lineToRelative(-2.33f, 7.68f)
                curveToRelative(-1.0f, -1.05f, -2.41f, -1.71f, -3.97f, -1.71f)
                curveToRelative(-0.64f, 0f, -1.24f, 0.11f, -1.81f, 0.31f)
                close()
                moveTo(23.8f, 13.37f)
                curveToRelative(-0.51f, -1.57f, -1.79f, -1.29f, -1.79f, -1.29f)
                reflectiveCurveToRelative(-0.15f, -0.74f, -1.0f, -0.49f)
                reflectiveCurveToRelative(-4.61f, 1.44f, -5.46f, 1.74f)
                reflectiveCurveToRelative(-0.52f, 1.04f, -0.52f, 1.04f)
                lineToRelative(-7.55f, 2.36f)
                curveToRelative(0.7f, 0.75f, 1.19f, 1.68f, 1.4f, 2.69f)
                curveToRelative(0.21f, 1.04f, 0.1f, 2.16f, -0.29f, 3.14f)
                lineToRelative(3.36f, -1.11f)
                lineToRelative(9.24f, -3.07f)
                curveToRelative(2.1f, -0.66f, 3.28f, -2.9f, 2.62f, -5.01f)
                close()
                moveTo(3.49f, 24f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
            }
        }.also { _Straightener = it}
