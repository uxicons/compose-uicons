package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeUp: ImageVector? = null

val Icons.Sr.MarsStrokeUp: ImageVector
    get() = _MarsStrokeUp ?: UXIcon(name = "MarsStrokeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 10.08f)
                verticalLineToRelative(-1.08f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2.57f)
                lineToRelative(2.32f, 2.16f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0f, 0.53f, -0.11f, 0.73f, -0.32f)
                curveToRelative(0.38f, -0.4f, 0.35f, -1.04f, -0.05f, -1.41f)
                lineTo(14.12f, 0.88f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.22f, -0.02f)
                lineToRelative(-2.59f, 2.41f)
                curveToRelative(-0.4f, 0.38f, -0.42f, 1.01f, -0.05f, 1.41f)
                curveToRelative(0.38f, 0.4f, 1.01f, 0.43f, 1.41f, 0.05f)
                lineToRelative(2.32f, -2.16f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.08f)
                curveToRelative(-3.39f, 0.49f, -6f, 3.4f, -6f, 6.92f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -3.52f, -2.61f, -6.43f, -6f, -6.92f)
                close()
            }
        }.also { _MarsStrokeUp = it}
