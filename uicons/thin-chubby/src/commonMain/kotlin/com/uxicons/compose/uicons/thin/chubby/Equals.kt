package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Equals: ImageVector? = null

val Icons.Tc.Equals: ImageVector
    get() = _Equals ?: UXIcon(name = "Equals") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.01f, 9.62f)
                curveToRelative(-0.06f, -0.27f, 0.1f, -0.54f, 0.37f, -0.6f)
                curveToRelative(0.17f, -0.04f, 4.33f, -1.01f, 10.62f, -1.01f)
                reflectiveCurveToRelative(10.44f, 0.97f, 10.62f, 1.01f)
                curveToRelative(0.27f, 0.06f, 0.43f, 0.33f, 0.37f, 0.6f)
                curveToRelative(-0.06f, 0.27f, -0.34f, 0.43f, -0.6f, 0.37f)
                curveToRelative(-0.04f, -0.01f, -4.23f, -0.99f, -10.38f, -0.99f)
                reflectiveCurveToRelative(-10.34f, 0.98f, -10.38f, 0.99f)
                curveToRelative(-0.27f, 0.06f, -0.54f, -0.1f, -0.6f, -0.37f)
                close()
                moveTo(22.62f, 15.01f)
                curveToRelative(-0.17f, -0.04f, -4.33f, -1.01f, -10.62f, -1.01f)
                reflectiveCurveToRelative(-10.44f, 0.97f, -10.62f, 1.01f)
                curveToRelative(-0.27f, 0.06f, -0.43f, 0.33f, -0.37f, 0.6f)
                curveToRelative(0.06f, 0.27f, 0.34f, 0.44f, 0.6f, 0.37f)
                curveToRelative(0.04f, -0.01f, 4.23f, -0.99f, 10.38f, -0.99f)
                reflectiveCurveToRelative(10.34f, 0.98f, 10.38f, 0.99f)
                curveToRelative(0.26f, 0.07f, 0.54f, -0.1f, 0.6f, -0.37f)
                curveToRelative(0.06f, -0.27f, -0.1f, -0.54f, -0.37f, -0.6f)
                close()
            }
        }.also { _Equals = it}
