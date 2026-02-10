package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserFastRunning: ImageVector? = null

val Icons.Ss.UserFastRunning: ImageVector
    get() = _UserFastRunning ?: UXIcon(name = "UserFastRunning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.57f, 11f)
                lineToRelative(-2.14f, -3.55f)
                curveToRelative(-0.54f, -0.9f, -1.52f, -1.45f, -2.57f, -1.45f)
                horizontalLineToRelative(-6.48f)
                lineToRelative(-2.28f, 4.55f)
                lineToRelative(1.79f, 0.9f)
                lineToRelative(1.72f, -3.45f)
                horizontalLineToRelative(1.91f)
                lineToRelative(-1.75f, 4.27f)
                curveToRelative(-0.55f, 1.35f, -0.06f, 2.9f, 1.17f, 3.67f)
                lineToRelative(4.12f, 2.6f)
                verticalLineToRelative(5.45f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.55f)
                lineToRelative(-3.02f, -1.91f)
                lineToRelative(2.43f, -5.8f)
                lineToRelative(1.96f, 3.26f)
                horizontalLineToRelative(4.57f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.44f)
                close()
                moveTo(14.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(10.88f, 17.64f)
                lineToRelative(0.67f, 0.42f)
                lineToRelative(-0.8f, 1.94f)
                lineTo(4f, 20.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.41f)
                lineToRelative(0.49f, -1.2f)
                curveToRelative(0.29f, 0.31f, 0.61f, 0.6f, 0.98f, 0.84f)
                close()
                moveTo(11f, 4f)
                lineTo(2f, 4f)
                lineTo(2f, 2f)
                lineTo(11f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(-2f)
                lineTo(5f, 10f)
                verticalLineToRelative(2f)
                close()
                moveTo(6.15f, 8f)
                lineTo(1f, 8f)
                verticalLineToRelative(-2f)
                lineTo(7.15f, 6f)
                lineToRelative(-1f, 2f)
                close()
            }
        }.also { _UserFastRunning = it}
