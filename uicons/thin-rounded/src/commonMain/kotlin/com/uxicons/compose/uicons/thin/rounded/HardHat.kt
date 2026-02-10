package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardHat: ImageVector? = null

val Icons.Tr.HardHat: ImageVector
    get() = _HardHat ?: UXIcon(name = "HardHat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 17f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-4.31f)
                curveToRelative(0f, -4.81f, -3.3f, -9.06f, -8.03f, -10.35f)
                curveToRelative(-0.73f, -0.82f, -1.78f, -1.34f, -2.97f, -1.34f)
                reflectiveCurveToRelative(-2.23f, 0.52f, -2.97f, 1.34f)
                curveTo(4.3f, 3.63f, 1f, 7.88f, 1f, 12.69f)
                verticalLineToRelative(4.31f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.76f, 0.97f, 4.3f, 5f, 10.75f, 5f)
                reflectiveCurveToRelative(9.99f, -4.03f, 10.75f, -5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(22f, 12.69f)
                verticalLineToRelative(4.31f)
                horizontalLineToRelative(-6f)
                lineTo(16f, 4.99f)
                curveToRelative(0f, -0.47f, -0.1f, -0.91f, -0.25f, -1.33f)
                curveToRelative(3.73f, 1.47f, 6.25f, 5.03f, 6.25f, 9.03f)
                close()
                moveTo(12f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.34f, 3f, 2.99f)
                verticalLineToRelative(12.01f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 4.99f)
                curveToRelative(0f, -1.65f, 1.35f, -2.99f, 3f, -2.99f)
                close()
                moveTo(2f, 12.69f)
                curveToRelative(0f, -4.0f, 2.52f, -7.56f, 6.25f, -9.03f)
                curveToRelative(-0.15f, 0.42f, -0.25f, 0.86f, -0.25f, 1.33f)
                verticalLineToRelative(12.01f)
                lineTo(2f, 17f)
                verticalLineToRelative(-4.31f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-4.96f, 0f, -8.12f, -2.64f, -9.41f, -4f)
                horizontalLineToRelative(18.83f)
                curveToRelative(-1.3f, 1.36f, -4.46f, 4f, -9.41f, 4f)
                close()
            }
        }.also { _HardHat = it}
