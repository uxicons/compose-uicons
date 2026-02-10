package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserFastRunning: ImageVector? = null

val Icons.Bs.UserFastRunning: ImageVector
    get() = _UserFastRunning ?: UXIcon(name = "UserFastRunning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19.1f, 13f)
                horizontalLineToRelative(4.9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.1f)
                lineToRelative(-1.15f, -2.15f)
                curveToRelative(-0.61f, -1.14f, -1.79f, -1.85f, -3.09f, -1.85f)
                horizontalLineToRelative(-6.93f)
                lineToRelative(-2.95f, 4.13f)
                lineToRelative(2.44f, 1.74f)
                lineToRelative(2.05f, -2.87f)
                horizontalLineToRelative(1.94f)
                lineToRelative(-1.97f, 3.08f)
                curveToRelative(-0.65f, 1.57f, -0.07f, 3.38f, 1.43f, 4.32f)
                lineToRelative(4.33f, 2.47f)
                verticalLineToRelative(5.13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.87f)
                lineToRelative(-4.43f, -2.52f)
                lineToRelative(2.41f, -3.71f)
                lineToRelative(1.12f, 2.1f)
                close()
                moveTo(10.39f, 17.03f)
                lineToRelative(-0.4f, 0.97f)
                horizontalLineToRelative(-3.99f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                lineToRelative(0.89f, -2.16f)
                lineToRelative(-1.22f, -0.69f)
                curveToRelative(-0.5f, -0.31f, -0.92f, -0.7f, -1.28f, -1.12f)
                close()
                moveTo(1f, 6f)
                verticalLineToRelative(3f)
                lineTo(5.13f, 9f)
                lineToRelative(2.14f, -3f)
                lineTo(1f, 6f)
                close()
                moveTo(11f, 1f)
                lineTo(2f, 1f)
                verticalLineToRelative(3f)
                lineTo(11f, 4f)
                lineTo(11f, 1f)
                close()
                moveTo(0f, 14f)
                lineTo(5f, 14f)
                verticalLineToRelative(-3f)
                lineTo(0f, 11f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _UserFastRunning = it}
