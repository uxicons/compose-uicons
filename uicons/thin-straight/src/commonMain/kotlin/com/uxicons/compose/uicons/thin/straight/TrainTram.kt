package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainTram: ImageVector? = null

val Icons.Ts.TrainTram: ImageVector
    get() = _TrainTram ?: UXIcon(name = "TrainTram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-5f)
                lineTo(12.5f, 1.01f)
                curveToRelative(3.52f, 0.08f, 6.32f, 0.96f, 6.35f, 0.97f)
                lineToRelative(0.31f, -0.95f)
                curveToRelative(-0.13f, -0.04f, -3.23f, -1.02f, -7.15f, -1.02f)
                reflectiveCurveTo(4.98f, 0.98f, 4.85f, 1.02f)
                lineToRelative(0.31f, 0.95f)
                curveToRelative(0.03f, -0.01f, 2.81f, -0.89f, 6.35f, -0.97f)
                verticalLineToRelative(3.99f)
                lineTo(6.5f, 5.0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(12.5f)
                lineTo(7.83f, 21.0f)
                lineToRelative(-1.83f, 3f)
                horizontalLineToRelative(1.21f)
                lineToRelative(1.83f, -3f)
                horizontalLineToRelative(5.92f)
                lineToRelative(1.83f, 3f)
                horizontalLineToRelative(1.21f)
                lineToRelative(-1.83f, -3f)
                horizontalLineToRelative(4.83f)
                lineTo(21.0f, 8.5f)
                close()
                moveTo(6.5f, 6f)
                horizontalLineToRelative(11f)
                curveToRelative(1.21f, 0f, 2.22f, 0.86f, 2.45f, 2f)
                lineTo(4.05f, 8f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
                close()
                moveTo(4f, 9f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(5f)
                lineTo(4f, 14f)
                verticalLineToRelative(-5f)
                close()
                moveTo(20f, 20f)
                lineTo(4f, 20f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _TrainTram = it}
