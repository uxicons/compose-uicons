package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainTram: ImageVector? = null

val Icons.Bs.TrainTram: ImageVector
    get() = _TrainTram ?: UXIcon(name = "TrainTram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.95f)
                curveToRelative(2.87f, 0.19f, 5.02f, 0.87f, 5.04f, 0.88f)
                lineToRelative(0.92f, -2.86f)
                curveToRelative(-0.14f, -0.04f, -3.38f, -1.07f, -7.46f, -1.07f)
                reflectiveCurveTo(4.68f, 1.03f, 4.54f, 1.07f)
                lineToRelative(0.92f, 2.85f)
                curveToRelative(0.03f, -0.01f, 2.16f, -0.68f, 5.04f, -0.88f)
                verticalLineToRelative(1.95f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(3.76f)
                lineToRelative(-1.23f, 2f)
                horizontalLineToRelative(3.23f)
                lineToRelative(1.23f, -2f)
                horizontalLineToRelative(4.13f)
                lineToRelative(1.23f, 2f)
                horizontalLineToRelative(3.15f)
                lineToRelative(-1.23f, -2f)
                horizontalLineToRelative(3.73f)
                lineTo(21f, 9.5f)
                close()
                moveTo(10.5f, 10f)
                verticalLineToRelative(3f)
                lineTo(6f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(13.5f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(6f, 19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                lineTo(6f, 19f)
                close()
            }
        }.also { _TrainTram = it}
