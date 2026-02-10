package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BloodTestTube: ImageVector? = null

val Icons.Sr.BloodTestTube: ImageVector
    get() = _BloodTestTube ?: UXIcon(name = "BloodTestTube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 20f)
                curveToRelative(-1.33f, 0f, -2.59f, -0.52f, -3.54f, -1.46f)
                curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0f, -7.07f)
                lineToRelative(1.55f, -1.64f)
                lineToRelative(0.55f, -0.56f)
                curveToRelative(0.79f, -0.81f, 2.08f, -0.81f, 2.87f, -0.0f)
                lineToRelative(0.53f, 0.54f)
                lineToRelative(1.6f, 1.69f)
                curveToRelative(1.93f, 1.93f, 1.93f, 5.1f, -0.02f, 7.05f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                close()
                moveTo(3f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(10f)
                lineTo(14f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(3f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(12.05f, 19.95f)
                curveToRelative(-2.73f, -2.73f, -2.73f, -7.17f, 0f, -9.9f)
                lineToRelative(0.99f, -1.05f)
                lineTo(4f, 9.0f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(2.01f, 0f, 3.74f, -1.2f, 4.53f, -2.92f)
                curveToRelative(-0.54f, -0.31f, -1.04f, -0.68f, -1.48f, -1.13f)
                close()
            }
        }.also { _BloodTestTube = it}
