package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImageSlash: ImageVector? = null

val Icons.Tr.ImageSlash: ImageVector
    get() = _ImageSlash ?: UXIcon(name = "ImageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(16.5f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.5f, 22f)
                lineTo(5.5f, 22f)
                curveToRelative(-1.86f, 0f, -3.39f, -1.46f, -3.49f, -3.3f)
                lineToRelative(6.35f, -6.35f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-5.65f, 5.65f)
                lineTo(2.0f, 5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(23.85f, 23.15f)
                lineToRelative(-1.84f, -1.84f)
                curveToRelative(0.64f, -0.8f, 0.98f, -1.78f, 0.98f, -2.81f)
                lineTo(23f, 5.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineTo(5.5f, 1f)
                curveToRelative(-1.02f, 0f, -2.01f, 0.35f, -2.81f, 0.98f)
                lineTo(0.85f, 0.15f)
                curveTo(0.66f, -0.05f, 0.34f, -0.05f, 0.15f, 0.15f)
                reflectiveCurveTo(-0.05f, 0.66f, 0.15f, 0.85f)
                lineToRelative(23f, 23f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(22f, 18.5f)
                curveToRelative(0f, 0.76f, -0.25f, 1.49f, -0.7f, 2.1f)
                lineTo(3.4f, 2.7f)
                curveToRelative(0.6f, -0.45f, 1.34f, -0.7f, 2.1f, -0.7f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _ImageSlash = it}
