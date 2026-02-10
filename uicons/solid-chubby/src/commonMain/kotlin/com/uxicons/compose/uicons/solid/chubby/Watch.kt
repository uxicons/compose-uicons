package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watch: ImageVector? = null

val Icons.Sc.Watch: ImageVector
    get() = _Watch ?: UXIcon(name = "Watch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 4f)
                curveToRelative(-5.61f, 0f, -8f, 2.39f, -8f, 8f)
                reflectiveCurveToRelative(2.39f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -2.39f, 8f, -8f)
                reflectiveCurveToRelative(-2.39f, -8f, -8f, -8f)
                close()
                moveTo(14.71f, 14.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2f, -2f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.59f)
                lineToRelative(1.71f, 1.71f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(6f, 3.33f)
                verticalLineToRelative(-1.33f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.33f)
                curveToRelative(-1.54f, -0.88f, -3.54f, -1.33f, -6f, -1.33f)
                reflectiveCurveToRelative(-4.46f, 0.44f, -6f, 1.33f)
                close()
                moveTo(18f, 20.67f)
                verticalLineToRelative(1.33f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.33f)
                curveToRelative(1.54f, 0.88f, 3.54f, 1.33f, 6f, 1.33f)
                reflectiveCurveToRelative(4.46f, -0.44f, 6f, -1.33f)
                close()
            }
        }.also { _Watch = it}
