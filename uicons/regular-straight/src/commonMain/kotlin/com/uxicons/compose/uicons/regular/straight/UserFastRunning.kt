package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserFastRunning: ImageVector? = null

val Icons.Rs.UserFastRunning: ImageVector
    get() = _UserFastRunning ?: UXIcon(name = "UserFastRunning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(7.15f, 6f)
                lineTo(1f, 6f)
                verticalLineToRelative(2f)
                lineTo(6.15f, 8f)
                lineToRelative(1f, -2f)
                close()
                moveTo(11f, 2f)
                lineTo(2f, 2f)
                verticalLineToRelative(2f)
                lineTo(11f, 4f)
                lineTo(11f, 2f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.57f)
                lineToRelative(-1.65f, -2.74f)
                lineToRelative(-2.32f, 5.55f)
                lineToRelative(2.6f, 1.64f)
                verticalLineToRelative(6.55f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.45f)
                lineToRelative(-4.12f, -2.6f)
                curveToRelative(-1.23f, -0.78f, -1.73f, -2.32f, -1.17f, -3.67f)
                lineToRelative(1.75f, -4.27f)
                horizontalLineToRelative(-1.91f)
                lineToRelative(-1.72f, 3.45f)
                lineToRelative(-1.79f, -0.9f)
                lineToRelative(2.28f, -4.55f)
                horizontalLineToRelative(6.48f)
                curveToRelative(1.04f, 0f, 2.03f, 0.56f, 2.57f, 1.45f)
                lineToRelative(2.14f, 3.55f)
                horizontalLineToRelative(3.44f)
                close()
                moveTo(16.43f, 8.19f)
                curveToRelative(-0.17f, -0.12f, -0.36f, -0.19f, -0.57f, -0.19f)
                horizontalLineToRelative(-1.17f)
                lineToRelative(-2.06f, 5.03f)
                curveToRelative(-0.18f, 0.45f, -0.02f, 0.96f, 0.39f, 1.23f)
                lineToRelative(0.73f, 0.46f)
                lineToRelative(2.68f, -6.53f)
                close()
                moveTo(9.9f, 16.8f)
                lineToRelative(-0.49f, 1.2f)
                lineTo(4f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.75f)
                lineToRelative(0.8f, -1.94f)
                lineToRelative(-0.67f, -0.42f)
                curveToRelative(-0.37f, -0.24f, -0.69f, -0.53f, -0.98f, -0.84f)
                close()
                moveTo(5f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(2f)
                lineTo(5f, 12f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _UserFastRunning = it}
