package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LabCoat: ImageVector? = null

val Icons.Sr.LabCoat: ImageVector
    get() = _LabCoat ?: UXIcon(name = "LabCoat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 0f)
                horizontalLineToRelative(6f)
                lineToRelative(-3f, 7f)
                lineTo(9f, 0f)
                close()
                moveTo(22.32f, 2.33f)
                curveToRelative(-1.23f, -1.06f, -3.23f, -2.33f, -5.82f, -2.33f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(1.8f, 2.11f)
                curveToRelative(0.68f, 0.8f, 0.67f, 1.98f, -0.04f, 2.75f)
                lineToRelative(-3.77f, 4.14f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(3f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(0f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(24f, 6.08f)
                curveToRelative(0f, -1.45f, -0.61f, -2.82f, -1.68f, -3.74f)
                close()
                moveTo(1.68f, 2.33f)
                curveToRelative(-1.07f, 0.93f, -1.68f, 2.29f, -1.68f, 3.74f)
                verticalLineToRelative(11.92f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-15f)
                lineToRelative(-3.77f, -4.14f)
                curveToRelative(-0.7f, -0.78f, -0.72f, -1.96f, -0.04f, -2.75f)
                lineToRelative(1.8f, -2.11f)
                horizontalLineToRelative(-1.5f)
                curveTo(4.92f, 0f, 2.91f, 1.27f, 1.68f, 2.33f)
                close()
            }
        }.also { _LabCoat = it}
