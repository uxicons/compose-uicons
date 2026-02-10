package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tire: ImageVector? = null

val Icons.Tc.Tire: ImageVector
    get() = _Tire ?: UXIcon(name = "Tire") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.89f, 1f, 1.03f, 2.25f, 1.03f, 12f)
                curveToRelative(0f, 7.71f, 3.28f, 11f, 10.97f, 11f)
                curveToRelative(5.11f, 0f, 10.97f, -1.25f, 10.97f, -11f)
                curveToRelative(0f, -7.71f, -3.28f, -11f, -10.97f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.08f, 0f, -9.97f, -2.9f, -9.97f, -10f)
                reflectiveCurveTo(4.92f, 2f, 12f, 2f)
                reflectiveCurveToRelative(9.97f, 2.9f, 9.97f, 10f)
                reflectiveCurveToRelative(-2.89f, 10f, -9.97f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5.2f)
                curveToRelative(-4.78f, 0f, -6.78f, 0.94f, -6.78f, 6.8f)
                reflectiveCurveToRelative(2f, 6.8f, 6.78f, 6.8f)
                reflectiveCurveToRelative(6.78f, -0.94f, 6.78f, -6.8f)
                reflectiveCurveToRelative(-2f, -6.8f, -6.78f, -6.8f)
                close()
                moveTo(17.64f, 9.66f)
                lineToRelative(-3.2f, 1.21f)
                lineToRelative(-1.94f, -1.41f)
                verticalLineToRelative(-3.25f)
                curveToRelative(3.31f, 0.05f, 4.73f, 0.64f, 5.14f, 3.45f)
                close()
                moveTo(10.9f, 13.72f)
                lineToRelative(-0.68f, -2.1f)
                lineToRelative(1.78f, -1.3f)
                lineToRelative(1.78f, 1.3f)
                lineToRelative(-0.68f, 2.1f)
                horizontalLineToRelative(-2.2f)
                close()
                moveTo(11.5f, 6.2f)
                verticalLineToRelative(3.25f)
                lineToRelative(-1.95f, 1.42f)
                lineToRelative(-3.2f, -1.21f)
                curveToRelative(0.42f, -2.81f, 1.83f, -3.41f, 5.14f, -3.46f)
                close()
                moveTo(6.22f, 12.0f)
                curveToRelative(0f, -0.47f, 0.01f, -0.91f, 0.04f, -1.31f)
                lineToRelative(2.98f, 1.13f)
                lineToRelative(0.77f, 2.36f)
                lineToRelative(-2.01f, 3.01f)
                curveToRelative(-1.31f, -0.71f, -1.77f, -2.19f, -1.77f, -5.19f)
                close()
                moveTo(8.95f, 17.54f)
                lineToRelative(1.88f, -2.82f)
                horizontalLineToRelative(2.35f)
                lineToRelative(1.88f, 2.82f)
                curveToRelative(-0.8f, 0.2f, -1.8f, 0.26f, -3.06f, 0.26f)
                curveToRelative(-1.25f, 0f, -2.25f, -0.06f, -3.05f, -0.25f)
                close()
                moveTo(16.02f, 17.18f)
                lineToRelative(-2.02f, -3.02f)
                lineToRelative(0.76f, -2.35f)
                lineToRelative(2.98f, -1.13f)
                curveToRelative(0.03f, 0.4f, 0.04f, 0.84f, 0.04f, 1.31f)
                curveToRelative(0f, 2.98f, -0.46f, 4.47f, -1.76f, 5.18f)
                close()
            }
        }.also { _Tire = it}
