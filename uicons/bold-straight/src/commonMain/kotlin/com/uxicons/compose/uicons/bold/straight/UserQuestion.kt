package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserQuestion: ImageVector? = null

val Icons.Bs.UserQuestion: ImageVector
    get() = _UserQuestion ?: UXIcon(name = "UserQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 9.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(8f, 15f)
                lineTo(4f, 15f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5f)
                lineTo(3f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(24f, 2f)
                lineTo(24f, 11f)
                horizontalLineToRelative(-7.87f)
                lineToRelative(-2.45f, 1.69f)
                curveToRelative(-0.72f, 0.46f, -1.67f, -0.06f, -1.67f, -0.92f)
                lineToRelative(-0.0f, -9.77f)
                curveTo(12.0f, 0.9f, 12.9f, 0.0f, 14.0f, 0.0f)
                lineToRelative(8f, -0.0f)
                curveToRelative(1.1f, 0f, 2.0f, 0.9f, 2.0f, 2f)
                close()
                moveTo(19f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20.93f, 3.37f)
                curveToRelative(-0.23f, -1.09f, -1.07f, -1.98f, -2.14f, -2.26f)
                curveToRelative(-0.92f, -0.24f, -1.87f, -0.05f, -2.61f, 0.52f)
                curveToRelative(-0.74f, 0.57f, -1.18f, 1.47f, -1.18f, 2.4f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.32f, 0.15f, -0.62f, 0.41f, -0.82f)
                curveToRelative(0.15f, -0.11f, 0.46f, -0.28f, 0.88f, -0.17f)
                curveToRelative(0.33f, 0.09f, 0.62f, 0.39f, 0.69f, 0.74f)
                curveToRelative(0.11f, 0.52f, -0.18f, 0.94f, -0.51f, 1.11f)
                curveToRelative(-0.4f, 0.21f, -1.47f, 0.77f, -1.47f, 2.12f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.06f, 0f, -0.14f, 0.4f, -0.35f)
                curveToRelative(1.2f, -0.63f, 1.81f, -1.95f, 1.54f, -3.29f)
                close()
            }
        }.also { _UserQuestion = it}
