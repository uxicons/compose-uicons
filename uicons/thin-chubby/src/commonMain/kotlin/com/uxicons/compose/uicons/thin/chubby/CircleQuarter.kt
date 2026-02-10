package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuarter: ImageVector? = null

val Icons.Tc.CircleQuarter: ImageVector
    get() = _CircleQuarter ?: UXIcon(name = "CircleQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 13f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -8.17f, 3.33f, -11.5f, 11.5f, -11.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(2.0f, 12f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(-7.02f, 0.13f, -9.87f, 2.97f, -10.0f, 10.0f)
                close()
            }
        }.also { _CircleQuarter = it}
