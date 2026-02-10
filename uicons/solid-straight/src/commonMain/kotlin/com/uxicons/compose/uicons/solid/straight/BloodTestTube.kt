package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BloodTestTube: ImageVector? = null

val Icons.Ss.BloodTestTube: ImageVector
    get() = _BloodTestTube ?: UXIcon(name = "BloodTestTube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 20f)
                curveToRelative(-1.33f, 0f, -2.59f, -0.52f, -3.54f, -1.46f)
                curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0f, -7.07f)
                lineToRelative(3.54f, -3.46f)
                lineToRelative(3.53f, 3.45f)
                curveToRelative(1.96f, 1.96f, 1.96f, 5.13f, 0.01f, 7.08f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                close()
                moveTo(4f, 7f)
                horizontalLineToRelative(10f)
                lineTo(14f, 2f)
                horizontalLineToRelative(2f)
                lineTo(16f, 0f)
                lineTo(2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
                moveTo(12.05f, 19.95f)
                curveToRelative(-2.73f, -2.73f, -2.73f, -7.17f, 0f, -9.9f)
                lineToRelative(1.07f, -1.05f)
                lineTo(4f, 9.0f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(2.01f, 0f, 3.74f, -1.2f, 4.53f, -2.92f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.54f, -0.31f, -1.04f, -0.68f, -1.48f, -1.13f)
                close()
            }
        }.also { _BloodTestTube = it}
