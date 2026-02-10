package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhotoVideo: ImageVector? = null

val Icons.Bs.PhotoVideo: ImageVector
    get() = _PhotoVideo ?: UXIcon(name = "PhotoVideo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                lineTo(3f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                lineTo(3f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                lineTo(0f, 6f)
                lineTo(0f, 24f)
                lineTo(20f, 24f)
                verticalLineToRelative(-8f)
                lineTo(12f, 16f)
                verticalLineToRelative(5f)
                close()
                moveTo(3f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                lineTo(3f, 21f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20.5f, 0f)
                lineTo(11.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(8f, 14f)
                lineTo(24f, 14f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(11.5f, 3f)
                horizontalLineToRelative(9f)
                curveToRelative(0.27f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2f, -2f)
                lineToRelative(-6f, 4.88f)
                lineTo(11f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(12f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _PhotoVideo = it}
