package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellFitness: ImageVector? = null

val Icons.Ss.DumbbellFitness: ImageVector
    get() = _DumbbellFitness ?: UXIcon(name = "DumbbellFitness") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 0f)
                curveTo(5.47f, 0f, 3f, 2.47f, 3f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveTo(11.53f, 0f, 8.5f, 0f)
                close()
                moveTo(8.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24f, 20.86f)
                reflectiveCurveToRelative(-4.67f, 3.14f, -12f, 3.14f)
                reflectiveCurveTo(0.01f, 18.76f, 0.01f, 18.76f)
                curveTo(0.01f, 16.86f, 0.27f, 13.05f, 1.97f, 9.17f)
                curveToRelative(1.05f, 1.85f, 2.85f, 3.22f, 5.0f, 3.67f)
                curveToRelative(-0.1f, 1.18f, -0.29f, 2.33f, -0.68f, 3.29f)
                curveToRelative(1.4f, -1.28f, 3.84f, -3.13f, 6.21f, -3.13f)
                curveToRelative(2.12f, 0f, 4.12f, 1.94f, 4.14f, 1.96f)
                lineToRelative(1.49f, -1.33f)
                curveToRelative(-0.04f, -0.05f, -0.52f, -0.58f, -1.31f, -1.15f)
                curveToRelative(0.99f, -0.74f, 2.3f, -1.48f, 3.6f, -1.48f)
                curveToRelative(2.1f, 0f, 3.58f, 0.5f, 3.58f, 0.5f)
                verticalLineToRelative(9.36f)
                close()
            }
        }.also { _DumbbellFitness = it}
