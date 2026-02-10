package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stroopwafel: ImageVector? = null

val Icons.Bs.Stroopwafel: ImageVector
    get() = _Stroopwafel ?: UXIcon(name = "Stroopwafel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 3f, 12f, 3f)
                close()
                moveTo(17.58f, 7.8f)
                lineToRelative(-2.08f, 2.08f)
                lineToRelative(-1.38f, -1.38f)
                lineToRelative(2.08f, -2.08f)
                curveToRelative(-0.85f, -0.64f, -1.85f, -1.1f, -2.94f, -1.3f)
                lineToRelative(-1.26f, 1.26f)
                lineToRelative(-1.26f, -1.26f)
                curveToRelative(-1.09f, 0.2f, -2.09f, 0.65f, -2.94f, 1.3f)
                lineToRelative(2.08f, 2.08f)
                lineToRelative(-1.38f, 1.38f)
                lineToRelative(-2.08f, -2.08f)
                curveToRelative(-0.64f, 0.85f, -1.1f, 1.85f, -1.3f, 2.94f)
                lineToRelative(1.26f, 1.26f)
                lineToRelative(-1.26f, 1.26f)
                curveToRelative(0.2f, 1.09f, 0.65f, 2.09f, 1.3f, 2.94f)
                lineToRelative(2.08f, -2.08f)
                lineToRelative(1.38f, 1.38f)
                lineToRelative(-2.08f, 2.08f)
                curveToRelative(0.85f, 0.64f, 1.85f, 1.1f, 2.94f, 1.3f)
                lineToRelative(1.26f, -1.26f)
                lineToRelative(1.26f, 1.26f)
                curveToRelative(1.09f, -0.2f, 2.09f, -0.65f, 2.94f, -1.3f)
                lineToRelative(-2.08f, -2.08f)
                lineToRelative(1.38f, -1.38f)
                lineToRelative(2.08f, 2.08f)
                curveToRelative(0.64f, -0.85f, 1.1f, -1.85f, 1.3f, -2.94f)
                lineToRelative(-1.26f, -1.26f)
                lineToRelative(1.26f, -1.26f)
                curveToRelative(-0.2f, -1.09f, -0.65f, -2.09f, -1.3f, -2.94f)
                close()
                moveTo(12f, 13.38f)
                lineToRelative(-1.38f, -1.38f)
                lineToRelative(1.38f, -1.38f)
                lineToRelative(1.38f, 1.38f)
                lineToRelative(-1.38f, 1.38f)
                close()
            }
        }.also { _Stroopwafel = it}
