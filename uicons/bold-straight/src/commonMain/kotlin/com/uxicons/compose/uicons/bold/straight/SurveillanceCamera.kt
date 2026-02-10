package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SurveillanceCamera: ImageVector? = null

val Icons.Bs.SurveillanceCamera: ImageVector
    get() = _SurveillanceCamera ?: UXIcon(name = "SurveillanceCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.54f, 11f)
                horizontalLineToRelative(8.46f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                lineTo(23f, 3f)
                horizontalLineToRelative(-1.07f)
                lineToRelative(1.5f, -3f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(2f, 7.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3.84f)
                lineToRelative(-1.75f, 4.67f)
                curveToRelative(-0.07f, 0.19f, -0.26f, 0.33f, -0.47f, 0.33f)
                lineTo(3f, 16f)
                verticalLineToRelative(-3f)
                lineTo(0f, 13f)
                verticalLineToRelative(9f)
                lineTo(3f, 22f)
                verticalLineToRelative(-3f)
                lineTo(7.11f, 19f)
                curveToRelative(1.45f, 0f, 2.77f, -0.91f, 3.28f, -2.27f)
                lineToRelative(2.15f, -5.73f)
                close()
                moveTo(5f, 7.5f)
                lineTo(5f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.07f)
                lineToRelative(-0.57f, 1.15f)
                verticalLineToRelative(3.85f)
                lineTo(5.5f, 8f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                close()
                moveTo(17f, 15f)
                curveToRelative(-4.16f, 0f, -6.17f, 3.33f, -6.75f, 4.5f)
                curveToRelative(0.57f, 1.16f, 2.59f, 4.5f, 6.75f, 4.5f)
                reflectiveCurveToRelative(6.17f, -3.33f, 6.75f, -4.5f)
                curveToRelative(-0.58f, -1.17f, -2.59f, -4.5f, -6.75f, -4.5f)
                close()
                moveTo(17f, 21.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _SurveillanceCamera = it}
