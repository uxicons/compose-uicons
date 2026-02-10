package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FirstMedal: ImageVector? = null

val Icons.Sr.FirstMedal: ImageVector
    get() = _FirstMedal ?: UXIcon(name = "FirstMedal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveToRelative(-4.04f, -9f, -9f, -9f)
                close()
                moveTo(13f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.71f)
                lineToRelative(-0.29f, 0.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.24f, -1.24f)
                curveToRelative(0.41f, -0.41f, 1.03f, -0.54f, 1.57f, -0.31f)
                curveToRelative(0.54f, 0.23f, 0.89f, 0.75f, 0.89f, 1.33f)
                verticalLineToRelative(7.05f)
                close()
                moveTo(13.71f, 4.14f)
                lineToRelative(0.94f, -1.92f)
                curveToRelative(0.68f, -1.38f, 2.05f, -2.23f, 3.59f, -2.23f)
                horizontalLineToRelative(2.28f)
                curveToRelative(0.69f, 0f, 1.32f, 0.35f, 1.69f, 0.94f)
                curveToRelative(0.37f, 0.59f, 0.4f, 1.31f, 0.1f, 1.93f)
                lineToRelative(-2.28f, 4.62f)
                curveToRelative(-1.64f, -1.75f, -3.84f, -2.96f, -6.32f, -3.35f)
                close()
                moveTo(1.72f, 2.87f)
                curveToRelative(-0.31f, -0.62f, -0.27f, -1.34f, 0.1f, -1.93f)
                curveToRelative(0.36f, -0.59f, 1.0f, -0.94f, 1.69f, -0.94f)
                horizontalLineToRelative(2.26f)
                curveToRelative(1.53f, 0f, 2.91f, 0.85f, 3.59f, 2.23f)
                lineToRelative(0.94f, 1.92f)
                curveToRelative(-2.47f, 0.39f, -4.67f, 1.59f, -6.3f, 3.33f)
                lineTo(1.72f, 2.87f)
                close()
            }
        }.also { _FirstMedal = it}
