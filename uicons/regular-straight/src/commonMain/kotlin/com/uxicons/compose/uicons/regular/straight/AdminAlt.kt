package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AdminAlt: ImageVector? = null

val Icons.Rs.AdminAlt: ImageVector
    get() = _AdminAlt ?: UXIcon(name = "AdminAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 0f)
                curveTo(4.69f, 0f, 2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                close()
                moveTo(8f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(4.5f, 14f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(22.5f, 18f)
                curveToRelative(0f, -0.46f, -0.09f, -0.9f, -0.22f, -1.31f)
                lineToRelative(1.42f, -0.82f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(-1.41f, 0.81f)
                curveToRelative(-0.6f, -0.65f, -1.39f, -1.12f, -2.29f, -1.33f)
                verticalLineToRelative(-1.62f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.62f)
                curveToRelative(-0.9f, 0.2f, -1.69f, 0.68f, -2.29f, 1.33f)
                lineToRelative(-1.41f, -0.81f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(1.42f, 0.82f)
                curveToRelative(-0.13f, 0.42f, -0.22f, 0.85f, -0.22f, 1.31f)
                reflectiveCurveToRelative(0.09f, 0.9f, 0.22f, 1.31f)
                lineToRelative(-1.42f, 0.82f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(1.41f, -0.81f)
                curveToRelative(0.6f, 0.65f, 1.39f, 1.12f, 2.29f, 1.33f)
                verticalLineToRelative(1.62f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.62f)
                curveToRelative(0.9f, -0.2f, 1.69f, -0.68f, 2.29f, -1.33f)
                lineToRelative(1.41f, 0.81f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(-1.42f, -0.82f)
                curveToRelative(0.13f, -0.42f, 0.22f, -0.85f, 0.22f, -1.31f)
                close()
                moveTo(18f, 20.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _AdminAlt = it}
