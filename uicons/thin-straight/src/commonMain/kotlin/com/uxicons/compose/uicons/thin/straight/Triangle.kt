package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Triangle: ImageVector? = null

val Icons.Ts.Triangle: ImageVector
    get() = _Triangle ?: UXIcon(name = "Triangle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 22f)
                lineTo(0.15f, 22f)
                lineTo(10.1f, 3.14f)
                curveToRelative(0.39f, -0.71f, 1.1f, -1.14f, 1.9f, -1.14f)
                reflectiveCurveToRelative(1.5f, 0.43f, 1.9f, 1.14f)
                lineToRelative(9.95f, 18.86f)
                close()
                moveTo(1.85f, 21f)
                horizontalLineToRelative(20.3f)
                lineTo(13.02f, 3.62f)
                curveToRelative(-0.43f, -0.78f, -1.62f, -0.78f, -2.05f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(1.85f, 21f, 1.85f, 21f)
                close()
            }
        }.also { _Triangle = it}
