package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SimCards: ImageVector? = null

val Icons.Sr.SimCards: ImageVector
    get() = _SimCards ?: UXIcon(name = "SimCards") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(11f, 0f)
                horizontalLineToRelative(4.76f)
                curveToRelative(1.07f, 0f, 2.07f, 0.42f, 2.83f, 1.17f)
                lineToRelative(2.24f, 2.24f)
                curveToRelative(0.74f, 0.74f, 1.17f, 1.77f, 1.17f, 2.83f)
                verticalLineToRelative(8.76f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(6f, 5f)
                curveTo(6f, 2.24f, 8.24f, 0f, 11f, 0f)
                close()
                moveTo(9.05f, 12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                close()
                moveTo(12.05f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19.05f, 14f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19.05f, 11f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _SimCards = it}
