package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleHorizontal: ImageVector? = null

val Icons.Tc.RectangleHorizontal: ImageVector
    get() = _RectangleHorizontal ?: UXIcon(name = "RectangleHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19.4f)
                curveToRelative(-4.99f, 0f, -9.34f, -0.79f, -9.38f, -0.8f)
                curveToRelative(-0.16f, -0.03f, -0.29f, -0.13f, -0.36f, -0.28f)
                curveToRelative(-0.05f, -0.11f, -1.25f, -2.74f, -1.25f, -6.32f)
                curveToRelative(0f, -3.55f, 1.2f, -6.21f, 1.25f, -6.32f)
                curveToRelative(0.07f, -0.15f, 0.2f, -0.25f, 0.36f, -0.28f)
                curveToRelative(0.04f, -0.01f, 4.4f, -0.8f, 9.38f, -0.8f)
                reflectiveCurveToRelative(9.34f, 0.79f, 9.38f, 0.8f)
                curveToRelative(0.16f, 0.03f, 0.29f, 0.13f, 0.36f, 0.28f)
                curveToRelative(0.05f, 0.11f, 1.25f, 2.74f, 1.25f, 6.32f)
                curveToRelative(0f, 3.55f, -1.2f, 6.21f, -1.25f, 6.32f)
                curveToRelative(-0.07f, 0.15f, -0.2f, 0.25f, -0.36f, 0.28f)
                curveToRelative(-0.04f, 0.01f, -4.4f, 0.8f, -9.38f, 0.8f)
                close()
                moveTo(3.06f, 17.66f)
                curveToRelative(1.0f, 0.17f, 4.74f, 0.74f, 8.94f, 0.74f)
                reflectiveCurveToRelative(7.93f, -0.57f, 8.94f, -0.74f)
                curveToRelative(0.28f, -0.71f, 1.06f, -2.92f, 1.06f, -5.66f)
                curveToRelative(0f, -2.77f, -0.78f, -4.96f, -1.06f, -5.66f)
                curveToRelative(-1.0f, -0.17f, -4.74f, -0.74f, -8.94f, -0.74f)
                reflectiveCurveToRelative(-7.93f, 0.57f, -8.94f, 0.74f)
                curveToRelative(-0.28f, 0.71f, -1.06f, 2.92f, -1.06f, 5.66f)
                curveToRelative(0f, 2.77f, 0.78f, 4.96f, 1.06f, 5.66f)
                close()
            }
        }.also { _RectangleHorizontal = it}
