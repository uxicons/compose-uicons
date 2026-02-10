package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointRibbon: ImageVector? = null

val Icons.Ts.HandBackPointRibbon: ImageVector
    get() = _HandBackPointRibbon ?: UXIcon(name = "HandBackPointRibbon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9.09f)
                lineTo(12f, 2.61f)
                curveTo(12f, 1.33f, 11.1f, 0.23f, 9.92f, 0.03f)
                curveToRelative(-0.73f, -0.12f, -1.48f, 0.09f, -2.04f, 0.56f)
                curveToRelative(-0.56f, 0.48f, -0.88f, 1.17f, -0.88f, 1.91f)
                verticalLineToRelative(1.5f)
                lineTo(2.29f, 4.0f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
                lineTo(7f, 8.0f)
                verticalLineToRelative(3.29f)
                lineTo(2.73f, 15.49f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                reflectiveCurveToRelative(0.26f, 1.3f, 0.73f, 1.77f)
                lineToRelative(4.97f, 4.97f)
                horizontalLineToRelative(14.29f)
                lineTo(22f, 11.09f)
                lineToRelative(-10f, -2f)
                close()
                moveTo(8f, 2.5f)
                curveToRelative(0f, -0.44f, 0.19f, -0.86f, 0.53f, -1.14f)
                curveToRelative(0.34f, -0.29f, 0.78f, -0.41f, 1.23f, -0.34f)
                curveToRelative(0.71f, 0.12f, 1.25f, 0.8f, 1.25f, 1.59f)
                verticalLineToRelative(1.39f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(4.71f, 5f)
                horizontalLineToRelative(6.29f)
                verticalLineToRelative(2f)
                lineTo(4.71f, 7f)
                lineToRelative(1f, -1f)
                lineToRelative(-1f, -1f)
                close()
                moveTo(21f, 23f)
                lineTo(8.12f, 23f)
                lineToRelative(-4.68f, -4.68f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
                reflectiveCurveToRelative(0.16f, -0.78f, 0.44f, -1.06f)
                lineToRelative(3.56f, -3.51f)
                verticalLineToRelative(4.31f)
                horizontalLineToRelative(1f)
                lineTo(8f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.91f)
                lineToRelative(10f, 2f)
                verticalLineToRelative(11.09f)
                close()
            }
        }.also { _HandBackPointRibbon = it}
