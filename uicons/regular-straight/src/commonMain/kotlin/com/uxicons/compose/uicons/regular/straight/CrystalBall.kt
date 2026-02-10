package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrystalBall: ImageVector? = null

val Icons.Rs.CrystalBall: ImageVector
    get() = _CrystalBall ?: UXIcon(name = "CrystalBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.45f, 7.58f)
                lineToRelative(-1.47f, 2.94f)
                curveToRelative(0.01f, 0.16f, 0.02f, 0.32f, 0.02f, 0.48f)
                curveToRelative(0f, 2.24f, -0.82f, 4.35f, -2.31f, 6f)
                lineTo(5.31f, 17.0f)
                curveToRelative(-1.48f, -1.65f, -2.31f, -3.77f, -2.31f, -6f)
                curveTo(3f, 6.04f, 7.04f, 2f, 12f, 2f)
                curveToRelative(0.94f, 0f, 1.85f, 0.15f, 2.7f, 0.41f)
                lineToRelative(2.35f, -1.18f)
                curveToRelative(-1.51f, -0.79f, -3.23f, -1.24f, -5.05f, -1.24f)
                curveTo(5.93f, 0f, 1f, 4.93f, 1f, 11f)
                curveToRelative(0f, 2.64f, 0.94f, 5.15f, 2.65f, 7.14f)
                lineToRelative(-2.65f, 3.53f)
                verticalLineToRelative(2.33f)
                lineTo(23f, 24f)
                verticalLineToRelative(-2.33f)
                lineToRelative(-2.64f, -3.52f)
                curveToRelative(1.71f, -1.99f, 2.64f, -4.49f, 2.64f, -7.14f)
                curveToRelative(0f, -1.2f, -0.2f, -2.34f, -0.55f, -3.42f)
                close()
                moveTo(3.25f, 22f)
                lineToRelative(2.25f, -3f)
                horizontalLineToRelative(13f)
                lineToRelative(2.25f, 3f)
                lineTo(3.25f, 22f)
                close()
                moveTo(16f, 4f)
                lineToRelative(2.67f, -1.33f)
                lineToRelative(1.33f, -2.67f)
                lineToRelative(1.33f, 2.67f)
                lineToRelative(2.67f, 1.33f)
                lineToRelative(-2.67f, 1.33f)
                lineToRelative(-1.33f, 2.67f)
                lineToRelative(-1.33f, -2.67f)
                lineToRelative(-2.67f, -1.33f)
                close()
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
            }
        }.also { _CrystalBall = it}
