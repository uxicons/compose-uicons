package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCircleCheck: ImageVector? = null

val Icons.Rr.PlugCircleCheck: ImageVector
    get() = _PlugCircleCheck ?: UXIcon(name = "PlugCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(20.22f, 15.79f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
                lineToRelative(-2.21f, 2.12f)
                curveToRelative(-0.45f, 0.45f, -1.05f, 0.67f, -1.65f, 0.67f)
                reflectiveCurveToRelative(-1.2f, -0.22f, -1.66f, -0.67f)
                lineToRelative(-1.13f, -1.11f)
                curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.41f, -0.01f)
                lineToRelative(1.13f, 1.11f)
                curveToRelative(0.14f, 0.14f, 0.38f, 0.14f, 0.52f, 0f)
                lineToRelative(2.22f, -2.13f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                close()
                moveTo(9f, 18.92f)
                verticalLineToRelative(4.08f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4.08f)
                curveToRelative(-3.42f, -0.48f, -6f, -3.46f, -6f, -6.92f)
                verticalLineToRelative(-4f)
                curveTo(0.45f, 8f, 0f, 7.55f, 0f, 7f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                lineTo(4f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(6f, 6f)
                horizontalLineToRelative(5f)
                lineTo(11f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(13f, 6f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(3f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.48f, 1.84f, 4.6f, 4.29f, 4.95f)
                curveToRelative(0.97f, 0.14f, 1.71f, 0.99f, 1.71f, 1.97f)
                close()
            }
        }.also { _PlugCircleCheck = it}
