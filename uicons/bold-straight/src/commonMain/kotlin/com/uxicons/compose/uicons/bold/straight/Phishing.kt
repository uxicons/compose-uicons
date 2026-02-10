package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Phishing: ImageVector? = null

val Icons.Bs.Phishing: ImageVector
    get() = _Phishing ?: UXIcon(name = "Phishing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 19f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-5.42f)
                curveToRelative(-0.43f, -0.99f, -1.17f, -1.83f, -2.17f, -2.38f)
                curveToRelative(-0.57f, -0.32f, -0.91f, -0.82f, -0.91f, -1.35f)
                verticalLineToRelative(-2.27f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.27f)
                curveToRelative(0f, 1.5f, 0.77f, 2.86f, 2.07f, 3.73f)
                horizontalLineToRelative(-2.57f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(14.77f, 20f)
                horizontalLineToRelative(-5.54f)
                lineToRelative(-0.92f, -1f)
                horizontalLineToRelative(-3.31f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(8.74f)
                curveToRelative(-0.27f, 0.47f, -0.72f, 0.82f, -1.25f, 0.94f)
                curveToRelative(-0.16f, 0.04f, -0.33f, 0.06f, -0.49f, 0.06f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.39f, 0f, 0.78f, -0.04f, 1.16f, -0.13f)
                curveToRelative(1.83f, -0.42f, 3.29f, -1.88f, 3.71f, -3.71f)
                curveToRelative(0.01f, -0.05f, 0.01f, -0.11f, 0.02f, -0.16f)
                horizontalLineToRelative(2.11f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3.31f)
                close()
            }
        }.also { _Phishing = it}
