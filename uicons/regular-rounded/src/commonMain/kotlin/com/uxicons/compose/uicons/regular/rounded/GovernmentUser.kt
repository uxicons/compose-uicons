package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GovernmentUser: ImageVector? = null

val Icons.Rr.GovernmentUser: ImageVector
    get() = _GovernmentUser ?: UXIcon(name = "GovernmentUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(12.76f, 0f, 10f, 0f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveTo(10f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(2f, 14.59f, 2f, 19f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(8.25f, 19f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(0f, -2.57f, 1.63f, -4.77f, 3.91f, -5.62f)
                lineToRelative(1.27f, 1.9f)
                lineToRelative(-0.93f, 3.71f)
                close()
                moveTo(11.75f, 19f)
                lineToRelative(-0.93f, -3.71f)
                lineToRelative(1.27f, -1.9f)
                curveToRelative(2.28f, 0.85f, 3.91f, 3.04f, 3.91f, 5.62f)
                horizontalLineToRelative(-4.25f)
                close()
                moveTo(24f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                verticalLineToRelative(5.35f)
                curveToRelative(0f, 0.62f, -0.79f, 0.89f, -1.17f, 0.4f)
                lineToRelative(-1.33f, -1.74f)
                lineToRelative(-1.33f, 1.74f)
                curveToRelative(-0.38f, 0.49f, -1.17f, 0.23f, -1.17f, -0.4f)
                lineTo(18f, 2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _GovernmentUser = it}
