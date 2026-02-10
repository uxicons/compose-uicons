package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImageSlash: ImageVector? = null

val Icons.Bs.ImageSlash: ImageVector
    get() = _ImageSlash ?: UXIcon(name = "ImageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 8f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(23.96f, 21.84f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(1.17f, 1.17f)
                curveToRelative(0.37f, -0.13f, 0.77f, -0.2f, 1.18f, -0.2f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(16.38f)
                lineToRelative(0.96f, 0.96f)
                close()
                moveTo(6.12f, 4f)
                lineToRelative(13.88f, 13.88f)
                lineTo(20f, 4.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(6.12f, 4f)
                close()
                moveTo(4f, 16f)
                verticalLineToRelative(-7.05f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(17.05f)
                horizontalLineToRelative(17.05f)
                lineTo(7.53f, 12.47f)
                lineToRelative(-3.52f, 3.52f)
                close()
            }
        }.also { _ImageSlash = it}
