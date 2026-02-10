package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vihara: ImageVector? = null

val Icons.Ss.Vihara: ImageVector
    get() = _Vihara ?: UXIcon(name = "Vihara") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 14f)
                lineTo(4f, 14f)
                curveToRelative(-0.3f, 1.35f, -1.8f, 4f, -4f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -3.67f, -2.55f, -4f, -4f)
                close()
                moveTo(7f, 24f)
                lineTo(2f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
                moveTo(9f, 22f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(17f, 22f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 12f)
                lineTo(4f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                close()
                moveTo(18.17f, 2.79f)
                lineToRelative(-0.17f, -0.77f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                reflectiveCurveToRelative(0f, -2f, 0f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.02f)
                lineToRelative(-0.17f, 0.77f)
                curveToRelative(-0.01f, 0.05f, -1.22f, 3.21f, -3.83f, 3.21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                curveToRelative(-2.61f, 0f, -3.82f, -3.16f, -3.83f, -3.21f)
                close()
            }
        }.also { _Vihara = it}
