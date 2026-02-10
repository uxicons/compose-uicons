package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonExclamation: ImageVector? = null

val Icons.Sc.HexagonExclamation: ImageVector
    get() = _HexagonExclamation ?: UXIcon(name = "HexagonExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.95f, 11.69f)
                curveToRelative(-1.2f, -3.63f, -2.9f, -6.69f, -5.21f, -9.34f)
                curveToRelative(-0.15f, -0.17f, -0.34f, -0.28f, -0.56f, -0.33f)
                curveToRelative(-0.1f, -0.02f, -2.62f, -0.52f, -5.18f, -0.52f)
                reflectiveCurveToRelative(-5.08f, 0.5f, -5.18f, 0.52f)
                curveToRelative(-0.22f, 0.04f, -0.41f, 0.16f, -0.56f, 0.33f)
                curveToRelative(-2.3f, 2.65f, -4.0f, 5.71f, -5.21f, 9.34f)
                curveToRelative(-0.07f, 0.2f, -0.07f, 0.42f, 0f, 0.63f)
                curveToRelative(1.2f, 3.63f, 2.9f, 6.69f, 5.21f, 9.34f)
                curveToRelative(0.14f, 0.17f, 0.34f, 0.28f, 0.56f, 0.33f)
                curveToRelative(0.11f, 0.02f, 2.62f, 0.52f, 5.18f, 0.52f)
                reflectiveCurveToRelative(5.08f, -0.5f, 5.18f, -0.52f)
                curveToRelative(0.22f, -0.04f, 0.41f, -0.16f, 0.56f, -0.33f)
                curveToRelative(2.3f, -2.65f, 4.0f, -5.71f, 5.21f, -9.34f)
                curveToRelative(0.07f, -0.2f, 0.07f, -0.42f, 0f, -0.63f)
                close()
                moveTo(11f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _HexagonExclamation = it}
