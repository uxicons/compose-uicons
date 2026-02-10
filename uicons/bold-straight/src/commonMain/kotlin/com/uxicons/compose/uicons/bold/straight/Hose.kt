package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hose: ImageVector? = null

val Icons.Bs.Hose: ImageVector
    get() = _Hose ?: UXIcon(name = "Hose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                close()
                moveTo(0f, 19f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                lineTo(0f, 16f)
                verticalLineToRelative(3f)
                close()
                moveTo(16.14f, 6.46f)
                lineToRelative(7.87f, -1.46f)
                verticalLineToRelative(-3f)
                lineToRelative(-7.87f, -1.46f)
                curveToRelative(-0.59f, -0.1f, -1.14f, 0.36f, -1.14f, 0.96f)
                verticalLineToRelative(0.5f)
                lineTo(6f, 2f)
                curveTo(2.69f, 2f, 0f, 4.69f, 0f, 8f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-3f)
                lineTo(6f, 11f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.6f, 0.54f, 1.06f, 1.14f, 0.96f)
                close()
            }
        }.also { _Hose = it}
