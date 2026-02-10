package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainClock: ImageVector? = null

val Icons.Rs.TrainClock: ImageVector
    get() = _TrainClock ?: UXIcon(name = "TrainClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 14f)
                horizontalLineToRelative(5.08f)
                curveToRelative(-0.36f, 0.62f, -0.63f, 1.29f, -0.82f, 2f)
                horizontalLineToRelative(-4.26f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.26f)
                curveToRelative(-0.18f, -0.71f, -0.46f, -1.38f, -0.82f, -2f)
                horizontalLineToRelative(3.05f)
                curveToRelative(-0.15f, -2.21f, -0.79f, -4.25f, -1.81f, -6f)
                horizontalLineToRelative(-20.16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                curveToRelative(7.85f, 0f, 14f, 6.59f, 14f, 15f)
                close()
                moveTo(5f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(18.72f, 6f)
                curveToRelative(-1.96f, -2.23f, -4.66f, -3.69f, -7.72f, -3.95f)
                verticalLineToRelative(3.95f)
                close()
                moveTo(18f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(16f, 18f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(13f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.42f)
                lineToRelative(2.08f, 2.02f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(-1.47f, -1.43f)
                close()
            }
        }.also { _TrainClock = it}
