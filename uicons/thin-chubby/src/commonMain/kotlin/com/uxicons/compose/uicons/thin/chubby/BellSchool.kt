package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSchool: ImageVector? = null

val Icons.Tc.BellSchool: ImageVector
    get() = _BellSchool ?: UXIcon(name = "BellSchool") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.85f, 10.04f)
                moveToRelative(-0.74f, 0f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.49f, 0f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.49f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.19f, 7.22f)
                curveToRelative(-1.89f, 0f, -2.81f, 0.92f, -2.81f, 2.82f)
                reflectiveCurveToRelative(0.92f, 2.82f, 2.81f, 2.82f)
                curveToRelative(0.68f, 0f, 1.24f, -0.12f, 1.67f, -0.36f)
                curveToRelative(-0.61f, 5.03f, -3.22f, 8.14f, -7.76f, 9.27f)
                curveToRelative(-0.91f, 0.23f, -1.85f, 0.02f, -2.59f, -0.55f)
                curveToRelative(-0.71f, -0.56f, -1.13f, -1.39f, -1.16f, -2.29f)
                curveToRelative(2.71f, -0.06f, 6.22f, -0.66f, 7.67f, -4.33f)
                curveToRelative(0.1f, -0.26f, -0.02f, -0.55f, -0.28f, -0.65f)
                curveToRelative(-0.26f, -0.1f, -0.55f, 0.02f, -0.65f, 0.28f)
                curveToRelative(-1.01f, 2.56f, -3.24f, 3.7f, -7.22f, 3.7f)
                curveToRelative(-5.59f, 0f, -7.88f, -2.29f, -7.88f, -7.9f)
                reflectiveCurveTo(4.28f, 2.14f, 9.88f, 2.14f)
                curveToRelative(4.04f, 0f, 6.2f, 1.11f, 7.22f, 3.7f)
                curveToRelative(0.1f, 0.26f, 0.39f, 0.38f, 0.65f, 0.28f)
                curveToRelative(0.26f, -0.1f, 0.38f, -0.39f, 0.28f, -0.65f)
                curveTo(16.52f, 1.63f, 12.88f, 1.14f, 9.88f, 1.14f)
                curveTo(5.74f, 1.14f, 1f, 2.15f, 1f, 10.04f)
                curveToRelative(0f, 7.55f, 4.35f, 8.8f, 8.35f, 8.89f)
                curveToRelative(0.03f, 1.21f, 0.59f, 2.33f, 1.54f, 3.08f)
                curveToRelative(0.72f, 0.56f, 1.58f, 0.85f, 2.47f, 0.85f)
                curveToRelative(0.33f, 0f, 0.65f, -0.04f, 0.98f, -0.12f)
                curveToRelative(5.67f, -1.41f, 8.66f, -5.8f, 8.66f, -12.7f)
                curveToRelative(0f, -1.9f, -0.92f, -2.82f, -2.81f, -2.82f)
                close()
                moveTo(20.19f, 11.86f)
                curveToRelative(-1.18f, 0f, -1.81f, -0.29f, -1.81f, -1.82f)
                curveToRelative(0f, -1.52f, 0.67f, -1.82f, 1.81f, -1.82f)
                curveToRelative(1.18f, 0f, 1.81f, 0.29f, 1.81f, 1.82f)
                curveToRelative(0f, 1.52f, -0.67f, 1.82f, -1.81f, 1.82f)
                close()
            }
        }.also { _BellSchool = it}
