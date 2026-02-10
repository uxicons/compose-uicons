package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBookmark: ImageVector? = null

val Icons.Sr.CircleBookmark: ImageVector
    get() = _CircleBookmark ?: UXIcon(name = "CircleBookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 9f)
                verticalLineToRelative(6.61f)
                lineToRelative(-3f, -3f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(-6.61f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(17f, 9f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7.27f)
                curveToRelative(0f, 0.7f, 0.42f, 1.33f, 1.07f, 1.59f)
                curveToRelative(0.65f, 0.27f, 1.39f, 0.12f, 1.88f, -0.37f)
                lineToRelative(2.05f, -2.05f)
                lineToRelative(2.05f, 2.05f)
                curveToRelative(0.33f, 0.33f, 0.77f, 0.51f, 1.22f, 0.51f)
                curveToRelative(0.22f, 0f, 0.45f, -0.04f, 0.66f, -0.13f)
                curveToRelative(0.65f, -0.27f, 1.07f, -0.89f, 1.07f, -1.59f)
                verticalLineToRelative(-7.27f)
                close()
            }
        }.also { _CircleBookmark = it}
