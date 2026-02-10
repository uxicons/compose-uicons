package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eye: ImageVector? = null

val Icons.Tc.Eye: ImageVector
    get() = _Eye ?: UXIcon(name = "Eye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 7.4f)
                curveToRelative(-2.94f, 0.02f, -4.58f, 1.72f, -4.58f, 4.61f)
                reflectiveCurveToRelative(1.64f, 4.57f, 4.59f, 4.59f)
                curveToRelative(2.94f, -0.02f, 4.53f, -1.6f, 4.58f, -4.6f)
                curveToRelative(-0.05f, -2.94f, -1.68f, -4.57f, -4.59f, -4.59f)
                close()
                moveTo(12.0f, 15.6f)
                curveToRelative(-2.4f, -0.01f, -3.54f, -1.16f, -3.59f, -3.6f)
                curveToRelative(0.05f, -2.44f, 1.19f, -3.58f, 3.58f, -3.6f)
                curveToRelative(2.34f, 0.02f, 3.54f, 1.23f, 3.59f, 3.59f)
                curveToRelative(-0.04f, 2.44f, -1.18f, 3.59f, -3.58f, 3.6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.98f, 11.95f)
                curveToRelative(-1.63f, -5.62f, -5.43f, -8.61f, -10.97f, -8.66f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-5.67f, 0.05f, -9.36f, 2.94f, -10.98f, 8.6f)
                curveToRelative(-0.03f, 0.09f, -0.03f, 0.18f, 0f, 0.27f)
                curveToRelative(1.6f, 5.63f, 5.3f, 8.5f, 10.99f, 8.54f)
                curveToRelative(5.68f, -0.04f, 9.37f, -2.9f, 10.97f, -8.48f)
                curveToRelative(0.03f, -0.09f, 0.03f, -0.19f, 0f, -0.28f)
                close()
                moveTo(12.01f, 19.71f)
                curveToRelative(-5.22f, -0.04f, -8.48f, -2.55f, -9.99f, -7.68f)
                curveToRelative(1.5f, -5.09f, 4.86f, -7.7f, 9.98f, -7.74f)
                curveToRelative(5.08f, 0.05f, 8.44f, 2.67f, 9.97f, 7.8f)
                curveToRelative(-1.5f, 5.09f, -4.77f, 7.58f, -9.97f, 7.62f)
                close()
            }
        }.also { _Eye = it}
