package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CartArrowDown: ImageVector? = null

val Icons.Sr.CartArrowDown: ImageVector
    get() = _CartArrowDown ?: UXIcon(name = "CartArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(17f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(23.32f, 4.1f)
                curveToRelative(-0.57f, -0.7f, -1.42f, -1.1f, -2.32f, -1.1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(6.5f)
                lineToRelative(1.32f, -1.23f)
                curveToRelative(0.41f, -0.38f, 1.04f, -0.36f, 1.41f, 0.05f)
                curveToRelative(0.38f, 0.4f, 0.35f, 1.04f, -0.05f, 1.41f)
                lineToRelative(-1.59f, 1.48f)
                curveToRelative(-0.57f, 0.57f, -1.33f, 0.86f, -2.09f, 0.86f)
                reflectiveCurveToRelative(-1.54f, -0.29f, -2.13f, -0.88f)
                lineToRelative(-1.56f, -1.46f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.05f, -1.41f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.43f, 1.41f, -0.05f)
                lineToRelative(1.32f, 1.23f)
                lineTo(11.99f, 3f)
                lineTo(5.24f, 3f)
                lineToRelative(-0.04f, -0.35f)
                curveToRelative(-0.18f, -1.51f, -1.46f, -2.65f, -2.98f, -2.65f)
                lineTo(1f, 0f)
                curveTo(0.45f, 0f, 0f, 0.45f, 0f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.22f)
                curveToRelative(0.51f, 0f, 0.93f, 0.38f, 0.99f, 0.88f)
                lineToRelative(1.38f, 11.7f)
                curveToRelative(0.3f, 2.52f, 2.43f, 4.42f, 4.97f, 4.42f)
                horizontalLineToRelative(9.44f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(9.56f, 17f)
                curveToRelative(-1.29f, 0f, -2.4f, -0.83f, -2.82f, -2f)
                horizontalLineToRelative(11.42f)
                curveToRelative(2.38f, 0f, 4.44f, -1.69f, 4.9f, -4.02f)
                lineToRelative(0.88f, -4.39f)
                curveToRelative(0.18f, -0.88f, -0.05f, -1.79f, -0.62f, -2.49f)
                close()
            }
        }.also { _CartArrowDown = it}
