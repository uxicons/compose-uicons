package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectanglePanoramic: ImageVector? = null

val Icons.Tc.RectanglePanoramic: ImageVector
    get() = _RectanglePanoramic ?: UXIcon(name = "RectanglePanoramic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 6.71f)
                curveToRelative(-0.07f, -0.17f, -0.21f, -0.28f, -0.39f, -0.31f)
                curveToRelative(-0.04f, -0.01f, -4.54f, -0.67f, -9.71f, -0.67f)
                reflectiveCurveToRelative(-9.67f, 0.66f, -9.71f, 0.67f)
                curveToRelative(-0.18f, 0.03f, -0.33f, 0.15f, -0.39f, 0.31f)
                curveToRelative(-0.04f, 0.09f, -0.89f, 2.32f, -0.89f, 5.29f)
                curveToRelative(0f, 3.0f, 0.86f, 5.2f, 0.9f, 5.29f)
                curveToRelative(0.07f, 0.17f, 0.21f, 0.28f, 0.39f, 0.31f)
                curveToRelative(0.04f, 0.01f, 4.54f, 0.67f, 9.71f, 0.67f)
                reflectiveCurveToRelative(9.67f, -0.66f, 9.71f, -0.67f)
                curveToRelative(0.18f, -0.03f, 0.33f, -0.15f, 0.39f, -0.31f)
                curveToRelative(0.04f, -0.09f, 0.89f, -2.32f, 0.89f, -5.29f)
                curveToRelative(0f, -3.0f, -0.86f, -5.2f, -0.9f, -5.29f)
                close()
                moveTo(21.27f, 16.66f)
                curveToRelative(-1.08f, 0.14f, -4.94f, 0.62f, -9.27f, 0.62f)
                reflectiveCurveToRelative(-8.2f, -0.47f, -9.27f, -0.62f)
                curveToRelative(-0.22f, -0.66f, -0.73f, -2.44f, -0.73f, -4.66f)
                curveToRelative(0f, -2.2f, 0.51f, -4.0f, 0.73f, -4.66f)
                curveToRelative(1.08f, -0.14f, 4.94f, -0.62f, 9.27f, -0.62f)
                reflectiveCurveToRelative(8.2f, 0.47f, 9.27f, 0.62f)
                curveToRelative(0.22f, 0.66f, 0.73f, 2.44f, 0.73f, 4.66f)
                curveToRelative(0f, 2.2f, -0.51f, 4.0f, -0.73f, 4.66f)
                close()
            }
        }.also { _RectanglePanoramic = it}
