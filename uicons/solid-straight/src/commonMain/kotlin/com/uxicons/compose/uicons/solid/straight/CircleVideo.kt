package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleVideo: ImageVector? = null

val Icons.Ss.CircleVideo: ImageVector
    get() = _CircleVideo ?: UXIcon(name = "CircleVideo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(18f, 8.5f)
                lineToRelative(-3f, 2.1f)
                verticalLineToRelative(-2.6f)
                lineTo(6f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2.6f)
                lineToRelative(3f, 2.1f)
                verticalLineToRelative(-7f)
                close()
            }
        }.also { _CircleVideo = it}
