package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlusHexagon: ImageVector? = null

val Icons.Tc.PlusHexagon: ImageVector
    get() = _PlusHexagon ?: UXIcon(name = "PlusHexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(22.98f, 11.84f)
                curveToRelative(0.03f, 0.1f, 0.03f, 0.21f, 0f, 0.31f)
                curveToRelative(-1.24f, 3.75f, -2.99f, 6.91f, -5.36f, 9.64f)
                curveToRelative(-0.07f, 0.08f, -0.17f, 0.14f, -0.28f, 0.16f)
                curveToRelative(-0.11f, 0.02f, -2.7f, 0.54f, -5.33f, 0.54f)
                reflectiveCurveToRelative(-5.23f, -0.52f, -5.33f, -0.54f)
                curveToRelative(-0.11f, -0.02f, -0.21f, -0.08f, -0.28f, -0.16f)
                curveToRelative(-2.37f, -2.74f, -4.12f, -5.89f, -5.36f, -9.64f)
                curveToRelative(-0.03f, -0.1f, -0.03f, -0.21f, 0f, -0.31f)
                curveToRelative(1.24f, -3.75f, 2.99f, -6.91f, 5.36f, -9.64f)
                curveToRelative(0.07f, -0.08f, 0.17f, -0.14f, 0.28f, -0.16f)
                curveToRelative(0.11f, -0.02f, 2.7f, -0.54f, 5.33f, -0.54f)
                reflectiveCurveToRelative(5.23f, 0.52f, 5.33f, 0.54f)
                curveToRelative(0.11f, 0.02f, 0.21f, 0.08f, 0.28f, 0.16f)
                curveToRelative(2.37f, 2.74f, 4.12f, 5.89f, 5.36f, 9.64f)
                close()
                moveTo(21.97f, 12f)
                curveToRelative(-1.17f, -3.5f, -2.81f, -6.45f, -5.0f, -9.02f)
                curveToRelative(-0.61f, -0.11f, -2.81f, -0.48f, -4.97f, -0.48f)
                reflectiveCurveToRelative(-4.36f, 0.37f, -4.97f, 0.48f)
                curveToRelative(-2.19f, 2.57f, -3.83f, 5.52f, -5.0f, 9.02f)
                curveToRelative(1.17f, 3.5f, 2.81f, 6.45f, 5.0f, 9.02f)
                curveToRelative(0.61f, 0.11f, 2.81f, 0.48f, 4.97f, 0.48f)
                reflectiveCurveToRelative(4.36f, -0.37f, 4.97f, -0.48f)
                curveToRelative(2.19f, -2.57f, 3.83f, -5.52f, 5.0f, -9.02f)
                close()
            }
        }.also { _PlusHexagon = it}
