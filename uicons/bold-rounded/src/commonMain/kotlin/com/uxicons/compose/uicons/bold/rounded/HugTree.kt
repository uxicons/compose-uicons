package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HugTree: ImageVector? = null

val Icons.Br.HugTree: ImageVector
    get() = _HugTree ?: UXIcon(name = "HugTree") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(4.5f, 12f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(13f, 1.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(-5.46f)
            lineToRelative(-9.55f, -5.82f)
            curveToRelative(-0.28f, -0.17f, -0.45f, -0.47f, -0.45f, -0.8f)
            curveToRelative(0f, -0.69f, 0.71f, -1.14f, 1.33f, -0.84f)
            lineToRelative(8.67f, 4.15f)
            verticalLineToRelative(-2.74f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(5f, 16f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
            close()
            moveTo(11.5f, 18f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(24f, 3.56f)
            curveToRelative(0f, -0.69f, -0.78f, -1.08f, -1.33f, -0.68f)
            lineToRelative(-0.8f, 0.59f)
            lineToRelative(-0.44f, -2.86f)
            curveToRelative(-0.05f, -0.35f, -0.35f, -0.61f, -0.71f, -0.61f)
            curveToRelative(-0.4f, 0f, -0.72f, 0.32f, -0.72f, 0.72f)
            verticalLineToRelative(4.12f)
            lineToRelative(-2f, 1.47f)
            verticalLineToRelative(-4.81f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-12.43f)
            lineToRelative(5.76f, -5.93f)
            curveToRelative(0.15f, -0.16f, 0.24f, -0.37f, 0.24f, -0.58f)
            close()
        }
    }.also { _HugTree = it }
