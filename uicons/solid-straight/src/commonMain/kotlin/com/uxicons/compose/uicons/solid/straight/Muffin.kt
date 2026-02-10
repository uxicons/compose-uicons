package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Muffin: ImageVector? = null

val Icons.Ss.Muffin: ImageVector
    get() = _Muffin ?: UXIcon(name = "Muffin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 15f)
                curveToRelative(-0.99f, 0f, -1.96f, -0.24f, -2.83f, -0.71f)
                curveToRelative(-1.98f, 0.93f, -4.36f, 0.93f, -6.34f, 0f)
                curveToRelative(-0.87f, 0.46f, -1.83f, 0.71f, -2.83f, 0.71f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.42f, -1.89f, 3.61f, -3f, 5.99f, -3f)
                reflectiveCurveToRelative(4.58f, 1.11f, 5.99f, 3f)
                horizontalLineToRelative(0.01f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(9.36f, 16.61f)
                lineTo(9.73f, 24f)
                horizontalLineToRelative(4.55f)
                lineToRelative(0.37f, -7.39f)
                curveToRelative(-1.72f, 0.49f, -3.57f, 0.49f, -5.29f, 0f)
                close()
                moveTo(18f, 17f)
                curveToRelative(-0.46f, 0f, -0.92f, -0.04f, -1.37f, -0.12f)
                lineToRelative(-0.36f, 7.12f)
                horizontalLineToRelative(1.69f)
                curveToRelative(1.53f, 0f, 2.81f, -1.15f, 2.98f, -2.66f)
                lineToRelative(0.59f, -5.17f)
                curveToRelative(-1.07f, 0.53f, -2.27f, 0.83f, -3.54f, 0.83f)
                close()
                moveTo(6f, 17f)
                curveToRelative(-1.27f, 0f, -2.47f, -0.3f, -3.54f, -0.83f)
                lineToRelative(0.58f, 5.17f)
                curveToRelative(0.17f, 1.52f, 1.45f, 2.66f, 2.98f, 2.66f)
                horizontalLineToRelative(1.69f)
                lineToRelative(-0.36f, -7.12f)
                curveToRelative(-0.45f, 0.08f, -0.91f, 0.12f, -1.37f, 0.12f)
                close()
            }
        }.also { _Muffin = it}
