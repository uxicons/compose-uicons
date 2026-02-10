package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonDivide: ImageVector? = null

val Icons.Tc.HexagonDivide: ImageVector
    get() = _HexagonDivide ?: UXIcon(name = "HexagonDivide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.83f, 6.48f)
                curveToRelative(-1.59f, -2.65f, -3.16f, -4.24f, -3.23f, -4.31f)
                curveToRelative(-0.06f, -0.06f, -0.14f, -0.11f, -0.23f, -0.13f)
                curveToRelative(-0.09f, -0.02f, -2.2f, -0.54f, -5.37f, -0.54f)
                reflectiveCurveToRelative(-5.28f, 0.52f, -5.37f, 0.54f)
                curveToRelative(-0.09f, 0.02f, -0.17f, 0.07f, -0.23f, 0.13f)
                curveToRelative(-0.07f, 0.07f, -1.64f, 1.65f, -3.23f, 4.31f)
                curveToRelative(-1.6f, 2.67f, -2.14f, 5.31f, -2.16f, 5.42f)
                curveToRelative(-0.01f, 0.06f, -0.01f, 0.13f, 0f, 0.2f)
                curveToRelative(0.02f, 0.11f, 0.56f, 2.75f, 2.16f, 5.42f)
                curveToRelative(1.59f, 2.65f, 3.16f, 4.24f, 3.23f, 4.31f)
                curveToRelative(0.06f, 0.06f, 0.14f, 0.11f, 0.23f, 0.13f)
                curveToRelative(0.09f, 0.02f, 2.2f, 0.54f, 5.37f, 0.54f)
                reflectiveCurveToRelative(5.28f, -0.52f, 5.37f, -0.54f)
                curveToRelative(0.09f, -0.02f, 0.17f, -0.07f, 0.23f, -0.13f)
                curveToRelative(0.07f, -0.07f, 1.64f, -1.65f, 3.23f, -4.31f)
                curveToRelative(1.6f, -2.67f, 2.14f, -5.31f, 2.16f, -5.42f)
                curveToRelative(0.01f, -0.06f, 0.01f, -0.13f, 0f, -0.2f)
                curveToRelative(-0.02f, -0.11f, -0.56f, -2.75f, -2.16f, -5.42f)
                close()
                moveTo(19.97f, 17.01f)
                curveToRelative(-1.3f, 2.17f, -2.62f, 3.63f, -2.98f, 4.01f)
                curveToRelative(-0.51f, 0.11f, -2.39f, 0.48f, -4.99f, 0.48f)
                reflectiveCurveToRelative(-4.49f, -0.37f, -4.99f, -0.48f)
                curveToRelative(-0.36f, -0.38f, -1.68f, -1.84f, -2.98f, -4.01f)
                curveToRelative(-1.34f, -2.24f, -1.91f, -4.51f, -2.02f, -5.01f)
                curveToRelative(0.11f, -0.49f, 0.68f, -2.77f, 2.02f, -5.01f)
                curveToRelative(1.3f, -2.17f, 2.62f, -3.63f, 2.98f, -4.01f)
                curveToRelative(0.51f, -0.11f, 2.39f, -0.48f, 4.99f, -0.48f)
                reflectiveCurveToRelative(4.49f, 0.37f, 4.99f, 0.48f)
                curveToRelative(0.36f, 0.38f, 1.68f, 1.84f, 2.98f, 4.01f)
                curveToRelative(1.34f, 2.24f, 1.91f, 4.51f, 2.02f, 5.01f)
                curveToRelative(-0.11f, 0.49f, -0.68f, 2.77f, -2.02f, 5.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 11.5f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.5f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.5f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
        }.also { _HexagonDivide = it}
