package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SocialDistance: ImageVector? = null

val Icons.Bs.SocialDistance: ImageVector
    get() = _SocialDistance ?: UXIcon(name = "SocialDistance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.3f, 5.1f)
                curveToRelative(-0.4f, -0.35f, -0.4f, -0.97f, 0f, -1.33f)
                lineToRelative(3.7f, -3.39f)
                verticalLineToRelative(2.62f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2.62f)
                lineToRelative(3.7f, 3.39f)
                curveToRelative(0.4f, 0.35f, 0.4f, 0.97f, 0f, 1.33f)
                lineToRelative(-3.7f, 3.39f)
                verticalLineToRelative(-2.49f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(2.49f)
                close()
                moveTo(2f, 13.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(18.5f, 10f)
                curveToRelative(-1.87f, 0f, -3.49f, 1.44f, -3.78f, 3.34f)
                lineToRelative(-0.75f, 4.16f)
                curveToRelative(0.67f, -0.31f, 1.41f, -0.48f, 2.19f, -0.48f)
                horizontalLineToRelative(4.68f)
                curveToRelative(0.78f, 0f, 1.52f, 0.18f, 2.19f, 0.48f)
                lineToRelative(-0.75f, -4.16f)
                curveToRelative(-0.29f, -1.91f, -1.91f, -3.34f, -3.78f, -3.34f)
                close()
                moveTo(8f, 19f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _SocialDistance = it}
