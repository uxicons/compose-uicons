package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConveyorBeltArm: ImageVector? = null

val Icons.Bs.ConveyorBeltArm: ImageVector
    get() = _ConveyorBeltArm ?: UXIcon(name = "ConveyorBeltArm") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15.05f)
                verticalLineToRelative(-3.05f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                lineTo(4f, 12f)
                verticalLineToRelative(3.05f)
                curveToRelative(-2.24f, 0.25f, -4f, 2.14f, -4f, 4.45f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -2.31f, -1.76f, -4.2f, -4f, -4.45f)
                close()
                moveTo(15.28f, 18f)
                curveToRelative(-0.17f, 0.47f, -0.28f, 0.97f, -0.28f, 1.5f)
                reflectiveCurveToRelative(0.11f, 1.03f, 0.28f, 1.5f)
                horizontalLineToRelative(-6.55f)
                curveToRelative(0.17f, -0.47f, 0.28f, -0.97f, 0.28f, -1.5f)
                reflectiveCurveToRelative(-0.11f, -1.03f, -0.28f, -1.5f)
                horizontalLineToRelative(6.55f)
                close()
                moveTo(3f, 19.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24f, 0f)
                lineTo(24f, 3f)
                lineTo(7f, 3f)
                verticalLineToRelative(1.25f)
                lineToRelative(8.95f, 1.63f)
                curveToRelative(1.19f, 0.22f, 2.05f, 1.25f, 2.05f, 2.46f)
                verticalLineToRelative(1.67f)
                horizontalLineToRelative(-1.5f)
                reflectiveCurveToRelative(0f, -1.5f, -1f, -1.5f)
                reflectiveCurveToRelative(-1f, 1.5f, -1f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.61f)
                lineToRelative(-9f, -1.64f)
                lineTo(4f, 3f)
                lineTo(0f, 3f)
                lineTo(0f, 0f)
                lineTo(24f, 0f)
                close()
            }
        }.also { _ConveyorBeltArm = it}
