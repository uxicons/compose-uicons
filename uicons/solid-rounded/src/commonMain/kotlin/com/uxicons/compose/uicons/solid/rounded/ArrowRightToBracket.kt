package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowRightToBracket: ImageVector? = null

val Icons.Sr.ArrowRightToBracket: ImageVector
    get() = _ArrowRightToBracket ?: UXIcon(name = "ArrowRightToBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(22f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(18f, 12f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.87f, -2.11f)
                lineToRelative(-4.41f, -4.59f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.03f)
                curveToRelative(-0.4f, 0.38f, -0.41f, 1.02f, -0.03f, 1.41f)
                lineToRelative(4.15f, 4.31f)
                lineTo(1f, 10.99f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(15.42f, 12.99f)
                lineToRelative(-4.15f, 4.31f)
                curveToRelative(-0.38f, 0.4f, -0.37f, 1.03f, 0.03f, 1.41f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.28f, 0.69f, 0.28f)
                curveToRelative(0.26f, 0f, 0.52f, -0.1f, 0.72f, -0.31f)
                lineToRelative(4.4f, -4.57f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                close()
            }
        }.also { _ArrowRightToBracket = it}
