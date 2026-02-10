package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mercury: ImageVector? = null

val Icons.Ss.Mercury: ImageVector
    get() = _Mercury ?: UXIcon(name = "Mercury") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 10f)
                curveToRelative(0f, -3.01f, -1.67f, -5.63f, -4.13f, -7.0f)
                curveToRelative(1.27f, -0.7f, 2.33f, -1.75f, 3.05f, -3.0f)
                horizontalLineToRelative(-2.64f)
                curveToRelative(-1.03f, 1.22f, -2.56f, 2f, -4.28f, 2f)
                reflectiveCurveToRelative(-3.25f, -0.78f, -4.28f, -2f)
                horizontalLineToRelative(-2.64f)
                curveToRelative(0.73f, 1.25f, 1.78f, 2.29f, 3.05f, 3.0f)
                curveToRelative(-2.46f, 1.37f, -4.13f, 3.99f, -4.13f, 7.0f)
                curveToRelative(0f, 4.07f, 3.06f, 7.44f, 7f, 7.94f)
                verticalLineToRelative(2.06f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.06f)
                curveToRelative(3.94f, -0.49f, 7f, -3.87f, 7f, -7.94f)
                close()
                moveTo(6f, 10f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
            }
        }.also { _Mercury = it}
