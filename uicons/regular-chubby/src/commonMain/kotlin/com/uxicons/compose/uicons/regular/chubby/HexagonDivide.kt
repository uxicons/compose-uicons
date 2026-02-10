package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonDivide: ImageVector? = null

val Icons.Rc.HexagonDivide: ImageVector
    get() = _HexagonDivide ?: UXIcon(name = "HexagonDivide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.86f, 6.49f)
                curveToRelative(-1.54f, -2.58f, -3.08f, -4.13f, -3.15f, -4.19f)
                curveToRelative(-0.13f, -0.13f, -0.29f, -0.22f, -0.46f, -0.26f)
                curveToRelative(-0.09f, -0.02f, -2.15f, -0.53f, -5.24f, -0.53f)
                reflectiveCurveToRelative(-5.16f, 0.51f, -5.24f, 0.53f)
                curveToRelative(-0.18f, 0.04f, -0.34f, 0.14f, -0.46f, 0.26f)
                curveToRelative(-0.07f, 0.07f, -1.6f, 1.62f, -3.15f, 4.19f)
                curveToRelative(-1.57f, 2.62f, -2.1f, 5.21f, -2.12f, 5.32f)
                curveToRelative(-0.03f, 0.13f, -0.03f, 0.26f, 0f, 0.39f)
                curveToRelative(0.02f, 0.11f, 0.55f, 2.7f, 2.12f, 5.32f)
                curveToRelative(1.54f, 2.58f, 3.08f, 4.13f, 3.15f, 4.19f)
                curveToRelative(0.13f, 0.13f, 0.29f, 0.22f, 0.46f, 0.26f)
                curveToRelative(0.09f, 0.02f, 2.15f, 0.53f, 5.24f, 0.53f)
                reflectiveCurveToRelative(5.16f, -0.51f, 5.24f, -0.53f)
                curveToRelative(0.18f, -0.04f, 0.34f, -0.14f, 0.46f, -0.26f)
                curveToRelative(0.07f, -0.07f, 1.6f, -1.62f, 3.15f, -4.19f)
                curveToRelative(1.57f, -2.62f, 2.1f, -5.21f, 2.12f, -5.32f)
                curveToRelative(0.03f, -0.13f, 0.03f, -0.26f, 0f, -0.39f)
                curveToRelative(-0.02f, -0.11f, -0.55f, -2.7f, -2.12f, -5.32f)
                close()
                moveTo(19.14f, 16.48f)
                curveToRelative(-1.1f, 1.84f, -2.22f, 3.13f, -2.66f, 3.6f)
                curveToRelative(-0.62f, 0.13f, -2.28f, 0.41f, -4.49f, 0.41f)
                reflectiveCurveToRelative(-3.86f, -0.28f, -4.49f, -0.41f)
                curveToRelative(-0.44f, -0.48f, -1.55f, -1.76f, -2.66f, -3.6f)
                curveToRelative(-1.15f, -1.92f, -1.68f, -3.87f, -1.83f, -4.49f)
                curveToRelative(0.15f, -0.61f, 0.67f, -2.55f, 1.83f, -4.48f)
                curveToRelative(1.1f, -1.84f, 2.22f, -3.13f, 2.66f, -3.6f)
                curveToRelative(0.62f, -0.13f, 2.28f, -0.41f, 4.49f, -0.41f)
                reflectiveCurveToRelative(3.86f, 0.28f, 4.49f, 0.41f)
                curveToRelative(0.44f, 0.48f, 1.55f, 1.76f, 2.66f, 3.6f)
                curveToRelative(1.15f, 1.92f, 1.68f, 3.87f, 1.83f, 4.49f)
                curveToRelative(-0.15f, 0.61f, -0.67f, 2.55f, -1.83f, 4.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 11f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _HexagonDivide = it}
