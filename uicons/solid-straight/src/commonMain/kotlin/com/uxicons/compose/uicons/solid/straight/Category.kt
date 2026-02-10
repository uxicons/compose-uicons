package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Category: ImageVector? = null

val Icons.Ss.Category: ImageVector
    get() = _Category ?: UXIcon(name = "Category") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(10f)
                lineTo(10f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                close()
                moveTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                lineTo(22f, 3f)
                close()
                moveTo(0f, 19f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-10f)
                lineTo(0f, 12f)
                verticalLineToRelative(7f)
                close()
                moveTo(23.98f, 22.56f)
                lineToRelative(-2.81f, -2.81f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(2.81f, 2.81f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _Category = it}
