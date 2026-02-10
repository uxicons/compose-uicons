package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonThroughWindow: ImageVector? = null

val Icons.Bs.PersonThroughWindow: ImageVector
    get() = _PersonThroughWindow ?: UXIcon(name = "PersonThroughWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(24f, 3.5f)
                lineTo(24f, 22f)
                horizontalLineToRelative(-7.03f)
                lineToRelative(-1.3f, -3f)
                horizontalLineToRelative(3.05f)
                lineToRelative(-2.29f, -2f)
                horizontalLineToRelative(-3.81f)
                lineToRelative(3.02f, 7f)
                horizontalLineToRelative(-3.28f)
                lineToRelative(-0.86f, -2f)
                lineTo(0f, 22f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(17.56f, 14f)
                lineToRelative(3.44f, 3.01f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(7.22f)
                lineToRelative(-2.17f, -5.04f)
                lineToRelative(-1.07f, 3.04f)
                lineTo(3.79f, 17f)
                lineToRelative(1.78f, -5.04f)
                curveToRelative(0.46f, -1.29f, 1.37f, -2.36f, 2.58f, -3.01f)
                lineToRelative(4.35f, -2.45f)
                lineToRelative(1.33f, -1.5f)
                horizontalLineToRelative(3.93f)
                lineToRelative(-3.37f, 3.89f)
                lineToRelative(-2.6f, 1.46f)
                lineToRelative(1.51f, 3.65f)
                horizontalLineToRelative(4.26f)
                close()
            }
        }.also { _PersonThroughWindow = it}
