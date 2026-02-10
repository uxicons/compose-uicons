package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PigFace: ImageVector? = null

val Icons.Ss.PigFace: ImageVector
    get() = _PigFace ?: UXIcon(name = "PigFace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 16.5f)
                curveToRelative(0f, 0.81f, -0.92f, 1.5f, -2f, 1.5f)
                reflectiveCurveToRelative(-2f, -0.69f, -2f, -1.5f)
                reflectiveCurveToRelative(0.92f, -1.5f, 2f, -1.5f)
                reflectiveCurveToRelative(2f, 0.69f, 2f, 1.5f)
                close()
                moveTo(23f, 13f)
                curveToRelative(0f, 6.07f, -4.93f, 11f, -11f, 11f)
                reflectiveCurveTo(1f, 19.07f, 1f, 13f)
                reflectiveCurveTo(5.93f, 2f, 12f, 2f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                close()
                moveTo(8.5f, 12f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(16f, 16.5f)
                curveToRelative(0f, -1.93f, -1.79f, -3.5f, -4f, -3.5f)
                reflectiveCurveToRelative(-4f, 1.57f, -4f, 3.5f)
                reflectiveCurveToRelative(1.79f, 3.5f, 4f, 3.5f)
                reflectiveCurveToRelative(4f, -1.57f, 4f, -3.5f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(7.31f, 0.88f)
                curveTo(5.57f, 0f, 3.46f, 0f, 1f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.12f, 0.01f, 2.39f, 0.99f, 5.09f)
                curveTo(2.47f, 3.74f, 4.68f, 1.9f, 7.31f, 0.88f)
                close()
                moveTo(23.01f, 6.09f)
                curveToRelative(0.97f, -2.7f, 0.99f, -4.97f, 0.99f, -5.09f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.46f, 0f, -4.57f, 0f, -6.31f, 0.88f)
                curveToRelative(2.62f, 1.02f, 4.84f, 2.87f, 6.32f, 5.22f)
                close()
            }
        }.also { _PigFace = it}
