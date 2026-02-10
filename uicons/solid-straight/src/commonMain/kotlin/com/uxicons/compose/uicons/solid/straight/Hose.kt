package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hose: ImageVector? = null

val Icons.Ss.Hose: ImageVector
    get() = _Hose ?: UXIcon(name = "Hose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 18f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(2f)
                lineTo(0f, 20f)
                verticalLineToRelative(-2f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(0f, 16f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                lineTo(0f, 14f)
                verticalLineToRelative(2f)
                close()
                moveTo(16.14f, 5.96f)
                lineToRelative(7.87f, -1.46f)
                lineTo(24f, 1.5f)
                lineTo(16.14f, 0.04f)
                curveToRelative(-0.59f, -0.1f, -1.14f, 0.36f, -1.14f, 0.96f)
                verticalLineToRelative(1f)
                lineTo(5f, 2f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-2f)
                lineTo(5f, 10f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.6f, 0.54f, 1.06f, 1.14f, 0.96f)
                close()
            }
        }.also { _Hose = it}
