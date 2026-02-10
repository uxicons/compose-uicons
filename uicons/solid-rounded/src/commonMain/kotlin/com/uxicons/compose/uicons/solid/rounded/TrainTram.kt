package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainTram: ImageVector? = null

val Icons.Sr.TrainTram: ImageVector
    get() = _TrainTram ?: UXIcon(name = "TrainTram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 14f)
                lineTo(3f, 14f)
                verticalLineToRelative(-4f)
                lineTo(11f, 10f)
                verticalLineToRelative(4f)
                close()
                moveTo(13f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4f)
                lineTo(13f, 10f)
                close()
                moveTo(8f, 5f)
                curveToRelative(-2.04f, 0f, -3.8f, 1.24f, -4.58f, 3f)
                lineTo(20.58f, 8f)
                curveToRelative(-0.77f, -1.76f, -2.53f, -3f, -4.58f, -3f)
                horizontalLineToRelative(-3f)
                lineTo(13f, 2.02f)
                curveToRelative(3.2f, 0.14f, 5.67f, 0.92f, 5.69f, 0.93f)
                curveToRelative(0.52f, 0.17f, 1.09f, -0.12f, 1.26f, -0.65f)
                curveToRelative(0.17f, -0.53f, -0.12f, -1.09f, -0.65f, -1.26f)
                curveToRelative(-0.13f, -0.04f, -3.31f, -1.05f, -7.31f, -1.05f)
                reflectiveCurveTo(4.83f, 1.0f, 4.69f, 1.05f)
                curveToRelative(-0.53f, 0.17f, -0.81f, 0.73f, -0.65f, 1.26f)
                curveToRelative(0.14f, 0.42f, 0.53f, 0.69f, 0.95f, 0.69f)
                curveToRelative(0.1f, 0f, 0.2f, -0.02f, 0.31f, -0.05f)
                curveToRelative(0.03f, -0.01f, 2.48f, -0.78f, 5.69f, -0.93f)
                verticalLineToRelative(2.98f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(17f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                lineTo(3f, 16f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.26f, 1.52f, 4.15f, 3.58f, 4.77f)
                lineToRelative(-0.43f, 0.71f)
                curveToRelative(-0.29f, 0.47f, -0.14f, 1.09f, 0.33f, 1.38f)
                curveToRelative(0.16f, 0.1f, 0.34f, 0.15f, 0.52f, 0.15f)
                curveToRelative(0.34f, 0f, 0.67f, -0.17f, 0.85f, -0.48f)
                lineToRelative(0.93f, -1.52f)
                horizontalLineToRelative(6.43f)
                lineToRelative(0.93f, 1.52f)
                curveToRelative(0.19f, 0.31f, 0.52f, 0.48f, 0.85f, 0.48f)
                curveToRelative(0.18f, 0f, 0.36f, -0.05f, 0.52f, -0.15f)
                curveToRelative(0.47f, -0.29f, 0.62f, -0.9f, 0.33f, -1.38f)
                lineToRelative(-0.43f, -0.71f)
                curveToRelative(2.06f, -0.62f, 3.58f, -2.51f, 3.58f, -4.77f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _TrainTram = it}
