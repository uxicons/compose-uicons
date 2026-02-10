package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTrust: ImageVector? = null

val Icons.Sr.UserTrust: ImageVector
    get() = _UserTrust ?: UXIcon(name = "UserTrust") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 6f)
                curveTo(3f, 2.69f, 5.69f, 0f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveTo(3f, 9.31f, 3f, 6f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(21.71f, 16.3f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.03f)
                lineToRelative(-2.71f, 2.62f)
                curveToRelative(-0.14f, 0.14f, -0.38f, 0.14f, -0.52f, 0.0f)
                lineToRelative(-1.35f, -1.33f)
                curveToRelative(-0.4f, -0.39f, -1.03f, -0.38f, -1.41f, 0.01f)
                curveToRelative(-0.39f, 0.4f, -0.38f, 1.03f, 0.01f, 1.41f)
                lineToRelative(1.35f, 1.33f)
                curveToRelative(0.46f, 0.45f, 1.06f, 0.67f, 1.66f, 0.67f)
                reflectiveCurveToRelative(1.2f, -0.23f, 1.65f, -0.67f)
                lineToRelative(2.7f, -2.61f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.03f, -1.41f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -1.37f, 0.34f, -2.65f, 0.95f, -3.78f)
                curveToRelative(-0.63f, -0.14f, -1.28f, -0.22f, -1.95f, -0.22f)
                horizontalLineToRelative(0f)
                curveTo(4.04f, 14f, 0.01f, 18.03f, 0f, 22.98f)
                curveToRelative(-0.0f, 0.56f, 0.44f, 1.02f, 1f, 1.02f)
                lineTo(12.72f, 24f)
                curveToRelative(-1.67f, -1.47f, -2.72f, -3.61f, -2.72f, -6f)
                close()
            }
        }.also { _UserTrust = it}
