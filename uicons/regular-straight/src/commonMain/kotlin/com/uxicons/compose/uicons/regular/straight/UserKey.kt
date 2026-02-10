package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserKey: ImageVector? = null

val Icons.Rs.UserKey: ImageVector
    get() = _UserKey ?: UXIcon(name = "UserKey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(20.27f, 12.73f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(-0.59f, 0.59f, -1.54f, 0.59f, -2.12f, 0f)
                reflectiveCurveToRelative(-0.59f, -1.54f, 0f, -2.12f)
                reflectiveCurveToRelative(1.54f, -0.59f, 2.12f, 0f)
                close()
                moveTo(22.39f, 10.61f)
                curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
                reflectiveCurveToRelative(-2.85f, 0.57f, -3.89f, 1.61f)
                curveToRelative(-1.45f, 1.45f, -1.96f, 3.54f, -1.35f, 5.5f)
                verticalLineToRelative(0.39f)
                horizontalLineToRelative(-2.25f)
                lineToRelative(-0.01f, 2f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.02f, 5.49f)
                horizontalLineToRelative(4.94f)
                reflectiveCurveToRelative(4.01f, -4.01f, 4.01f, -4.01f)
                curveToRelative(1.62f, 0.15f, 3.24f, -0.41f, 4.41f, -1.58f)
                curveToRelative(1.04f, -1.04f, 1.61f, -2.42f, 1.61f, -3.89f)
                reflectiveCurveToRelative(-0.57f, -2.85f, -1.61f, -3.89f)
                close()
                moveTo(20.98f, 16.98f)
                curveToRelative(-0.63f, 0.63f, -1.46f, 1.02f, -2.32f, 1.02f)
                curveToRelative(-1.04f, 0f, -1.36f, -0.17f, -1.36f, -0.17f)
                lineToRelative(-4.16f, 4.16f)
                horizontalLineToRelative(-2.12f)
                reflectiveCurveToRelative(-0.01f, -1.49f, -0.01f, -1.49f)
                horizontalLineToRelative(1.97f)
                lineToRelative(0.01f, -2f)
                horizontalLineToRelative(2.27f)
                verticalLineToRelative(-2.72f)
                curveToRelative(-0.53f, -1.46f, -0.17f, -2.82f, 0.77f, -3.76f)
                curveToRelative(1.32f, -1.32f, 3.63f, -1.32f, 4.95f, 0f)
                curveToRelative(0.66f, 0.66f, 1.02f, 1.54f, 1.02f, 2.48f)
                reflectiveCurveToRelative(-0.36f, 1.81f, -1.02f, 2.48f)
                close()
                moveTo(9f, 16f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _UserKey = it}
