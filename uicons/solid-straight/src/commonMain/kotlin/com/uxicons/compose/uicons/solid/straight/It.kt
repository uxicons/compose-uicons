package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _It: ImageVector? = null

val Icons.Ss.It: ImageVector
    get() = _It ?: UXIcon(name = "It") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.3f, 9.86f)
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
                reflectiveCurveToRelative(-0.09f, -0.9f, -0.22f, -1.31f)
                lineToRelative(1.42f, -0.82f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(-1.41f, 0.81f)
                curveToRelative(-0.6f, -0.65f, -1.39f, -1.12f, -2.29f, -1.33f)
                lineTo(13f, 0f)
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
                close()
                moveTo(12f, 4.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13f, 21f)
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
                horizontalLineToRelative(1.07f)
                curveToRelative(-0.04f, 0.33f, -0.07f, 0.66f, -0.07f, 1f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.58f, 8f, -8f)
                curveToRelative(0f, -0.34f, -0.03f, -0.67f, -0.07f, -1f)
                horizontalLineToRelative(1.07f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-11f)
                close()
            }
        }.also { _It = it}
