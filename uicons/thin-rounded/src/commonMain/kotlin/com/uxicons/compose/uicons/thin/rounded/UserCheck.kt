package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCheck: ImageVector? = null

val Icons.Tr.UserCheck: ImageVector
    get() = _UserCheck ?: UXIcon(name = "UserCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(8f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(5.24f, 1f, 8f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 14f)
                curveTo(3.59f, 14f, 0f, 17.59f, 0f, 22f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.84f, 8.63f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.18f, -0.71f, 0.02f)
                lineToRelative(-4.57f, 4.9f)
                curveToRelative(-0.28f, 0.28f, -0.66f, 0.44f, -1.06f, 0.44f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.4f, 0f, -0.78f, -0.16f, -1.07f, -0.45f)
                lineToRelative(-2.58f, -2.41f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.18f, -0.71f, 0.02f)
                curveToRelative(-0.19f, 0.2f, -0.18f, 0.52f, 0.02f, 0.71f)
                lineToRelative(2.57f, 2.4f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.67f, 0f, 1.3f, -0.26f, 1.78f, -0.75f)
                lineToRelative(4.59f, -4.91f)
                curveToRelative(0.19f, -0.2f, 0.18f, -0.52f, -0.02f, -0.71f)
                close()
            }
        }.also { _UserCheck = it}
