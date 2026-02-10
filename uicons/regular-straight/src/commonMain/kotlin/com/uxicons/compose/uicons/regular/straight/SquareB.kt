package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareB: ImageVector? = null

val Icons.Rs.SquareB: ImageVector
    get() = _SquareB ?: UXIcon(name = "SquareB") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(19f)
                close()
                moveTo(15.33f, 11.21f)
                curveToRelative(0.42f, -0.63f, 0.67f, -1.4f, 0.67f, -2.21f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6.04f)
                curveToRelative(2.18f, 0f, 3.96f, -1.77f, 3.96f, -4.03f)
                curveToRelative(0f, -1.06f, -0.41f, -2.06f, -1.16f, -2.81f)
                curveToRelative(-0.43f, -0.43f, -0.95f, -0.76f, -1.51f, -0.95f)
                close()
                moveTo(8f, 7f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(14.04f, 17.0f)
                horizontalLineToRelative(-6.04f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6.05f)
                curveToRelative(0.52f, 0f, 1.01f, 0.2f, 1.38f, 0.57f)
                curveToRelative(0.37f, 0.37f, 0.57f, 0.87f, 0.57f, 1.47f)
                curveToRelative(0f, 1.08f, -0.88f, 1.96f, -1.96f, 1.96f)
                close()
            }
        }.also { _SquareB = it}
