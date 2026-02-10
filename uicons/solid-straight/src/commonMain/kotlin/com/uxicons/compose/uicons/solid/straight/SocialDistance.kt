package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SocialDistance: ImageVector? = null

val Icons.Ss.SocialDistance: ImageVector
    get() = _SocialDistance ?: UXIcon(name = "SocialDistance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 15f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                close()
                moveTo(23.55f, 3.94f)
                lineTo(20.21f, 0.6f)
                lineTo(18.79f, 2.02f)
                lineTo(20.78f, 4f)
                horizontalLineToRelative(-17.55f)
                lineToRelative(1.98f, -1.98f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.34f, 3.34f)
                curveToRelative(-0.29f, 0.29f, -0.45f, 0.68f, -0.45f, 1.09f)
                reflectiveCurveToRelative(0.16f, 0.8f, 0.45f, 1.1f)
                lineToRelative(3.34f, 3.34f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.06f, -2.06f)
                horizontalLineToRelative(17.7f)
                lineToRelative(-2.06f, 2.06f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.34f, -3.34f)
                curveToRelative(0.29f, -0.29f, 0.45f, -0.68f, 0.45f, -1.1f)
                reflectiveCurveToRelative(-0.16f, -0.8f, -0.45f, -1.09f)
                close()
                moveTo(8.5f, 19f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20.5f, 19f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20.5f, 18f)
                curveToRelative(0.44f, 0f, 0.85f, 0.08f, 1.24f, 0.23f)
                lineToRelative(-0.66f, -3.5f)
                curveToRelative(-0.24f, -1.56f, -1.56f, -2.73f, -3.09f, -2.73f)
                reflectiveCurveToRelative(-2.85f, 1.17f, -3.09f, 2.73f)
                lineToRelative(-0.7f, 3.52f)
                curveToRelative(0.4f, -0.16f, 0.84f, -0.25f, 1.3f, -0.25f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _SocialDistance = it}
