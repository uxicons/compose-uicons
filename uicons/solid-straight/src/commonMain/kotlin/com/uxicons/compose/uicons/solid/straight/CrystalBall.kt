package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrystalBall: ImageVector? = null

val Icons.Ss.CrystalBall: ImageVector
    get() = _CrystalBall ?: UXIcon(name = "CrystalBall") {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(3.4f, 18f)
                curveToRelative(-1.56f, -1.9f, -2.51f, -4.32f, -2.51f, -6.97f)
                curveTo(0.9f, 4.94f, 5.83f, 0f, 11.92f, 0f)
                curveToRelative(1.83f, 0f, 3.55f, 0.45f, 5.07f, 1.24f)
                lineToRelative(-5.52f, 2.76f)
                lineToRelative(5.65f, 2.82f)
                lineToRelative(2.82f, 5.65f)
                lineToRelative(2.44f, -4.89f)
                curveToRelative(0.36f, 1.08f, 0.56f, 2.24f, 0.56f, 3.44f)
                curveToRelative(0f, 2.65f, -0.94f, 5.07f, -2.5f, 6.97f)
                lineTo(3.4f, 18.0f)
                close()
                moveTo(8.95f, 11.5f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-2.33f, 1.17f)
                close()
                moveTo(2.32f, 20f)
                lineToRelative(-1.37f, 2f)
                verticalLineToRelative(2f)
                lineTo(22.95f, 24f)
                lineToRelative(0.05f, -2f)
                lineToRelative(-1.4f, -2f)
                lineTo(2.32f, 20f)
                close()
            }
        }.also { _CrystalBall = it}
