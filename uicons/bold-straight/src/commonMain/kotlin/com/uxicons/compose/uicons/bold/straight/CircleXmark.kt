package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleXmark: ImageVector? = null

val Icons.Bs.CircleXmark: ImageVector
    get() = _CircleXmark ?: UXIcon(name = "CircleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.56f, 9.56f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
            }
        }.also { _CircleXmark = it}
