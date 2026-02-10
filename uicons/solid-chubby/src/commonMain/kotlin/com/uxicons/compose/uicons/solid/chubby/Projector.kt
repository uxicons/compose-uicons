package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Projector: ImageVector? = null

val Icons.Sc.Projector: ImageVector
    get() = _Projector ?: UXIcon(name = "Projector") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 11f)
                moveToRelative(-5f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -10f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 4.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 5f)
                curveToRelative(0.26f, 0f, 0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(1f, -1f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-1f, 1f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.29f, 4.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-1f, -1f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.47f, 11.64f)
                curveToRelative(-0.33f, 3.56f, -3.33f, 6.36f, -6.97f, 6.36f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -0.63f, 0.09f, -1.25f, 0.24f, -1.83f)
                curveToRelative(-2.24f, 0.17f, -3.78f, 0.41f, -3.86f, 0.42f)
                curveToRelative(-0.31f, 0.05f, -0.57f, 0.24f, -0.72f, 0.51f)
                curveToRelative(-0.05f, 0.09f, -1.16f, 2.16f, -1.16f, 4.9f)
                curveToRelative(0f, 2.77f, 1.11f, 4.82f, 1.16f, 4.91f)
                curveToRelative(0.15f, 0.27f, 0.42f, 0.46f, 0.72f, 0.51f)
                curveToRelative(0.01f, 0.0f, 0.05f, 0.01f, 0.12f, 0.02f)
                verticalLineToRelative(1.07f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.73f)
                curveToRelative(1.39f, 0.12f, 3.13f, 0.23f, 5f, 0.23f)
                reflectiveCurveToRelative(3.61f, -0.11f, 5f, -0.23f)
                verticalLineToRelative(0.73f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.07f)
                curveToRelative(0.07f, -0.01f, 0.1f, -0.02f, 0.12f, -0.02f)
                curveToRelative(0.31f, -0.05f, 0.57f, -0.24f, 0.72f, -0.51f)
                curveToRelative(0.05f, -0.09f, 1.16f, -2.16f, 1.16f, -4.9f)
                curveToRelative(0f, -1.33f, -0.26f, -2.5f, -0.53f, -3.36f)
                close()
                moveTo(3.5f, 14f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Projector = it}
