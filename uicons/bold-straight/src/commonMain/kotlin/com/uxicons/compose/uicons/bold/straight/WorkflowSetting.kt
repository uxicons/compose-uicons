package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WorkflowSetting: ImageVector? = null

val Icons.Bs.WorkflowSetting: ImageVector
    get() = _WorkflowSetting ?: UXIcon(name = "WorkflowSetting") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(9f, 7f)
                horizontalLineToRelative(6f)
                lineTo(15f, 1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                close()
                moveTo(9f, 23f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                close()
                moveTo(5f, 16.06f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-5.06f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.06f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2f)
                lineToRelative(2.78f, -2.95f)
                curveToRelative(0.29f, -0.3f, 0.29f, -0.8f, 0f, -1.1f)
                lineToRelative(-2.78f, -2.95f)
                close()
                moveTo(22.5f, 7f)
                curveToRelative(0f, -0.28f, -0.03f, -0.55f, -0.07f, -0.82f)
                lineToRelative(1.52f, -0.88f)
                lineToRelative(-1.5f, -2.6f)
                lineToRelative(-1.52f, 0.88f)
                curveToRelative(-0.42f, -0.36f, -0.9f, -0.64f, -1.43f, -0.83f)
                verticalLineToRelative(-1.76f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.76f)
                curveToRelative(0.53f, -0.19f, 1.01f, -0.47f, 1.43f, -0.83f)
                lineToRelative(1.52f, 0.88f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(-1.52f, -0.88f)
                curveToRelative(0.05f, -0.27f, 0.07f, -0.54f, 0.07f, -0.82f)
                close()
            }
        }.also { _WorkflowSetting = it}
