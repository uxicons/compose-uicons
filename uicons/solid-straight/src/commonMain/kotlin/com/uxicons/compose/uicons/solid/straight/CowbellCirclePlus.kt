package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CowbellCirclePlus: ImageVector? = null

val Icons.Ss.CowbellCirclePlus: ImageVector
    get() = _CowbellCirclePlus ?: UXIcon(name = "CowbellCirclePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 17f)
                curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
                curveToRelative(1.11f, 0f, 2.17f, 0.2f, 3.15f, 0.57f)
                lineToRelative(-0.23f, -1.27f)
                curveToRelative(-0.34f, -1.91f, -2.0f, -3.3f, -3.94f, -3.3f)
                horizontalLineToRelative(-0.16f)
                curveToRelative(0.11f, -0.31f, 0.17f, -0.65f, 0.17f, -1f)
                curveTo(16f, 1.35f, 14.65f, 0f, 13f, 0f)
                horizontalLineToRelative(-4f)
                curveTo(7.35f, 0f, 6f, 1.35f, 6f, 3.0f)
                curveToRelative(0f, 0.35f, 0.06f, 0.69f, 0.17f, 1f)
                horizontalLineToRelative(-0.16f)
                curveToRelative(-1.94f, 0f, -3.6f, 1.39f, -3.94f, 3.32f)
                lineTo(0.1f, 20.0f)
                horizontalLineToRelative(6.9f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                curveToRelative(0.11f, 0f, 0.22f, -0.01f, 0.33f, -0.01f)
                horizontalLineToRelative(0f)
                curveToRelative(-2.03f, -1.65f, -3.33f, -4.17f, -3.33f, -6.99f)
                close()
                moveTo(8f, 3.0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _CowbellCirclePlus = it}
