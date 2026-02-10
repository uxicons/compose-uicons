package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBookmark: ImageVector? = null

val Icons.Br.CircleBookmark: ImageVector
    get() = _CircleBookmark ?: UXIcon(name = "CircleBookmark") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(16f, 9.03f)
            verticalLineToRelative(7.25f)
            curveToRelative(0f, 0.65f, -0.78f, 0.97f, -1.24f, 0.51f)
            lineToRelative(-2.76f, -2.76f)
            lineToRelative(-2.76f, 2.76f)
            curveToRelative(-0.46f, 0.46f, -1.24f, 0.13f, -1.24f, -0.51f)
            verticalLineToRelative(-7.25f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
        }
    }.also { _CircleBookmark = it }
