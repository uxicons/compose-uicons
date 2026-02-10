package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateLeft: ImageVector? = null

val Icons.Sr.RotateLeft: ImageVector
    get() = _RotateLeft ?: UXIcon(name = "RotateLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveToRelative(-2.99f, 0f, -5.81f, 1.11f, -8f, 3.08f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineTo(5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.13f)
                curveToRelative(1.88f, -1.91f, 4.42f, -3f, 7.13f, -3f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                curveToRelative(-5.21f, 0f, -9.49f, -3.91f, -9.96f, -9.09f)
                curveToRelative(-0.05f, -0.55f, -0.52f, -0.95f, -1.09f, -0.91f)
                curveTo(0.41f, 12.05f, 0f, 12.54f, 0.05f, 13.09f)
                curveToRelative(0.56f, 6.22f, 5.7f, 10.91f, 11.95f, 10.91f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _RotateLeft = it}
