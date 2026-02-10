package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Instagram: ImageVector? = null

val Icons.Brand.Instagram: ImageVector
    get() = _Instagram ?: UXIcon(name = "Instagram") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2.16f)
            curveToRelative(3.2f, 0f, 3.58f, 0.01f, 4.85f, 0.07f)
            curveToRelative(1.31f, 0.06f, 2.65f, 0.36f, 3.61f, 1.31f)
            curveToRelative(0.96f, 0.96f, 1.25f, 2.3f, 1.31f, 3.61f)
            curveToRelative(0.06f, 1.26f, 0.07f, 1.65f, 0.07f, 4.85f)
            curveToRelative(0f, 3.2f, -0.01f, 3.58f, -0.07f, 4.85f)
            curveToRelative(-0.06f, 1.3f, -0.36f, 2.66f, -1.31f, 3.61f)
            curveToRelative(-0.96f, 0.96f, -2.29f, 1.25f, -3.61f, 1.31f)
            curveToRelative(-1.26f, 0.06f, -1.65f, 0.07f, -4.85f, 0.07f)
            reflectiveCurveToRelative(-3.58f, -0.01f, -4.85f, -0.07f)
            curveToRelative(-1.29f, -0.06f, -2.67f, -0.37f, -3.61f, -1.31f)
            curveToRelative(-0.96f, -0.96f, -1.25f, -2.3f, -1.31f, -3.61f)
            curveToRelative(-0.06f, -1.26f, -0.07f, -1.65f, -0.07f, -4.85f)
            curveToRelative(0f, -3.2f, 0.01f, -3.58f, 0.07f, -4.85f)
            curveToRelative(0.06f, -1.3f, 0.37f, -2.66f, 1.31f, -3.61f)
            curveToRelative(0.96f, -0.96f, 2.3f, -1.25f, 3.61f, -1.31f)
            curveTo(8.42f, 2.17f, 8.8f, 2.16f, 12f, 2.16f)
            moveTo(12f, 0f)
            curveTo(8.74f, 0f, 8.33f, 0.01f, 7.05f, 0.07f)
            curveTo(5.2f, 0.16f, 3.35f, 0.67f, 2.01f, 2.01f)
            curveTo(0.67f, 3.36f, 0.16f, 5.2f, 0.07f, 7.05f)
            curveTo(0.01f, 8.33f, 0f, 8.74f, 0f, 12f)
            curveToRelative(0f, 3.26f, 0.01f, 3.67f, 0.07f, 4.95f)
            curveToRelative(0.09f, 1.85f, 0.6f, 3.7f, 1.94f, 5.04f)
            curveToRelative(1.34f, 1.34f, 3.19f, 1.86f, 5.04f, 1.94f)
            curveTo(8.33f, 23.99f, 8.74f, 24f, 12f, 24f)
            curveToRelative(3.26f, 0f, 3.67f, -0.01f, 4.95f, -0.07f)
            curveToRelative(1.85f, -0.09f, 3.7f, -0.6f, 5.04f, -1.94f)
            curveToRelative(1.35f, -1.35f, 1.86f, -3.18f, 1.94f, -5.04f)
            curveTo(23.99f, 15.67f, 24f, 15.26f, 24f, 12f)
            curveToRelative(0f, -3.26f, -0.01f, -3.67f, -0.07f, -4.95f)
            curveToRelative(-0.09f, -1.85f, -0.6f, -3.7f, -1.94f, -5.04f)
            curveToRelative(-1.34f, -1.34f, -3.19f, -1.86f, -5.04f, -1.94f)
            curveTo(15.67f, 0.01f, 15.26f, 0f, 12f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 5.84f)
            curveToRelative(-3.4f, 0f, -6.16f, 2.76f, -6.16f, 6.16f)
            curveToRelative(0f, 3.4f, 2.76f, 6.16f, 6.16f, 6.16f)
            reflectiveCurveToRelative(6.16f, -2.76f, 6.16f, -6.16f)
            curveTo(18.16f, 8.6f, 15.4f, 5.84f, 12f, 5.84f)
            close()
            moveTo(12f, 16f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveTo(14.21f, 16f, 12f, 16f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.41f, 5.59f)
            moveToRelative(-1.44f, 0f)
            arcToRelative(1.44f, 1.44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.88f, 0f)
            arcToRelative(1.44f, 1.44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.88f, 0f)
        }
    }.also { _Instagram = it }
