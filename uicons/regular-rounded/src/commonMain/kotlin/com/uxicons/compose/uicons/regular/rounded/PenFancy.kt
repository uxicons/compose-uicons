package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancy: ImageVector? = null

val Icons.Rr.PenFancy: ImageVector
    get() = _PenFancy ?: UXIcon(name = "PenFancy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-10.13f, 10.13f)
                curveToRelative(-0.05f, 0.01f, -4.1f, 1.28f, -4.1f, 1.28f)
                curveToRelative(-1.44f, 0.45f, -2.55f, 1.65f, -2.89f, 3.11f)
                lineTo(0.03f, 22.77f)
                curveToRelative(-0.08f, 0.34f, 0.02f, 0.69f, 0.27f, 0.94f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.08f, 0f, 0.15f, -0.01f, 0.23f, -0.03f)
                lineToRelative(7.37f, -1.73f)
                curveToRelative(1.47f, -0.34f, 2.66f, -1.45f, 3.11f, -2.89f)
                curveToRelative(0f, 0f, 1.27f, -4.05f, 1.28f, -4.1f)
                lineToRelative(10.13f, -10.13f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                close()
                moveTo(9.8f, 18.76f)
                curveToRelative(-0.24f, 0.77f, -0.88f, 1.36f, -1.66f, 1.54f)
                lineToRelative(-3.95f, 0.93f)
                lineToRelative(2.52f, -2.52f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.52f, 2.52f)
                lineToRelative(0.93f, -3.95f)
                curveToRelative(0.18f, -0.78f, 0.78f, -1.42f, 1.54f, -1.66f)
                lineToRelative(2.69f, -0.85f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(-0.85f, 2.69f)
                close()
                moveTo(21.71f, 3.71f)
                lineToRelative(-10.29f, 10.29f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(20.29f, 2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.1f, 0.52f, -0.29f, 0.71f)
                close()
            }
        }.also { _PenFancy = it}
