package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PigFace: ImageVector? = null

val Icons.Bs.PigFace: ImageVector
    get() = _PigFace ?: UXIcon(name = "PigFace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 15.5f)
                curveToRelative(0f, 1.38f, -1.34f, 2.5f, -3f, 2.5f)
                reflectiveCurveToRelative(-3f, -1.12f, -3f, -2.5f)
                reflectiveCurveToRelative(1.34f, -2.5f, 3f, -2.5f)
                reflectiveCurveToRelative(3f, 1.12f, 3f, 2.5f)
                close()
                moveTo(10f, 11.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(15.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24f, 0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-3.27f, 0f, -6.15f, 0f, -8.27f, 2.23f)
                curveToRelative(-0.72f, -0.15f, -1.46f, -0.23f, -2.23f, -0.23f)
                reflectiveCurveToRelative(-1.51f, 0.08f, -2.23f, 0.23f)
                curveTo(7.65f, 0f, 4.78f, 0f, 1.5f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.16f, 0.02f, 3.65f, 1.87f, 7.21f)
                curveToRelative(-0.56f, 1.32f, -0.87f, 2.77f, -0.87f, 4.29f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -1.52f, -0.31f, -2.97f, -0.87f, -4.29f)
                curveToRelative(1.85f, -3.56f, 1.87f, -7.06f, 1.87f, -7.21f)
                lineTo(24f, 0f)
                close()
                moveTo(3.15f, 3.01f)
                curveToRelative(1.44f, 0.03f, 2.48f, 0.14f, 3.31f, 0.49f)
                curveToRelative(-0.99f, 0.58f, -1.88f, 1.31f, -2.64f, 2.16f)
                curveToRelative(-0.35f, -1f, -0.55f, -1.93f, -0.67f, -2.65f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                reflectiveCurveTo(7.58f, 5f, 12f, 5f)
                reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                reflectiveCurveToRelative(-3.58f, 8f, -8f, 8f)
                close()
                moveTo(20.19f, 5.66f)
                curveToRelative(-0.76f, -0.85f, -1.65f, -1.58f, -2.64f, -2.16f)
                curveToRelative(0.82f, -0.35f, 1.87f, -0.46f, 3.31f, -0.49f)
                curveToRelative(-0.11f, 0.72f, -0.31f, 1.65f, -0.67f, 2.65f)
                close()
            }
        }.also { _PigFace = it}
