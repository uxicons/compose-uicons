package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneLock: ImageVector? = null

val Icons.Rs.PlaneLock: ImageVector
    get() = _PlaneLock ?: UXIcon(name = "PlaneLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.56f)
                lineToRelative(-7.44f, 4.54f)
                curveToRelative(-0.36f, 0.2f, -0.56f, 0.54f, -0.56f, 0.9f)
                verticalLineToRelative(0.93f)
                lineToRelative(8f, -2.85f)
                verticalLineToRelative(7.01f)
                lineToRelative(-2.55f, 1.69f)
                curveToRelative(-0.28f, 0.19f, -0.45f, 0.5f, -0.45f, 0.83f)
                verticalLineToRelative(0.49f)
                lineToRelative(3f, -1.11f)
                verticalLineToRelative(2.13f)
                curveToRelative(-1.05f, 0.39f, -3.91f, 1.44f, -5f, 1.84f)
                verticalLineToRelative(-3.36f)
                curveToRelative(0f, -1.01f, 0.51f, -1.95f, 1.34f, -2.5f)
                lineToRelative(1.66f, -1.1f)
                verticalLineToRelative(-3.1f)
                lineToRelative(-8f, 2.85f)
                verticalLineToRelative(-3.77f)
                curveToRelative(0f, -1.1f, 0.6f, -2.11f, 1.56f, -2.63f)
                lineToRelative(6.44f, -3.93f)
                verticalLineToRelative(-3.44f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                verticalLineToRelative(3.44f)
                lineToRelative(1.68f, 1.03f)
                curveToRelative(-0.69f, 0.29f, -1.31f, 0.71f, -1.84f, 1.22f)
                lineToRelative(-1.84f, -1.12f)
                verticalLineToRelative(-4.56f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(24f, 14f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(22f, 16f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _PlaneLock = it}
