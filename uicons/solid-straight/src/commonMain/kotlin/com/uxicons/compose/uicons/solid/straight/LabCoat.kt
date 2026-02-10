package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LabCoat: ImageVector? = null

val Icons.Ss.LabCoat: ImageVector
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
                lineToRelative(3f, 3.5f)
                lineToRelative(-5f, 5.5f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(3f)
                lineTo(24f, 6.08f)
                curveToRelative(0f, -1.45f, -0.61f, -2.82f, -1.68f, -3.74f)
                close()
                moveTo(1.68f, 2.33f)
                curveToRelative(-1.07f, 0.93f, -1.68f, 2.29f, -1.68f, 3.74f)
                verticalLineToRelative(14.92f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-15f)
                lineTo(6f, 3.5f)
                lineToRelative(3f, -3.5f)
                horizontalLineToRelative(-1.5f)
                curveTo(4.92f, 0f, 2.91f, 1.27f, 1.68f, 2.33f)
                close()
            }
        }.also { _LabCoat = it}
