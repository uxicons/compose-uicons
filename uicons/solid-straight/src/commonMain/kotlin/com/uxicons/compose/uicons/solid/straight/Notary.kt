package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notary: ImageVector? = null

val Icons.Ss.Notary: ImageVector
    get() = _Notary ?: UXIcon(name = "Notary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 10f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.87f)
                curveToRelative(0.66f, -1.25f, 1.37f, -2.76f, 1.37f, -3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.45f, -2.5f, -2.45f)
                reflectiveCurveToRelative(-2.5f, 1.07f, -2.5f, 2.45f)
                curveToRelative(0f, 0.74f, 0.71f, 2.25f, 1.37f, 3.5f)
                horizontalLineToRelative(-0.87f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 17f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.47f, -1.26f, 2.64f, -2.76f, 2.49f)
                curveToRelative(-1.3f, -0.13f, -2.24f, -1.32f, -2.24f, -2.63f)
                verticalLineToRelative(-19.86f)
                curveToRelative(0f, -0.54f, -0.12f, -1.04f, -0.34f, -1.5f)
                horizontalLineToRelative(10.12f)
                curveToRelative(-0.49f, 0.71f, -0.78f, 1.57f, -0.78f, 2.5f)
                curveToRelative(0f, 0.43f, 0.07f, 0.99f, 0.46f, 1.99f)
                curveToRelative(-1.32f, 0.67f, -2.26f, 1.98f, -2.43f, 3.51f)
                horizontalLineToRelative(-1.03f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(9f)
                close()
                moveTo(3f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(12f, 19f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-9.26f)
                curveToRelative(0.48f, -0.72f, 0.76f, -1.58f, 0.76f, -2.5f)
                close()
            }
        }.also { _Notary = it}
