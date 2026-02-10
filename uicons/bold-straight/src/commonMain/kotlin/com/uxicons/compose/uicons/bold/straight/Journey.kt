package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Journey: ImageVector? = null

val Icons.Bs.Journey: ImageVector
    get() = _Journey ?: UXIcon(name = "Journey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 21.5f)
                verticalLineToRelative(2.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(3.5f, 19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(20.03f, 4f)
                lineToRelative(-1.08f, -4f)
                horizontalLineToRelative(-0.89f)
                lineToRelative(-1.08f, 4f)
                horizontalLineToRelative(-3.99f)
                verticalLineToRelative(0.84f)
                lineToRelative(3.05f, 1.69f)
                lineToRelative(-1.2f, 3.74f)
                lineToRelative(0.66f, 0.5f)
                lineToRelative(3.0f, -2.32f)
                lineToRelative(2.99f, 2.31f)
                lineToRelative(0.69f, -0.48f)
                lineToRelative(-1.22f, -3.69f)
                lineToRelative(3.02f, -1.75f)
                verticalLineToRelative(-0.84f)
                horizontalLineToRelative(-3.97f)
                close()
                moveTo(19.5f, 14f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.02f)
                lineToRelative(0.96f, -3f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-10.85f)
                curveToRelative(0.22f, 0.46f, 0.35f, 0.96f, 0.35f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }.also { _Journey = it}
