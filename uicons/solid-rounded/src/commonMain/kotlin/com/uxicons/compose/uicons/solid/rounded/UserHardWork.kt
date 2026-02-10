package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHardWork: ImageVector? = null

val Icons.Sr.UserHardWork: ImageVector
    get() = _UserHardWork ?: UXIcon(name = "UserHardWork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.5f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1.5f, 4.88f, 1.5f, 3.5f)
                close()
                moveTo(9f, 19f)
                verticalLineToRelative(-2f)
                lineTo(3f, 17f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.11f, -0.02f, 0.21f, -0.05f, 0.32f)
                lineToRelative(-1f, 3f)
                curveToRelative(-0.17f, 0.53f, -0.76f, 0.81f, -1.26f, 0.63f)
                curveToRelative(-0.52f, -0.17f, -0.81f, -0.74f, -0.63f, -1.26f)
                lineToRelative(0.95f, -2.85f)
                lineTo(1.0f, 10f)
                curveToRelative(0f, -1.64f, 1.32f, -2.97f, 2.95f, -3.0f)
                curveToRelative(0.02f, 0f, 0.03f, -0.0f, 0.05f, -0.0f)
                horizontalLineToRelative(4.67f)
                curveToRelative(0.27f, 0f, 0.52f, -0.1f, 0.71f, -0.29f)
                lineToRelative(2.91f, -2.62f)
                reflectiveCurveToRelative(0.01f, -0.01f, 0.02f, -0.01f)
                curveToRelative(0.8f, -2.37f, 3.04f, -4.08f, 5.68f, -4.08f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                curveToRelative(-2.98f, 0f, -5.45f, -2.18f, -5.91f, -5.03f)
                lineToRelative(-1.28f, 1.15f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.88f, -2.12f, 0.88f)
                horizontalLineToRelative(-2.67f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(22.43f, 13.18f)
                lineToRelative(-13f, 9.02f)
                curveToRelative(-0.45f, 0.31f, -0.57f, 0.94f, -0.25f, 1.39f)
                curveToRelative(0.32f, 0.46f, 0.94f, 0.56f, 1.39f, 0.25f)
                lineToRelative(13f, -9.02f)
                curveToRelative(0.45f, -0.31f, 0.57f, -0.94f, 0.25f, -1.39f)
                curveToRelative(-0.32f, -0.45f, -0.94f, -0.57f, -1.39f, -0.25f)
                close()
            }
        }.also { _UserHardWork = it}
