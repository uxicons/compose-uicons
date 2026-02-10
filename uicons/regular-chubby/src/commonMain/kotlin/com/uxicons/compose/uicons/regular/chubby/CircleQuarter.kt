package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuarter: ImageVector? = null

val Icons.Rc.CircleQuarter: ImageVector
    get() = _CircleQuarter ?: UXIcon(name = "CircleQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -7.71f, 3.29f, -11f, 11f, -11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(3.02f, 11f)
                horizontalLineToRelative(7.98f)
                verticalLineToRelative(-7.98f)
                curveToRelative(-5.49f, 0.23f, -7.75f, 2.49f, -7.98f, 7.98f)
                close()
            }
        }.also { _CircleQuarter = it}
