package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BroomBall: ImageVector? = null

val Icons.Ts.BroomBall: ImageVector
    get() = _BroomBall ?: UXIcon(name = "BroomBall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(21f, 23f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(14.13f, 10.58f)
                lineTo(23.95f, 0.76f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-9.82f, 9.82f)
                lineToRelative(-2.7f, -2.7f)
                lineToRelative(-1.96f, 3.92f)
                curveToRelative(-1.68f, -0.32f, -3.43f, 0.21f, -4.65f, 1.43f)
                curveToRelative(-1.92f, 1.92f, -3.79f, 10.27f, -3.86f, 10.62f)
                lineToRelative(-0.17f, 0.77f)
                lineToRelative(0.77f, -0.17f)
                curveToRelative(0.35f, -0.08f, 8.71f, -1.95f, 10.62f, -3.86f)
                curveToRelative(1.23f, -1.23f, 1.76f, -2.95f, 1.43f, -4.65f)
                lineToRelative(3.92f, -1.96f)
                lineToRelative(-2.7f, -2.7f)
                close()
                moveTo(11.0f, 8.86f)
                lineToRelative(4.14f, 4.14f)
                lineToRelative(-2.78f, 1.39f)
                lineToRelative(-2.75f, -2.75f)
                lineToRelative(1.39f, -2.78f)
                close()
                moveTo(10.77f, 19.17f)
                curveToRelative(-1.28f, 1.28f, -6.62f, 2.76f, -9.36f, 3.42f)
                curveToRelative(0.65f, -2.74f, 2.13f, -8.07f, 3.42f, -9.36f)
                curveToRelative(1.0f, -1.0f, 2.43f, -1.43f, 3.81f, -1.15f)
                lineToRelative(3.28f, 3.28f)
                curveToRelative(0.28f, 1.39f, -0.14f, 2.8f, -1.15f, 3.81f)
                close()
            }
        }.also { _BroomBall = it}
