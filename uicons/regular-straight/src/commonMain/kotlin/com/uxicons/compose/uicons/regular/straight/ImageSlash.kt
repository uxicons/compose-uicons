package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImageSlash: ImageVector? = null

val Icons.Rs.ImageSlash: ImageVector
    get() = _ImageSlash ?: UXIcon(name = "ImageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(1.25f, 1.25f)
                curveToRelative(0.4f, -0.19f, 0.84f, -0.29f, 1.29f, -0.29f)
                horizontalLineToRelative(16f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(17.59f)
                lineToRelative(0.96f, 0.96f)
                close()
                moveTo(4.41f, 3f)
                lineToRelative(16.59f, 16.59f)
                lineTo(21f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(4.41f, 3f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-2.59f)
                lineToRelative(5.59f, -5.59f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-4.17f, 4.17f)
                lineTo(3f, 7.24f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(17.76f)
                horizontalLineToRelative(17.76f)
                lineToRelative(-2f, -2f)
                lineTo(3f, 21f)
                close()
                moveTo(18f, 8f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _ImageSlash = it}
