package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleVideo: ImageVector? = null

val Icons.Rs.CircleVideo: ImageVector
    get() = _CircleVideo ?: UXIcon(name = "CircleVideo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(15f, 8f)
                lineTo(6f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2.6f)
                lineToRelative(3f, 2.1f)
                verticalLineToRelative(-7f)
                lineToRelative(-3f, 2.1f)
                verticalLineToRelative(-2.6f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _CircleVideo = it}
