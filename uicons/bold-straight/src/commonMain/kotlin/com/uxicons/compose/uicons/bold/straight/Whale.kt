package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whale: ImageVector? = null

val Icons.Bs.Whale: ImageVector
    get() = _Whale ?: UXIcon(name = "Whale") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 8.0f)
                lineToRelative(-2.0f, -0.0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-3.38f, 0f, -7.18f, 2.85f, -9.5f, 4.93f)
                verticalLineToRelative(3.99f)
                lineToRelative(0.1f, 0.09f)
                curveToRelative(1.55f, -1.67f, 6.25f, -6.02f, 9.4f, -6.02f)
                lineToRelative(2.0f, 0.0f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(6.5f, 21f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3.97f)
                curveToRelative(0f, -1.68f, 0.49f, -3.31f, 1.43f, -4.71f)
                lineToRelative(2.28f, -3.42f)
                curveToRelative(2.46f, -0.56f, 4.29f, -2.77f, 4.29f, -5.39f)
                curveToRelative(-4.17f, 0f, -5.5f, 2.78f, -5.5f, 2.78f)
                curveToRelative(0f, 0f, -1.38f, -2.78f, -5.5f, -2.78f)
                curveToRelative(0f, 2.26f, 1.36f, 4.22f, 3.32f, 5.07f)
                lineToRelative(-1.39f, 2.08f)
                curveToRelative(-1.26f, 1.9f, -1.93f, 4.1f, -1.93f, 6.38f)
                verticalLineToRelative(3.97f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(12f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0f, -4.13f, -3.36f, -7.5f, -7.5f, -7.5f)
                close()
            }
        }.also { _Whale = it}
