package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dumpster: ImageVector? = null

val Icons.Sr.Dumpster: ImageVector
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
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                close()
                moveTo(0.09f, 8f)
                lineToRelative(0.58f, 6.45f)
                curveToRelative(0.23f, 2.58f, 2.39f, 4.55f, 4.98f, 4.55f)
                horizontalLineToRelative(12.69f)
                curveToRelative(2.59f, 0f, 4.75f, -1.97f, 4.98f, -4.55f)
                lineToRelative(0.58f, -6.45f)
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
                horizontalLineToRelative(-1f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                close()
                moveTo(4f, 21f)
                verticalLineToRelative(0.08f)
                curveToRelative(0f, 1.61f, 1.35f, 2.92f, 3f, 2.92f)
                reflectiveCurveToRelative(3f, -1.31f, 3f, -2.92f)
                verticalLineToRelative(-0.08f)
                horizontalLineToRelative(-6f)
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
