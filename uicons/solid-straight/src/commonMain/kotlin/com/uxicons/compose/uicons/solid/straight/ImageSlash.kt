package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImageSlash: ImageVector? = null

val Icons.Ss.ImageSlash: ImageVector
    get() = _ImageSlash ?: UXIcon(name = "ImageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 20.59f)
                lineTo(22f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(4f, 2f)
                curveToRelative(-0.18f, 0f, -0.36f, 0.02f, -0.54f, 0.05f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.96f, -1.96f)
                close()
                moveTo(16f, 10f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(2f, 6.24f)
                lineToRelative(5.17f, 5.17f)
                lineToRelative(-5.17f, 5.17f)
                lineTo(2f, 6.24f)
                close()
                moveTo(17.76f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-2.59f)
                lineToRelative(6.59f, -6.59f)
                lineToRelative(9.17f, 9.17f)
                close()
            }
        }.also { _ImageSlash = it}
