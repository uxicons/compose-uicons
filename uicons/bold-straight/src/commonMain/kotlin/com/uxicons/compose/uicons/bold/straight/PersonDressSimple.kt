package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDressSimple: ImageVector? = null

val Icons.Bs.PersonDressSimple: ImageVector
    get() = _PersonDressSimple ?: UXIcon(name = "PersonDressSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(16f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.2f)
                lineToRelative(1.49f, -11.93f)
                curveToRelative(0.22f, -1.75f, 1.71f, -3.07f, 3.47f, -3.07f)
                horizontalLineToRelative(1.47f)
                curveToRelative(1.76f, 0f, 3.25f, 1.32f, 3.47f, 3.07f)
                lineToRelative(1.49f, 11.93f)
                horizontalLineToRelative(-2.2f)
                close()
                moveTo(10.2f, 18f)
                horizontalLineToRelative(4.6f)
                lineToRelative(-1.07f, -8.56f)
                curveToRelative(-0.03f, -0.25f, -0.24f, -0.44f, -0.5f, -0.44f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.25f, 0f, -0.47f, 0.19f, -0.5f, 0.44f)
                lineToRelative(-1.07f, 8.56f)
                close()
            }
        }.also { _PersonDressSimple = it}
