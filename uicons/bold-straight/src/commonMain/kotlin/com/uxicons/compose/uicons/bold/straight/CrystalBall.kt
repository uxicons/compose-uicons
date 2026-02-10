package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrystalBall: ImageVector? = null

val Icons.Bs.CrystalBall: ImageVector
    get() = _CrystalBall ?: UXIcon(name = "CrystalBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.67f, 9.33f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(1.17f, 2.33f)
                close()
                moveTo(18.67f, 5.33f)
                lineToRelative(1.33f, 2.67f)
                lineToRelative(1.33f, -2.67f)
                lineToRelative(2.67f, -1.33f)
                lineToRelative(-2.67f, -1.33f)
                lineToRelative(-1.33f, -2.67f)
                lineToRelative(-1.33f, 2.67f)
                lineToRelative(-2.67f, 1.33f)
                lineToRelative(2.67f, 1.33f)
                close()
                moveTo(22.44f, 7.52f)
                lineToRelative(-2.65f, 5.33f)
                curveToRelative(-0.14f, 0.6f, -0.36f, 1.18f, -0.63f, 1.73f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-1.35f, 2.71f, -4.09f, 4.42f, -7.16f, 4.42f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 3f, 12f, 3f)
                curveToRelative(0.43f, 0f, 0.84f, 0.03f, 1.25f, 0.1f)
                lineToRelative(3.77f, -1.88f)
                curveToRelative(-1.51f, -0.78f, -3.21f, -1.21f, -5.02f, -1.21f)
                curveTo(5.93f, 0f, 1f, 4.93f, 1f, 11f)
                curveToRelative(0f, 3.04f, 1.24f, 5.79f, 3.23f, 7.78f)
                lineToRelative(-2.23f, 2.68f)
                verticalLineToRelative(2.54f)
                lineTo(22f, 24f)
                verticalLineToRelative(-2.54f)
                lineToRelative(-2.22f, -2.67f)
                curveToRelative(1.04f, -1.04f, 1.88f, -2.3f, 2.45f, -3.74f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(0.5f, -1.25f, 0.77f, -2.62f, 0.77f, -4.05f)
                curveToRelative(0f, -1.21f, -0.2f, -2.38f, -0.56f, -3.48f)
                close()
            }
        }.also { _CrystalBall = it}
