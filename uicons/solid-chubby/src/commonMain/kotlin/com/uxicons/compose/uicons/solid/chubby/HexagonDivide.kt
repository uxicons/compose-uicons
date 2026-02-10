package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonDivide: ImageVector? = null

val Icons.Sc.HexagonDivide: ImageVector
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
                moveTo(12f, 6.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12f, 17.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 13f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _HexagonDivide = it}
