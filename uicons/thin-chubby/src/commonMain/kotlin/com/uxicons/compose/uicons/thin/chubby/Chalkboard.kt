package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chalkboard: ImageVector? = null

val Icons.Tc.Chalkboard: ImageVector
    get() = _Chalkboard ?: UXIcon(name = "Chalkboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 20f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(0.3f, -1.28f, 0.91f, -4.36f, 0.91f, -8f)
                curveToRelative(0f, -4.72f, -1.04f, -7.4f, -1.08f, -7.51f)
                curveToRelative(-0.05f, -0.13f, -0.16f, -0.23f, -0.29f, -0.28f)
                curveToRelative(-0.13f, -0.05f, -3.31f, -1.2f, -9.62f, -1.2f)
                reflectiveCurveToRelative(-9.49f, 1.15f, -9.62f, 1.2f)
                curveToRelative(-0.13f, 0.05f, -0.24f, 0.15f, -0.29f, 0.28f)
                curveToRelative(-0.04f, 0.11f, -1.08f, 2.79f, -1.08f, 7.51f)
                curveToRelative(0f, 3.64f, 0.61f, 6.72f, 0.91f, 8f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(21f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -3.78f, 0.7f, -6.22f, 0.94f, -6.93f)
                curveToRelative(0.81f, -0.25f, 3.85f, -1.07f, 9.06f, -1.07f)
                reflectiveCurveToRelative(8.26f, 0.82f, 9.06f, 1.07f)
                curveToRelative(0.23f, 0.71f, 0.94f, 3.15f, 0.94f, 6.93f)
                curveToRelative(0f, 3.74f, -0.69f, 6.95f, -0.94f, 8f)
                horizontalLineToRelative(-2.06f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-11.06f)
                curveToRelative(-0.25f, -1.05f, -0.94f, -4.26f, -0.94f, -8f)
                close()
                moveTo(15f, 20f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Chalkboard = it}
