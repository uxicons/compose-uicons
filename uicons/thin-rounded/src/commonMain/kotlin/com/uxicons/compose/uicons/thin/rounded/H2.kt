package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H2: ImageVector? = null

val Icons.Tr.H2: ImageVector
    get() = _H2 ?: UXIcon(name = "H2") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-7.5f)
                lineTo(1f, 12f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(0f, 4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(23.5f, 19f)
                lineToRelative(-7.8f, -0.0f)
                curveToRelative(-0.28f, 0f, -0.51f, -0.15f, -0.63f, -0.4f)
                curveToRelative(-0.12f, -0.26f, -0.08f, -0.55f, 0.11f, -0.78f)
                curveToRelative(0.67f, -0.79f, 1.88f, -1.49f, 3.17f, -2.23f)
                curveToRelative(2.72f, -1.57f, 5.8f, -3.34f, 5.65f, -6.88f)
                curveToRelative(-0.11f, -2.65f, -2.31f, -4.72f, -5.0f, -4.72f)
                curveToRelative(-2.76f, 0f, -5.0f, 2.24f, -5.0f, 5.0f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -2.21f, 1.8f, -4.0f, 4.0f, -4.0f)
                curveToRelative(2.15f, 0f, 3.91f, 1.65f, 4.0f, 3.76f)
                curveToRelative(0.12f, 2.93f, -2.56f, 4.47f, -5.15f, 5.97f)
                curveToRelative(-1.36f, 0.79f, -2.65f, 1.53f, -3.43f, 2.45f)
                curveToRelative(-0.44f, 0.52f, -0.54f, 1.23f, -0.25f, 1.84f)
                curveToRelative(0.28f, 0.6f, 0.87f, 0.98f, 1.54f, 0.98f)
                lineToRelative(7.8f, 0.0f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _H2 = it}
