package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImageSlash: ImageVector? = null

val Icons.Ts.ImageSlash: ImageVector
    get() = _ImageSlash ?: UXIcon(name = "ImageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(16.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23f, 22.29f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4f, 1f)
                curveToRelative(-0.61f, 0f, -1.2f, 0.22f, -1.65f, 0.63f)
                lineToRelative(0.11f, 0.12f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineToRelative(23.2f, 23.2f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-0.95f, -0.95f)
                close()
                moveTo(4f, 2f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(17.79f)
                lineTo(3.05f, 2.34f)
                curveToRelative(0.27f, -0.22f, 0.6f, -0.34f, 0.95f, -0.34f)
                close()
                moveTo(18.46f, 22f)
                lineToRelative(1f, 1f)
                lineTo(1f, 23f)
                lineTo(1f, 4.54f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(11.76f)
                lineToRelative(5.8f, -5.8f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-6.51f, 6.51f)
                verticalLineToRelative(3.29f)
                horizontalLineToRelative(16.46f)
                close()
            }
        }.also { _ImageSlash = it}
