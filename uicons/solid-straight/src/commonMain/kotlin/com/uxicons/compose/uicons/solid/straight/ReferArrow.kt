package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferArrow: ImageVector? = null

val Icons.Ss.ReferArrow: ImageVector
    get() = _ReferArrow ?: UXIcon(name = "ReferArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.41f, 17.41f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.75f, -2.75f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(3.5f)
                lineToRelative(-2.75f, -2.75f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                close()
                moveTo(2f, 6f)
                curveTo(2f, 2.69f, 4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(11f, 19.5f)
                curveToRelative(0f, -2.04f, 0.94f, -3.86f, 2.42f, -5.05f)
                curveToRelative(-0.58f, -0.28f, -1.23f, -0.45f, -1.92f, -0.45f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }.also { _ReferArrow = it}
