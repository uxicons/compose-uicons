package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneLock: ImageVector? = null

val Icons.Bs.PlaneLock: ImageVector
    get() = _PlaneLock ?: UXIcon(name = "PlaneLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.88f)
                lineToRelative(-7.78f, 4.33f)
                curveToRelative(-0.14f, 0.08f, -0.23f, 0.22f, -0.23f, 0.36f)
                verticalLineToRelative(0.83f)
                lineToRelative(8f, -2.7f)
                verticalLineToRelative(11.45f)
                lineToRelative(-5f, 1.84f)
                verticalLineToRelative(-2.3f)
                curveToRelative(0f, -0.81f, 0.4f, -1.56f, 1.07f, -2.01f)
                lineToRelative(0.93f, -0.62f)
                verticalLineToRelative(-4.18f)
                lineToRelative(-8f, 2.7f)
                verticalLineToRelative(-5.01f)
                curveToRelative(0f, -1.25f, 0.68f, -2.4f, 1.78f, -2.99f)
                lineToRelative(6.22f, -3.47f)
                verticalLineToRelative(-2.12f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2.12f)
                lineToRelative(1.69f, 0.94f)
                curveToRelative(-1.3f, 0.16f, -2.48f, 0.71f, -3.42f, 1.53f)
                lineToRelative(-1.26f, -0.7f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(20f, 13.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _PlaneLock = it}
