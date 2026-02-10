package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneLock: ImageVector? = null

val Icons.Ss.PlaneLock: ImageVector
    get() = _PlaneLock ?: UXIcon(name = "PlaneLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(15.68f, 7.46f)
                lineTo(14f, 6.44f)
                verticalLineToRelative(-3.44f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(3.44f)
                lineToRelative(-6.44f, 3.93f)
                curveToRelative(-0.96f, 0.53f, -1.56f, 1.53f, -1.56f, 2.63f)
                verticalLineToRelative(3.35f)
                lineToRelative(8f, -2.85f)
                verticalLineToRelative(4.46f)
                lineToRelative(-1.66f, 1.1f)
                curveToRelative(-0.84f, 0.56f, -1.34f, 1.49f, -1.34f, 2.5f)
                verticalLineToRelative(2.41f)
                curveToRelative(1.1f, -0.41f, 3.94f, -1.45f, 5f, -1.84f)
                verticalLineToRelative(-10.13f)
                horizontalLineToRelative(2.09f)
                curveToRelative(0.34f, -2.05f, 1.73f, -3.75f, 3.59f, -4.54f)
                close()
            }
        }.also { _PlaneLock = it}
