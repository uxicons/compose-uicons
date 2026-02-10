package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMusic: ImageVector? = null

val Icons.Rc.UserMusic: ImageVector
    get() = _UserMusic ?: UXIcon(name = "UserMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.49f, 12f)
                curveToRelative(3.75f, 0f, 5.5f, -1.75f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-1.75f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 1.75f, -5.5f, 5.5f)
                reflectiveCurveToRelative(1.75f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(9.49f, 3f)
                curveToRelative(2.65f, 0f, 3.5f, 0.85f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-0.85f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -0.85f, -3.5f, -3.5f)
                reflectiveCurveToRelative(0.85f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(12.98f, 15.38f)
                curveToRelative(-0.1f, 0.54f, -0.61f, 0.9f, -1.16f, 0.81f)
                curveToRelative(-0.67f, -0.12f, -1.45f, -0.18f, -2.33f, -0.18f)
                curveToRelative(-4.68f, 0f, -6.38f, 1.58f, -6.49f, 6.03f)
                curveToRelative(-0.01f, 0.54f, -0.46f, 0.97f, -1.0f, 0.97f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                curveToRelative(-0.55f, -0.01f, -0.99f, -0.47f, -0.97f, -1.03f)
                curveToRelative(0.15f, -5.51f, 2.77f, -7.97f, 8.49f, -7.97f)
                curveToRelative(1.01f, 0f, 1.89f, 0.07f, 2.69f, 0.22f)
                curveToRelative(0.54f, 0.1f, 0.9f, 0.62f, 0.81f, 1.16f)
                close()
                moveTo(23f, 13.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                reflectiveCurveToRelative(0.57f, -2f, 2f, -2f)
                verticalLineToRelative(-3.82f)
                curveToRelative(-0.3f, -0.1f, -0.66f, -0.18f, -1f, -0.18f)
                curveToRelative(-1.84f, 0f, -2.71f, 0.9f, -3f, 1.29f)
                verticalLineToRelative(5.71f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                reflectiveCurveToRelative(0.57f, -2f, 2f, -2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.15f, 0.04f, -0.31f, 0.1f, -0.45f)
                curveToRelative(0.05f, -0.1f, 1.32f, -2.55f, 4.89f, -2.55f)
                curveToRelative(1.2f, 0f, 2.32f, 0.54f, 2.45f, 0.6f)
                curveToRelative(0.34f, 0.17f, 0.55f, 0.52f, 0.55f, 0.9f)
                close()
            }
        }.also { _UserMusic = it}
