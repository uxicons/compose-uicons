package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHelmetSafety: ImageVector? = null

val Icons.Sr.UserHelmetSafety: ImageVector
    get() = _UserHelmetSafety ?: UXIcon(name = "UserHelmetSafety") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 6f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(6f, 7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.02f)
                curveTo(6.26f, 2.37f, 8.37f, 0.26f, 11f, 0.02f)
                verticalLineToRelative(2.98f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(13f, 0.02f)
                curveToRelative(2.63f, 0.24f, 4.74f, 2.34f, 4.98f, 4.98f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(6.0f, 9.15f)
                curveToRelative(0.08f, 3.24f, 2.74f, 5.85f, 6.0f, 5.85f)
                reflectiveCurveToRelative(5.92f, -2.61f, 6.0f, -5.85f)
                lineToRelative(0.0f, -0.15f)
                lineTo(6f, 9f)
                lineToRelative(0.0f, 0.15f)
                close()
                moveTo(20.99f, 22.88f)
                curveToRelative(-0.41f, -3.65f, -4.28f, -6.88f, -8.99f, -6.88f)
                reflectiveCurveToRelative(-8.58f, 3.23f, -8.99f, 6.88f)
                curveToRelative(-0.03f, 0.28f, 0.05f, 0.57f, 0.24f, 0.79f)
                curveToRelative(0.19f, 0.21f, 0.46f, 0.34f, 0.75f, 0.34f)
                horizontalLineToRelative(16f)
                curveToRelative(0.29f, 0f, 0.56f, -0.12f, 0.75f, -0.34f)
                curveToRelative(0.19f, -0.21f, 0.28f, -0.5f, 0.24f, -0.79f)
                close()
            }
        }.also { _UserHelmetSafety = it}
