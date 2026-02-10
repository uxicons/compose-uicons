package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LabCoat: ImageVector? = null

val Icons.Rs.LabCoat: ImageVector
    get() = _LabCoat ?: UXIcon(name = "LabCoat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.08f)
                curveToRelative(0f, -1.45f, -0.61f, -2.82f, -1.68f, -3.74f)
                curveToRelative(-1.23f, -1.06f, -3.23f, -2.33f, -5.82f, -2.33f)
                lineTo(7.5f, 0f)
                curveTo(4.92f, 0f, 2.91f, 1.27f, 1.68f, 2.33f)
                curveToRelative(-1.07f, 0.93f, -1.68f, 2.29f, -1.68f, 3.74f)
                verticalLineToRelative(14.92f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                lineTo(24f, 6.08f)
                close()
                moveTo(12f, 7.5f)
                lineToRelative(-2.36f, -5.5f)
                horizontalLineToRelative(4.71f)
                lineToRelative(-2.36f, 5.5f)
                close()
                moveTo(6f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                lineTo(2f, 6.08f)
                curveToRelative(0f, -0.87f, 0.36f, -1.69f, 0.99f, -2.23f)
                curveToRelative(0.97f, -0.84f, 2.54f, -1.84f, 4.51f, -1.84f)
                horizontalLineToRelative(0.43f)
                lineToRelative(-1.43f, 2f)
                lineToRelative(4.5f, 4.91f)
                verticalLineToRelative(13.09f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                close()
                moveTo(22f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-13.09f)
                lineToRelative(4.5f, -4.91f)
                lineToRelative(-1.43f, -2f)
                horizontalLineToRelative(0.43f)
                curveToRelative(1.97f, 0f, 3.54f, 1.0f, 4.51f, 1.84f)
                curveToRelative(0.63f, 0.55f, 0.99f, 1.36f, 0.99f, 2.23f)
                verticalLineToRelative(12.92f)
                close()
            }
        }.also { _LabCoat = it}
