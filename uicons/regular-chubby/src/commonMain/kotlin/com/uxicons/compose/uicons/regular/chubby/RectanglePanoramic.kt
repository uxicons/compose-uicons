package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectanglePanoramic: ImageVector? = null

val Icons.Rc.RectanglePanoramic: ImageVector
    get() = _RectanglePanoramic ?: UXIcon(name = "RectanglePanoramic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 6.79f)
                curveToRelative(-0.13f, -0.33f, -0.43f, -0.57f, -0.78f, -0.62f)
                curveToRelative(-0.18f, -0.03f, -4.37f, -0.64f, -9.33f, -0.64f)
                reflectiveCurveToRelative(-9.15f, 0.61f, -9.33f, 0.64f)
                curveToRelative(-0.35f, 0.05f, -0.65f, 0.29f, -0.78f, 0.62f)
                curveToRelative(-0.04f, 0.09f, -0.89f, 2.29f, -0.89f, 5.21f)
                curveToRelative(0f, 2.94f, 0.85f, 5.12f, 0.89f, 5.21f)
                curveToRelative(0.13f, 0.33f, 0.43f, 0.57f, 0.78f, 0.62f)
                curveToRelative(0.18f, 0.03f, 4.37f, 0.64f, 9.33f, 0.64f)
                reflectiveCurveToRelative(9.15f, -0.61f, 9.33f, -0.64f)
                curveToRelative(0.35f, -0.05f, 0.65f, -0.29f, 0.78f, -0.62f)
                curveToRelative(0.04f, -0.09f, 0.89f, -2.29f, 0.89f, -5.21f)
                curveToRelative(0f, -2.94f, -0.85f, -5.12f, -0.89f, -5.21f)
                close()
                moveTo(20.43f, 15.94f)
                curveToRelative(-1.33f, 0.17f, -4.69f, 0.54f, -8.43f, 0.54f)
                reflectiveCurveToRelative(-7.1f, -0.37f, -8.43f, -0.54f)
                curveToRelative(-0.22f, -0.74f, -0.57f, -2.19f, -0.57f, -3.94f)
                curveToRelative(0f, -1.73f, 0.35f, -3.19f, 0.57f, -3.94f)
                curveToRelative(1.33f, -0.17f, 4.69f, -0.54f, 8.43f, -0.54f)
                reflectiveCurveToRelative(7.1f, 0.37f, 8.43f, 0.54f)
                curveToRelative(0.22f, 0.74f, 0.57f, 2.19f, 0.57f, 3.94f)
                curveToRelative(0f, 1.73f, -0.35f, 3.19f, -0.57f, 3.94f)
                close()
            }
        }.also { _RectanglePanoramic = it}
