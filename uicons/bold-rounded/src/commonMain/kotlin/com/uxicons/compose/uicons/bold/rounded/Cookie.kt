package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cookie: ImageVector? = null

val Icons.Br.Cookie: ImageVector
    get() = _Cookie ?: UXIcon(name = "Cookie", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(205.1f, 205.08f)
            moveToRelative(-42.67f, 0f)
            arcToRelative(42.67f, 42.67f, 0f, isMoreThanHalf = true, isPositiveArc = true, 85.33f, 0f)
            arcToRelative(42.67f, 42.67f, 0f, isMoreThanHalf = true, isPositiveArc = true, -85.33f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(426.67f, 43.14f)
            moveToRelative(-42.67f, 0f)
            arcToRelative(42.67f, 42.67f, 0f, isMoreThanHalf = true, isPositiveArc = true, 85.33f, 0f)
            arcToRelative(42.67f, 42.67f, 0f, isMoreThanHalf = true, isPositiveArc = true, -85.33f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(256f, 341.8f)
            moveToRelative(-42.67f, 0f)
            arcToRelative(42.67f, 42.67f, 0f, isMoreThanHalf = true, isPositiveArc = true, 85.33f, 0f)
            arcToRelative(42.67f, 42.67f, 0f, isMoreThanHalf = true, isPositiveArc = true, -85.33f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(510.76f, 231.53f)
            curveToRelative(-1.45f, -15.28f, -13.54f, -27.39f, -28.82f, -28.84f)
            curveToRelative(-91.43f, -8.85f, -163.78f, -81.22f, -172.61f, -172.65f)
            curveToRelative(-1.45f, -15.27f, -13.53f, -27.36f, -28.8f, -28.82f)
            curveTo(272.45f, 0.47f, 264.3f, 0f, 256f, 0f)
            curveTo(114.61f, 0f, 0f, 114.61f, 0f, 256f)
            reflectiveCurveToRelative(114.61f, 256f, 256f, 256f)
            reflectiveCurveToRelative(256f, -114.61f, 256f, -256f)
            lineToRelative(0f, 0f)
            curveTo(512f, 247.72f, 511.55f, 239.57f, 510.76f, 231.53f)
            close()
            moveTo(256f, 448f)
            curveToRelative(-106.04f, 1.71f, -193.38f, -82.87f, -195.09f, -188.91f)
            curveTo(59.2f, 153.05f, 143.77f, 65.71f, 249.81f, 64f)
            curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
            curveToRelative(20.88f, 99.54f, 98.65f, 177.3f, 198.19f, 198.16f)
            curveTo(444.57f, 365.74f, 359.64f, 447.95f, 256f, 448f)
            close()
        }
    }.also { _Cookie = it }
