package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dumpster: ImageVector? = null

val Icons.Ss.Dumpster: ImageVector
    get() = _Dumpster ?: UXIcon(name = "Dumpster") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-4f)
                lineTo(7f, 0f)
                horizontalLineToRelative(4f)
                close()
                moveTo(19f, 6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                close()
                moveTo(0.09f, 8f)
                lineToRelative(1.0f, 11f)
                horizontalLineToRelative(21.83f)
                lineToRelative(1.0f, -11f)
                lineTo(0.09f, 8f)
                close()
                moveTo(17f, 0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                lineTo(17f, 0f)
                close()
                moveTo(5f, 6f)
                lineTo(5f, 0f)
                horizontalLineToRelative(-2f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                close()
                moveTo(4f, 21f)
                verticalLineToRelative(0.08f)
                curveToRelative(0f, 1.61f, 1.35f, 2.92f, 3f, 2.92f)
                reflectiveCurveToRelative(3f, -1.31f, 3f, -2.92f)
                verticalLineToRelative(-0.08f)
                lineTo(4f, 21f)
                close()
                moveTo(14f, 21f)
                verticalLineToRelative(0.08f)
                curveToRelative(0f, 1.61f, 1.35f, 2.92f, 3f, 2.92f)
                reflectiveCurveToRelative(3f, -1.31f, 3f, -2.92f)
                verticalLineToRelative(-0.08f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Dumpster = it}
