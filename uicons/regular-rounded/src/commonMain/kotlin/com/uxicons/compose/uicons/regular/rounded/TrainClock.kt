package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainClock: ImageVector? = null

val Icons.Rr.TrainClock: ImageVector
    get() = _TrainClock ?: UXIcon(name = "TrainClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(13.71f, 18.25f)
                curveToRelative(0.4f, 0.38f, 0.42f, 1.01f, 0.04f, 1.41f)
                curveToRelative(-0.38f, 0.4f, -1.01f, 0.42f, -1.41f, 0.04f)
                lineToRelative(-1.02f, -0.97f)
                curveToRelative(-0.2f, -0.19f, -0.31f, -0.45f, -0.31f, -0.72f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.57f)
                lineToRelative(0.71f, 0.68f)
                close()
                moveTo(4.5f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(23.82f, 10.81f)
                curveToRelative(-1.64f, -5.22f, -6.01f, -10.81f, -13.36f, -10.81f)
                horizontalLineToRelative(-9.46f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(19.39f)
                curveToRelative(0.66f, 1.1f, 1.16f, 2.26f, 1.52f, 3.41f)
                curveToRelative(0.17f, 0.56f, 0.1f, 1.13f, -0.2f, 1.63f)
                curveToRelative(-0.3f, 0.5f, -0.81f, 0.84f, -1.37f, 0.94f)
                curveToRelative(-0.55f, 0.09f, -0.91f, 0.61f, -0.82f, 1.15f)
                curveToRelative(0.09f, 0.55f, 0.62f, 0.91f, 1.15f, 0.82f)
                curveToRelative(1.14f, -0.19f, 2.14f, -0.87f, 2.74f, -1.86f)
                curveToRelative(0.6f, -0.98f, 0.75f, -2.17f, 0.4f, -3.27f)
                close()
                moveTo(6f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(11f, 6f)
                verticalLineToRelative(-3.97f)
                curveToRelative(3.42f, 0.16f, 6.06f, 1.78f, 7.94f, 3.97f)
                close()
            }
        }.also { _TrainClock = it}
