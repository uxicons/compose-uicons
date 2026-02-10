package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointRibbon: ImageVector? = null

val Icons.Rs.HandBackPointRibbon: ImageVector
    get() = _HandBackPointRibbon ?: UXIcon(name = "HandBackPointRibbon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.18f)
                lineTo(12f, 3.11f)
                curveTo(12f, 1.59f, 10.92f, 0.27f, 9.5f, 0.04f)
                curveToRelative(-0.88f, -0.14f, -1.77f, 0.1f, -2.44f, 0.67f)
                curveToRelative(-0.67f, 0.57f, -1.06f, 1.4f, -1.06f, 2.29f)
                verticalLineToRelative(1f)
                lineTo(2f, 4.0f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
                lineTo(6f, 8.0f)
                verticalLineToRelative(2.58f)
                lineTo(1.88f, 14.64f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                reflectiveCurveToRelative(0.31f, 1.55f, 0.88f, 2.12f)
                lineToRelative(5.12f, 5.12f)
                horizontalLineToRelative(15f)
                lineTo(22f, 10.18f)
                lineToRelative(-10f, -2f)
                close()
                moveTo(8f, 3f)
                curveToRelative(0f, -0.29f, 0.13f, -0.57f, 0.35f, -0.76f)
                curveToRelative(0.23f, -0.19f, 0.52f, -0.27f, 0.82f, -0.22f)
                curveToRelative(0.46f, 0.08f, 0.82f, 0.56f, 0.82f, 1.09f)
                verticalLineToRelative(0.89f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(20f, 22f)
                lineTo(7.83f, 22f)
                lineToRelative(-4.54f, -4.54f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                reflectiveCurveToRelative(0.1f, -0.52f, 0.29f, -0.7f)
                lineToRelative(2.71f, -2.67f)
                verticalLineToRelative(3.61f)
                horizontalLineToRelative(2f)
                lineTo(8f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.82f)
                lineToRelative(10f, 2f)
                verticalLineToRelative(10.18f)
                close()
            }
        }.also { _HandBackPointRibbon = it}
