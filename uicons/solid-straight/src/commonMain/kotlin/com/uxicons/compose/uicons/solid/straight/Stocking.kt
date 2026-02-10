package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stocking: ImageVector? = null

val Icons.Ss.Stocking: ImageVector
    get() = _Stocking ?: UXIcon(name = "Stocking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                horizontalLineTo(7f)
                reflectiveCurveToRelative(0f, 2.0f, 0f, 2.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7.29f)
                lineToRelative(-4.25f, 1.49f)
                curveTo(1.19f, 11.89f, -0.8f, 15.69f, 0.31f, 19.25f)
                curveToRelative(0.89f, 2.84f, 3.48f, 4.75f, 6.45f, 4.75f)
                curveToRelative(0.69f, 0f, 1.36f, -0.1f, 2.04f, -0.32f)
                lineToRelative(8.44f, -2.86f)
                curveToRelative(2.85f, -0.96f, 4.76f, -3.63f, 4.76f, -6.63f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2f)
                reflectiveCurveTo(24f, 0f, 24f, 0f)
                close()
            }
        }.also { _Stocking = it}
