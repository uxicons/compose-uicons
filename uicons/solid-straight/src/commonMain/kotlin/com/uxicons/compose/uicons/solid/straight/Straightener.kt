package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Straightener: ImageVector? = null

val Icons.Ss.Straightener: ImageVector
    get() = _Straightener ?: UXIcon(name = "Straightener") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.69f, 15.31f)
                lineToRelative(4.03f, -12.52f)
                curveToRelative(0.66f, -2.1f, 2.9f, -3.27f, 5.01f, -2.62f)
                lineToRelative(1.71f, 0.56f)
                lineToRelative(-0.41f, 1.27f)
                lineToRelative(0.77f, 0.25f)
                lineToRelative(-2.24f, 7f)
                lineToRelative(-0.75f, -0.24f)
                lineToRelative(-2.33f, 7.68f)
                curveToRelative(-1.0f, -1.05f, -2.41f, -1.71f, -3.97f, -1.71f)
                curveToRelative(-0.64f, 0f, -1.24f, 0.11f, -1.81f, 0.31f)
                close()
                moveTo(23.82f, 13.37f)
                lineTo(23.27f, 11.67f)
                lineTo(22.02f, 12.08f)
                lineTo(21.78f, 11.31f)
                lineTo(14.78f, 13.56f)
                lineTo(15.04f, 14.37f)
                lineTo(7.49f, 16.73f)
                curveToRelative(0.7f, 0.75f, 1.19f, 1.68f, 1.4f, 2.69f)
                curveToRelative(0.21f, 1.04f, 0.1f, 2.16f, -0.29f, 3.14f)
                lineToRelative(3.36f, -1.11f)
                lineToRelative(9.24f, -3.07f)
                curveToRelative(2.1f, -0.66f, 3.28f, -2.9f, 2.62f, -5.01f)
                close()
                moveTo(3.5f, 24f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
            }
        }.also { _Straightener = it}
