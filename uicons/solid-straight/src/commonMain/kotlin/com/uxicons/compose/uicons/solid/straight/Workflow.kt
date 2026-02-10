package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Workflow: ImageVector? = null

val Icons.Ss.Workflow: ImageVector
    get() = _Workflow ?: UXIcon(name = "Workflow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.16f, 4.25f)
                lineTo(12f, 0.09f)
                lineToRelative(-4.16f, 4.16f)
                lineToRelative(3.16f, 3.16f)
                verticalLineToRelative(1.98f)
                curveToRelative(-1.44f, 0.43f, -2.5f, 1.77f, -2.5f, 3.35f)
                reflectiveCurveToRelative(1.06f, 2.92f, 2.5f, 3.35f)
                verticalLineToRelative(1.9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.9f)
                curveToRelative(1.44f, -0.43f, 2.5f, -1.77f, 2.5f, -3.35f)
                reflectiveCurveToRelative(-1.06f, -2.92f, -2.5f, -3.35f)
                verticalLineToRelative(-1.98f)
                lineToRelative(3.16f, -3.16f)
                close()
                moveTo(6.78f, 19.45f)
                curveToRelative(0.29f, 0.3f, 0.29f, 0.8f, 0f, 1.1f)
                lineToRelative(-2.78f, 2.95f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.5f)
                lineToRelative(2.78f, 2.95f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.5f)
                lineToRelative(-2.78f, -2.95f)
                curveToRelative(-0.29f, -0.3f, -0.29f, -0.8f, 0f, -1.1f)
                lineToRelative(2.78f, -2.95f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _Workflow = it}
