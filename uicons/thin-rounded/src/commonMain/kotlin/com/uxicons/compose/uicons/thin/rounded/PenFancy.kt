package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancy: ImageVector? = null

val Icons.Tr.PenFancy: ImageVector
    get() = _PenFancy ?: UXIcon(name = "PenFancy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2.63f)
                curveToRelative(0f, -0.7f, -0.27f, -1.36f, -0.77f, -1.86f)
                curveToRelative(-1.02f, -1.02f, -2.69f, -1.02f, -3.71f, 0f)
                lineToRelative(-11.29f, 11.29f)
                reflectiveCurveToRelative(-0.0f, 0f, -0.01f, 0.0f)
                lineToRelative(-3.94f, 1.24f)
                curveToRelative(-1.27f, 0.4f, -2.24f, 1.45f, -2.54f, 2.74f)
                lineTo(0.01f, 23.39f)
                curveToRelative(-0.04f, 0.17f, 0.01f, 0.35f, 0.13f, 0.47f)
                curveToRelative(0.1f, 0.1f, 0.43f, 0.14f, 0.47f, 0.13f)
                lineToRelative(7.34f, -1.72f)
                curveToRelative(1.29f, -0.3f, 2.34f, -1.28f, 2.74f, -2.54f)
                lineToRelative(1.24f, -3.94f)
                reflectiveCurveToRelative(0f, -0.0f, 0.0f, -0.0f)
                lineToRelative(11.29f, -11.29f)
                curveToRelative(0.5f, -0.5f, 0.77f, -1.16f, 0.77f, -1.86f)
                close()
                moveTo(9.75f, 19.42f)
                curveToRelative(-0.29f, 0.93f, -1.07f, 1.65f, -2.02f, 1.87f)
                lineToRelative(-5.63f, 1.32f)
                lineToRelative(3.76f, -3.76f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-3.76f, 3.76f)
                lineToRelative(1.32f, -5.63f)
                curveToRelative(0.22f, -0.95f, 0.94f, -1.72f, 1.87f, -2.02f)
                lineToRelative(3.68f, -1.16f)
                lineToRelative(2.65f, 2.65f)
                lineToRelative(-1.16f, 3.67f)
                close()
                moveTo(22.52f, 3.78f)
                lineToRelative(-11.09f, 11.09f)
                lineToRelative(-2.3f, -2.3f)
                lineTo(20.22f, 1.48f)
                curveToRelative(0.64f, -0.64f, 1.67f, -0.63f, 2.3f, 0f)
                curveToRelative(0.31f, 0.31f, 0.48f, 0.72f, 0.48f, 1.15f)
                reflectiveCurveToRelative(-0.17f, 0.84f, -0.48f, 1.15f)
                close()
            }
        }.also { _PenFancy = it}
