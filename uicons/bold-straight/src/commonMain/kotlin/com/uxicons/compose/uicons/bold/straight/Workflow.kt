package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Workflow: ImageVector? = null

val Icons.Bs.Workflow: ImageVector
    get() = _Workflow ?: UXIcon(name = "Workflow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12.5f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(16f, 4f)
                lineTo(12f, 0f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
                close()
                moveTo(9f, 23f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                close()
                moveTo(5f, 17.06f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-4.06f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.06f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2f)
                lineToRelative(2.78f, -2.95f)
                curveToRelative(0.29f, -0.3f, 0.29f, -0.8f, 0f, -1.1f)
                lineToRelative(-2.78f, -2.95f)
                close()
                moveTo(20.5f, 2f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2f)
                lineToRelative(-2.78f, 2.95f)
                curveToRelative(-0.29f, 0.3f, -0.29f, 0.8f, 0f, 1.1f)
                lineToRelative(2.78f, 2.95f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _Workflow = it}
