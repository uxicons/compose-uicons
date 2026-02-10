package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhotoVideo: ImageVector? = null

val Icons.Ss.PhotoVideo: ImageVector
    get() = _PhotoVideo ?: UXIcon(name = "PhotoVideo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(11f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(8f, 14f)
                lineTo(24f, 14f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(11.5f, 2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(22f, 5.12f)
                lineToRelative(-4f, 4f)
                lineToRelative(-2.05f, -2.05f)
                lineToRelative(-5.95f, 5.1f)
                verticalLineToRelative(-2.63f)
                lineToRelative(6.05f, -5.19f)
                lineToRelative(1.95f, 1.95f)
                lineToRelative(4f, -4f)
                verticalLineToRelative(2.83f)
                close()
                moveTo(6f, 16f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(2f, 12f)
                verticalLineToRelative(-2f)
                lineTo(0f, 10f)
                verticalLineToRelative(14f)
                lineTo(2f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                lineTo(14f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                lineTo(6f, 16f)
                close()
                moveTo(4f, 20f)
                lineTo(2f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(2f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                lineTo(2f, 16f)
                close()
                moveTo(14f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _PhotoVideo = it}
