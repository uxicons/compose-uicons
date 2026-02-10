package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Medal: ImageVector? = null

val Icons.Ss.Medal: ImageVector
    get() = _Medal ?: UXIcon(name = "Medal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.45f, 6.91f)
                curveToRelative(-1.73f, -1.59f, -3.97f, -2.64f, -6.45f, -2.87f)
                lineTo(15f, 0f)
                horizontalLineToRelative(7.87f)
                lineToRelative(-3.42f, 6.91f)
                close()
                moveTo(11.0f, 4.05f)
                lineToRelative(-2.0f, -4.05f)
                lineTo(1.03f, 0f)
                lineToRelative(3.45f, 6.99f)
                curveToRelative(1.74f, -1.64f, 4.01f, -2.71f, 6.52f, -2.94f)
                close()
                moveTo(21f, 15f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 19.96f, 3f, 15f)
                reflectiveCurveTo(7.04f, 6f, 12f, 6f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(17f, 13.5f)
                horizontalLineToRelative(-3.58f)
                lineToRelative(-1.0f, -3.53f)
                horizontalLineToRelative(-0.82f)
                lineToRelative(-1.0f, 3.53f)
                horizontalLineToRelative(-3.6f)
                verticalLineToRelative(0.75f)
                lineToRelative(2.7f, 1.58f)
                lineToRelative(-1.07f, 3.17f)
                lineToRelative(0.61f, 0.46f)
                lineToRelative(2.77f, -2.15f)
                lineToRelative(2.76f, 2.14f)
                lineToRelative(0.64f, -0.44f)
                lineToRelative(-1.15f, -3.13f)
                lineToRelative(2.74f, -1.63f)
                verticalLineToRelative(-0.74f)
                close()
            }
        }.also { _Medal = it}
