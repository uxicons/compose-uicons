package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineBottle: ImageVector? = null

val Icons.Sr.WineBottle: ImageVector
    get() = _WineBottle ?: UXIcon(name = "WineBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.01f, 2.0f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveTo(9.46f, 0.0f, 10.01f, 0.0f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(18.34f, 9.69f)
                lineToRelative(-3.33f, -2.22f)
                verticalLineToRelative(-2.46f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.46f)
                lineToRelative(-3.33f, 2.22f)
                curveToRelative(-1.2f, 0.8f, -2.05f, 1.98f, -2.44f, 3.32f)
                horizontalLineToRelative(12.76f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(3.01f, 15.0f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4.32f)
                curveToRelative(0f, -2.01f, -1.0f, -3.88f, -2.67f, -4.99f)
                close()
            }
        }.also { _WineBottle = it}
