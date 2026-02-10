package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watch: ImageVector? = null

val Icons.Rc.Watch: ImageVector
    get() = _Watch ?: UXIcon(name = "Watch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 12f)
                curveToRelative(0f, -3.72f, -0.94f, -6.17f, -3f, -7.56f)
                verticalLineToRelative(-2.44f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.5f)
                curveToRelative(-1.13f, -0.34f, -2.45f, -0.5f, -4f, -0.5f)
                reflectiveCurveToRelative(-2.87f, 0.16f, -4f, 0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.44f)
                curveToRelative(-2.06f, 1.4f, -3f, 3.85f, -3f, 7.56f)
                reflectiveCurveToRelative(0.94f, 6.17f, 3f, 7.56f)
                verticalLineToRelative(2.44f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(1.13f, 0.34f, 2.45f, 0.5f, 4f, 0.5f)
                reflectiveCurveToRelative(2.87f, -0.16f, 4f, -0.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.44f)
                curveToRelative(2.06f, -1.4f, 3f, -3.85f, 3f, -7.56f)
                close()
                moveTo(5f, 12f)
                curveToRelative(0f, -5.17f, 1.83f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 1.83f, 7f, 7f)
                reflectiveCurveToRelative(-1.83f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -1.83f, -7f, -7f)
                close()
                moveTo(14.71f, 13.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2f, -2f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.59f)
                close()
            }
        }.also { _Watch = it}
