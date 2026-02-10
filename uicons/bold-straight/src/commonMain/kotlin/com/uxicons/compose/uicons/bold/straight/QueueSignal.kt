package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QueueSignal: ImageVector? = null

val Icons.Bs.QueueSignal: ImageVector
    get() = _QueueSignal ?: UXIcon(name = "QueueSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(3f)
                close()
                moveTo(18f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 3f)
                close()
                moveTo(7f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(10.5f, 6f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.33f, 0.49f, -2.55f, 1.28f, -3.5f)
                horizontalLineToRelative(-0.78f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(8f, 9.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(2f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.4f, 0f, 0.78f, 0.1f, 1.11f, 0.27f)
                curveToRelative(-0.38f, 0.66f, -0.61f, 1.41f, -0.61f, 2.23f)
                reflectiveCurveToRelative(0.23f, 1.57f, 0.61f, 2.23f)
                curveToRelative(-0.34f, 0.17f, -0.71f, 0.27f, -1.11f, 0.27f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _QueueSignal = it}
