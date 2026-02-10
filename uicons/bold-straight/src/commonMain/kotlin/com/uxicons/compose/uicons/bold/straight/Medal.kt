package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Medal: ImageVector? = null

val Icons.Bs.Medal: ImageVector
    get() = _Medal ?: UXIcon(name = "Medal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.13f, 14f)
                horizontalLineToRelative(2.91f)
                verticalLineToRelative(0.59f)
                lineToRelative(-2.22f, 1.28f)
                lineToRelative(0.89f, 2.71f)
                lineToRelative(-0.51f, 0.35f)
                lineToRelative(-2.19f, -1.7f)
                lineToRelative(-2.2f, 1.7f)
                lineToRelative(-0.48f, -0.36f)
                lineToRelative(0.88f, -2.74f)
                lineToRelative(-2.24f, -1.24f)
                verticalLineToRelative(-0.59f)
                horizontalLineToRelative(2.93f)
                lineToRelative(0.79f, -3f)
                horizontalLineToRelative(0.65f)
                lineToRelative(0.79f, 3f)
                close()
                moveTo(19.25f, 9.67f)
                curveToRelative(1.1f, 1.49f, 1.75f, 3.34f, 1.75f, 5.33f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 19.96f, 3f, 15f)
                curveToRelative(0f, -2.0f, 0.65f, -3.84f, 1.76f, -5.34f)
                lineTo(-0.01f, 0f)
                horizontalLineToRelative(9.28f)
                lineToRelative(2.73f, 5.54f)
                lineTo(14.75f, 0f)
                horizontalLineToRelative(9.28f)
                lineToRelative(-4.78f, 9.67f)
                close()
                moveTo(16.61f, 3f)
                lineToRelative(-1.72f, 3.48f)
                curveToRelative(0.74f, 0.25f, 1.44f, 0.6f, 2.08f, 1.03f)
                lineToRelative(2.23f, -4.5f)
                horizontalLineToRelative(-2.59f)
                close()
                moveTo(4.82f, 3f)
                lineToRelative(2.22f, 4.5f)
                curveToRelative(0.64f, -0.43f, 1.34f, -0.77f, 2.08f, -1.02f)
                lineToRelative(-1.71f, -3.47f)
                horizontalLineToRelative(-2.59f)
                close()
                moveTo(18f, 15f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
            }
        }.also { _Medal = it}
