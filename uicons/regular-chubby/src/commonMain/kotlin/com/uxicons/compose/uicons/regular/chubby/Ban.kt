package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ban: ImageVector? = null

val Icons.Rc.Ban: ImageVector
    get() = _Ban ?: UXIcon(name = "Ban") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(12f, 3f)
                curveToRelative(2.5f, 0f, 4.62f, 0.33f, 6.17f, 1.42f)
                lineTo(4.44f, 18.15f)
                curveToRelative(-0.93f, -1.36f, -1.44f, -3.33f, -1.44f, -6.15f)
                curveTo(3f, 4.53f, 6.6f, 3f, 12f, 3f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-2.5f, 0f, -4.62f, -0.33f, -6.17f, -1.42f)
                lineTo(19.56f, 5.85f)
                curveToRelative(0.93f, 1.36f, 1.44f, 3.33f, 1.44f, 6.15f)
                curveToRelative(0f, 7.47f, -3.6f, 9f, -9f, 9f)
                close()
            }
        }.also { _Ban = it}
