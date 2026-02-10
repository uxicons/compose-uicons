package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainTram: ImageVector? = null

val Icons.Ss.TrainTram: ImageVector
    get() = _TrainTram ?: UXIcon(name = "TrainTram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10f)
                verticalLineToRelative(4f)
                lineTo(13f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(8f)
                close()
                moveTo(11f, 10f)
                lineTo(3f, 10f)
                verticalLineToRelative(4f)
                lineTo(11f, 14f)
                verticalLineToRelative(-4f)
                close()
                moveTo(18f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                lineTo(8f, 16f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                lineTo(3f, 16f)
                verticalLineToRelative(6f)
                lineTo(7.22f, 22f)
                lineToRelative(-1.23f, 2f)
                horizontalLineToRelative(2.35f)
                lineToRelative(1.23f, -2f)
                horizontalLineToRelative(4.86f)
                lineToRelative(1.23f, 2f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-1.23f, -2f)
                horizontalLineToRelative(4.22f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                close()
                moveTo(17f, 5f)
                horizontalLineToRelative(-4f)
                lineTo(13f, 2.02f)
                curveToRelative(3.2f, 0.14f, 5.67f, 0.92f, 5.69f, 0.93f)
                lineToRelative(0.61f, -1.9f)
                curveToRelative(-0.13f, -0.04f, -3.31f, -1.05f, -7.31f, -1.05f)
                reflectiveCurveTo(4.83f, 1.0f, 4.69f, 1.05f)
                lineToRelative(0.61f, 1.9f)
                curveToRelative(0.03f, -0.01f, 2.48f, -0.78f, 5.69f, -0.93f)
                verticalLineToRelative(2.98f)
                lineTo(7f, 5f)
                curveToRelative(-1.86f, 0f, -3.41f, 1.28f, -3.86f, 3f)
                lineTo(20.86f, 8f)
                curveToRelative(-0.45f, -1.72f, -2.0f, -3f, -3.86f, -3f)
                close()
            }
        }.also { _TrainTram = it}
