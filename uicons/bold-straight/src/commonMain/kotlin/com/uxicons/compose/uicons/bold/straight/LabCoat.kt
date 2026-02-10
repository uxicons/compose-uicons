package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LabCoat: ImageVector? = null

val Icons.Bs.LabCoat: ImageVector
    get() = _LabCoat ?: UXIcon(name = "LabCoat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.14f, 2.46f)
                curveToRelative(-1.29f, -1.12f, -3.41f, -2.46f, -6.14f, -2.46f)
                horizontalLineToRelative(-8f)
                curveTo(5.26f, 0f, 3.15f, 1.33f, 1.86f, 2.46f)
                curveTo(0.68f, 3.48f, 0f, 4.98f, 0f, 6.58f)
                verticalLineToRelative(14.42f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                lineTo(24f, 6.58f)
                curveToRelative(0f, -1.6f, -0.68f, -3.1f, -1.85f, -4.12f)
                close()
                moveTo(14.36f, 3f)
                lineToRelative(-2.36f, 5.5f)
                lineToRelative(-2.36f, -5.5f)
                horizontalLineToRelative(4.71f)
                close()
                moveTo(21.0f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                lineTo(3.0f, 6.58f)
                curveToRelative(0f, -0.73f, 0.3f, -1.4f, 0.82f, -1.85f)
                curveToRelative(0.89f, -0.78f, 2.33f, -1.69f, 4.11f, -1.72f)
                lineToRelative(-1.43f, 2.0f)
                lineToRelative(5.5f, 5.5f)
                lineToRelative(5.5f, -5.5f)
                lineToRelative(-1.43f, -2.0f)
                curveToRelative(1.78f, 0.03f, 3.21f, 0.94f, 4.11f, 1.72f)
                curveToRelative(0.52f, 0.45f, 0.82f, 1.13f, 0.82f, 1.85f)
                verticalLineToRelative(11.42f)
                close()
            }
        }.also { _LabCoat = it}
