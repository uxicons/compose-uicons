package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SadTear: ImageVector? = null

val Icons.Tr.SadTear: ImageVector
    get() = _SadTear ?: UXIcon(name = "SadTear") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(7.5f, 19f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.24f, 0.97f, -2.84f, 1.62f, -3.61f)
                curveToRelative(0.21f, -0.25f, 0.52f, -0.39f, 0.84f, -0.39f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.32f, 0f, 0.63f, 0.14f, 0.84f, 0.39f)
                curveToRelative(0.63f, 0.74f, 1.7f, 2.33f, 1.7f, 3.61f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(7.38f, 13.54f)
                curveToRelative(-0.57f, 0.68f, -1.38f, 2.05f, -1.38f, 2.96f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.92f, -0.87f, -2.28f, -1.46f, -2.96f)
                horizontalLineToRelative(-0.16f)
                close()
                moveTo(17.89f, 16.81f)
                curveToRelative(0.17f, -0.21f, 0.14f, -0.53f, -0.07f, -0.7f)
                curveToRelative(-0.11f, -0.09f, -2.64f, -2.11f, -5.82f, -2.11f)
                curveToRelative(-0.18f, 0f, -0.36f, 0.01f, -0.54f, 0.02f)
                curveToRelative(-0.28f, 0.02f, -0.48f, 0.26f, -0.46f, 0.53f)
                curveToRelative(0.02f, 0.28f, 0.25f, 0.48f, 0.53f, 0.46f)
                curveToRelative(0.15f, -0.01f, 0.31f, -0.02f, 0.46f, -0.02f)
                curveToRelative(2.81f, 0f, 5.16f, 1.87f, 5.19f, 1.89f)
                curveToRelative(0.09f, 0.07f, 0.2f, 0.11f, 0.31f, 0.11f)
                curveToRelative(0.15f, 0f, 0.29f, -0.06f, 0.39f, -0.19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 10f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 10f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _SadTear = it}
