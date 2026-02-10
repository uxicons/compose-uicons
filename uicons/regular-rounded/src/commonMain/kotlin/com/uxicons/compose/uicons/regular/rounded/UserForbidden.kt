package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserForbidden: ImageVector? = null

val Icons.Rr.UserForbidden: ImageVector
    get() = _UserForbidden ?: UXIcon(name = "UserForbidden") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-1.42f, 0f, -2.77f, -0.3f, -4f, -0.84f)
                verticalLineToRelative(-0.16f)
                curveToRelative(0f, -1.92f, 1.38f, -3.65f, 3.2f, -4.02f)
                curveToRelative(0.54f, -0.11f, 0.89f, -0.64f, 0.78f, -1.18f)
                curveToRelative(-0.11f, -0.54f, -0.63f, -0.89f, -1.18f, -0.78f)
                curveToRelative(-2.47f, 0.5f, -4.33f, 2.54f, -4.72f, 5.02f)
                curveToRelative(-2.47f, -1.82f, -4.08f, -4.74f, -4.08f, -8.04f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                close()
                moveTo(10.04f, 8.62f)
                curveToRelative(0.18f, -0.92f, 0.99f, -1.62f, 1.96f, -1.62f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.98f, -0.7f, 1.79f, -1.62f, 1.96f)
                lineToRelative(-2.34f, -2.34f)
                close()
                moveTo(19.74f, 18.32f)
                lineToRelative(-5.82f, -5.82f)
                curveToRelative(1.26f, -0.69f, 2.08f, -2.03f, 2.08f, -3.51f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.47f, 0f, -2.81f, 0.81f, -3.51f, 2.08f)
                lineToRelative(-2.82f, -2.82f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                close()
            }
        }.also { _UserForbidden = it}
