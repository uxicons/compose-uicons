package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _It: ImageVector? = null

val Icons.Rs.It: ImageVector
    get() = _It ?: UXIcon(name = "It") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(7f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(0f, 21f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(6.3f, 8.13f)
                lineToRelative(1.42f, -0.82f)
                curveToRelative(-0.13f, -0.42f, -0.22f, -0.85f, -0.22f, -1.31f)
                reflectiveCurveToRelative(0.09f, -0.9f, 0.22f, -1.31f)
                lineToRelative(-1.42f, -0.82f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(1.41f, 0.81f)
                curveToRelative(0.6f, -0.65f, 1.39f, -1.12f, 2.29f, -1.33f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.62f)
                curveToRelative(0.9f, 0.2f, 1.69f, 0.68f, 2.29f, 1.33f)
                lineToRelative(1.41f, -0.81f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(-1.42f, 0.82f)
                curveToRelative(0.13f, 0.42f, 0.22f, 0.85f, 0.22f, 1.31f)
                reflectiveCurveToRelative(-0.09f, 0.9f, -0.22f, 1.31f)
                lineToRelative(1.42f, 0.82f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(-1.41f, -0.81f)
                curveToRelative(-0.6f, 0.65f, -1.39f, 1.13f, -2.29f, 1.33f)
                verticalLineToRelative(1.62f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.62f)
                curveToRelative(-0.9f, -0.2f, -1.69f, -0.68f, -2.29f, -1.33f)
                lineToRelative(-1.41f, 0.81f)
                lineToRelative(-1.0f, -1.73f)
                close()
                moveTo(9.5f, 6f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
            }
        }.also { _It = it}
