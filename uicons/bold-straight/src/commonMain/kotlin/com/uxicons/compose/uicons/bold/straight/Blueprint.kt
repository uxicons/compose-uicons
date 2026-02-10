package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blueprint: ImageVector? = null

val Icons.Bs.Blueprint: ImageVector
    get() = _Blueprint ?: UXIcon(name = "Blueprint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 4f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-4f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(20f)
                lineTo(24f, 4f)
                lineTo(8f, 4f)
                close()
                moveTo(3f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.34f, 0f, -0.68f, 0.04f, -1f, 0.13f)
                lineTo(3f, 4f)
                close()
                moveTo(21f, 21f)
                lineTo(4f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                lineTo(8f, 7f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(14f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _Blueprint = it}
