package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainTram: ImageVector? = null

val Icons.Rs.TrainTram: ImageVector
    get() = _TrainTram ?: UXIcon(name = "TrainTram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-4f)
                lineTo(13f, 2.02f)
                curveToRelative(3.2f, 0.14f, 5.67f, 0.92f, 5.69f, 0.93f)
                lineToRelative(0.61f, -1.9f)
                curveToRelative(-0.13f, -0.04f, -3.31f, -1.05f, -7.31f, -1.05f)
                reflectiveCurveTo(4.83f, 1.0f, 4.69f, 1.05f)
                lineToRelative(0.61f, 1.9f)
                curveToRelative(0.03f, -0.01f, 2.48f, -0.79f, 5.69f, -0.93f)
                verticalLineToRelative(2.98f)
                lineTo(7f, 5.0f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(13f)
                lineTo(7.22f, 22.0f)
                lineToRelative(-1.23f, 2f)
                horizontalLineToRelative(2.35f)
                lineToRelative(1.23f, -2f)
                horizontalLineToRelative(4.86f)
                lineToRelative(1.23f, 2f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-1.23f, -2f)
                horizontalLineToRelative(4.22f)
                lineTo(21f, 9f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                lineTo(5f, 9f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
                moveTo(13f, 14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(5f, 14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                lineTo(5f, 14f)
                close()
                moveTo(5f, 20f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                lineTo(5f, 20f)
                close()
            }
        }.also { _TrainTram = it}
