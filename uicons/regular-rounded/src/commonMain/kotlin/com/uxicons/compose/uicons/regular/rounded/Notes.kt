package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notes: ImageVector? = null

val Icons.Rr.Notes: ImageVector
    get() = _Notes ?: UXIcon(name = "Notes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveTo(4.04f, 24f, 0f, 19.96f, 0f, 15f)
                verticalLineToRelative(-7f)
                curveTo(0f, 7.45f, 0.45f, 7f, 1f, 7f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(6.62f)
                curveToRelative(0f, 1.34f, -0.52f, 2.59f, -1.46f, 3.54f)
                lineToRelative(-3.68f, 3.68f)
                curveToRelative(-0.76f, 0.76f, -1.76f, 1.17f, -2.83f, 1.17f)
                horizontalLineToRelative(-7.03f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(4f, 5f)
                curveTo(4f, 2.24f, 6.24f, 0f, 9f, 0f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(9f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                close()
                moveTo(21.12f, 13.74f)
                curveToRelative(0.22f, -0.22f, 0.39f, -0.47f, 0.53f, -0.74f)
                horizontalLineToRelative(-3.65f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.74f)
                curveToRelative(0.16f, -0.09f, 0.31f, -0.19f, 0.44f, -0.33f)
                lineToRelative(3.68f, -3.68f)
                close()
            }
        }.also { _Notes = it}
