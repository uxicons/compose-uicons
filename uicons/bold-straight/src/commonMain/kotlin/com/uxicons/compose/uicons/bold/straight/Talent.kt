package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Talent: ImageVector? = null

val Icons.Bs.Talent: ImageVector
    get() = _Talent ?: UXIcon(name = "Talent") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 11f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(22.52f, 13.6f)
                lineToRelative(-2.04f, -2.2f)
                lineToRelative(-6.07f, 5.6f)
                horizontalLineToRelative(-4.83f)
                lineToRelative(-6.07f, -5.6f)
                lineToRelative(-2.04f, 2.2f)
                lineToRelative(6.52f, 6.02f)
                verticalLineToRelative(4.38f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.38f)
                lineToRelative(6.52f, -6.02f)
                close()
                moveTo(8.68f, 9.71f)
                lineToRelative(0.6f, 0.45f)
                lineToRelative(2.73f, -2.11f)
                lineToRelative(2.72f, 2.1f)
                lineToRelative(0.62f, -0.44f)
                lineToRelative(-1.1f, -3.36f)
                lineToRelative(2.75f, -1.59f)
                verticalLineToRelative(-0.76f)
                horizontalLineToRelative(-3.6f)
                lineToRelative(-0.98f, -3.75f)
                horizontalLineToRelative(-0.81f)
                lineToRelative(-0.98f, 3.75f)
                horizontalLineToRelative(-3.62f)
                verticalLineToRelative(0.77f)
                lineToRelative(2.77f, 1.54f)
                lineToRelative(-1.09f, 3.4f)
                close()
            }
        }.also { _Talent = it}
