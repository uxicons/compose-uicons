package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Russian: ImageVector? = null

val Icons.Ss.Russian: ImageVector
    get() = _Russian ?: UXIcon(name = "Russian") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.75f, 7.9f)
                horizontalLineToRelative(-0.65f)
                verticalLineToRelative(-1.3f)
                horizontalLineToRelative(0.65f)
                curveToRelative(0.36f, 0f, 0.65f, 0.29f, 0.65f, 0.65f)
                reflectiveCurveToRelative(-0.29f, 0.65f, -0.65f, 0.65f)
                close()
                moveTo(2.15f, 20.0f)
                curveToRelative(-1.15f, 0.02f, -2.17f, -0.99f, -2.15f, -2.15f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                lineTo(7.3f, 17f)
                lineToRelative(-3.96f, 2.64f)
                curveToRelative(-0.36f, 0.24f, -0.77f, 0.36f, -1.19f, 0.36f)
                close()
                moveTo(10f, 9.75f)
                curveToRelative(0f, 1.24f, 1.01f, 2.25f, 2.25f, 2.25f)
                reflectiveCurveToRelative(2.25f, -1.01f, 2.25f, -2.25f)
                lineTo(14.5f, 5f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(4.75f)
                curveToRelative(0f, 0.36f, -0.29f, 0.65f, -0.65f, 0.65f)
                reflectiveCurveToRelative(-0.65f, -0.29f, -0.65f, -0.65f)
                lineTo(11.6f, 5f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(4.75f)
                close()
                moveTo(4.5f, 12f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(0.41f)
                lineToRelative(0.91f, 2.5f)
                horizontalLineToRelative(1.7f)
                lineToRelative(-1.06f, -2.93f)
                curveToRelative(0.57f, -0.41f, 0.94f, -1.07f, 0.94f, -1.82f)
                curveToRelative(0f, -1.24f, -1.01f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(7f)
                close()
                moveTo(21f, 4f)
                verticalLineToRelative(15f)
                lineTo(7.91f, 19f)
                lineToRelative(-1.91f, 1.27f)
                verticalLineToRelative(0.73f)
                horizontalLineToRelative(10.7f)
                lineToRelative(3.96f, 2.64f)
                curveToRelative(1.35f, 0.97f, 3.39f, -0.13f, 3.34f, -1.79f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _Russian = it}
