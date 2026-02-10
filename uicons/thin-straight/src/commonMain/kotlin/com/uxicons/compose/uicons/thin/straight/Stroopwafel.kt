package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stroopwafel: ImageVector? = null

val Icons.Ts.Stroopwafel: ImageVector
    get() = _Stroopwafel ?: UXIcon(name = "Stroopwafel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.01f, 0f)
                curveTo(5.39f, 0f, 0.01f, 5.38f, 0.01f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12.01f, 0f)
                close()
                moveTo(12.01f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.94f, 1f, 12.01f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(19.87f, 8.86f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(-3.15f, 3.14f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.15f, -3.14f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(3.15f, 3.14f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.15f, -3.14f)
                lineToRelative(3.15f, -3.15f)
                close()
                moveTo(12.02f, 15.3f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(-3.29f, 3.29f)
                close()
            }
        }.also { _Stroopwafel = it}
