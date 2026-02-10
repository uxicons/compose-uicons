package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watch: ImageVector? = null

val Icons.Rr.Watch: ImageVector
    get() = _Watch ?: UXIcon(name = "Watch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 12f)
                curveToRelative(0f, -3.27f, -1.57f, -6.17f, -4f, -8.0f)
                lineTo(18f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.84f)
                curveToRelative(-1.23f, -0.54f, -2.58f, -0.84f, -4f, -0.84f)
                reflectiveCurveToRelative(-2.77f, 0.3f, -4f, 0.84f)
                verticalLineToRelative(-1.84f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.0f)
                curveToRelative(-2.43f, 1.83f, -4f, 4.73f, -4f, 8.0f)
                reflectiveCurveToRelative(1.57f, 6.17f, 4f, 8.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.84f)
                curveToRelative(1.23f, 0.54f, 2.58f, 0.84f, 4f, 0.84f)
                reflectiveCurveToRelative(2.77f, -0.3f, 4f, -0.84f)
                verticalLineToRelative(1.84f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.0f)
                curveToRelative(2.43f, -1.83f, 4f, -4.73f, 4f, -8.0f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                close()
                moveTo(14.71f, 13.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-2f, -2f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.59f)
                lineToRelative(1.71f, 1.71f)
                close()
            }
        }.also { _Watch = it}
