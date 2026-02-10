package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxCircleCheck: ImageVector? = null

val Icons.Sr.BoxCircleCheck: ImageVector
    get() = _BoxCircleCheck ?: UXIcon(name = "BoxCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(21.68f, 17.71f)
                lineToRelative(-2.7f, 2.61f)
                curveToRelative(-0.45f, 0.45f, -1.05f, 0.67f, -1.65f, 0.67f)
                reflectiveCurveToRelative(-1.2f, -0.23f, -1.66f, -0.67f)
                lineToRelative(-1.35f, -1.33f)
                curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.01f)
                lineToRelative(1.35f, 1.33f)
                curveToRelative(0.14f, 0.14f, 0.38f, 0.14f, 0.52f, -0.0f)
                lineToRelative(2.71f, -2.62f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
                close()
                moveTo(12.71f, 24f)
                horizontalLineToRelative(-6.71f)
                curveToRelative(-2.76f, -0.0f, -5.0f, -2.24f, -5f, -5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15.99f)
                curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8f)
                curveToRelative(0f, 2.39f, 1.05f, 4.53f, 2.71f, 6f)
                close()
                moveTo(3f, 8f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                curveToRelative(0f, 0f, 14.14f, 0.0f, 14.22f, 0.01f)
                curveToRelative(2.76f, 0.12f, 4.9f, 2.46f, 4.78f, 5.22f)
                curveToRelative(-0.1f, 1.57f, -1.42f, 2.8f, -3f, 2.78f)
                lineTo(3f, 8f)
                close()
            }
        }.also { _BoxCircleCheck = it}
