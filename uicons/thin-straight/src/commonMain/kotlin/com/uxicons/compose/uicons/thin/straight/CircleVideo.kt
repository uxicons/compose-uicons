package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleVideo: ImageVector? = null

val Icons.Ts.CircleVideo: ImageVector
    get() = _CircleVideo ?: UXIcon(name = "CircleVideo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.95f, 0.05f)
                curveTo(5.33f, 0.05f, -0.05f, 5.43f, -0.05f, 12.05f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.57f, 0.05f, 11.95f, 0.05f)
                close()
                moveTo(11.95f, 23.05f)
                curveTo(5.88f, 23.05f, 0.95f, 18.12f, 0.95f, 12.05f)
                reflectiveCurveTo(5.88f, 1.05f, 11.95f, 1.05f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(14.95f, 9.55f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.62f)
                lineToRelative(4f, 2.1f)
                verticalLineToRelative(-7.95f)
                lineToRelative(-4f, 2.1f)
                verticalLineToRelative(-0.62f)
                close()
                moveTo(13.95f, 14.55f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5f)
                close()
                moveTo(17.95f, 9.73f)
                verticalLineToRelative(4.65f)
                lineToRelative(-3f, -1.57f)
                verticalLineToRelative(-1.5f)
                lineToRelative(3f, -1.57f)
                close()
            }
        }.also { _CircleVideo = it}
