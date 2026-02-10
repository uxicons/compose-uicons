package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FighterJet: ImageVector? = null

val Icons.Ts.FighterJet: ImageVector
    get() = _FighterJet ?: UXIcon(name = "FighterJet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.29f, 9.04f)
                lineTo(10.21f, 1f)
                horizontalLineToRelative(2.29f)
                lineTo(12.5f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 9f)
                horizontalLineToRelative(-2.23f)
                lineToRelative(-1.25f, -1.88f)
                curveToRelative(-0.46f, -0.7f, -1.24f, -1.12f, -2.08f, -1.12f)
                lineTo(0f, 6f)
                verticalLineToRelative(12f)
                lineTo(1.45f, 18f)
                curveToRelative(0.84f, 0f, 1.62f, -0.42f, 2.08f, -1.12f)
                lineToRelative(1.23f, -1.88f)
                horizontalLineToRelative(2.23f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(5.08f, -8.01f)
                curveToRelative(2.35f, -0.16f, 8.71f, -0.78f, 8.71f, -2.99f)
                reflectiveCurveToRelative(-6.36f, -2.81f, -8.71f, -2.96f)
                close()
                moveTo(14.97f, 14.01f)
                lineToRelative(-0.26f, 0.01f)
                lineToRelative(-5.69f, 8.98f)
                horizontalLineToRelative(-1.02f)
                lineTo(8.0f, 14f)
                horizontalLineToRelative(-3.77f)
                lineToRelative(-1.53f, 2.33f)
                curveToRelative(-0.28f, 0.42f, -0.75f, 0.67f, -1.25f, 0.67f)
                horizontalLineToRelative(-0.45f)
                lineTo(1.0f, 7f)
                horizontalLineToRelative(0.44f)
                curveToRelative(0.51f, 0f, 0.97f, 0.25f, 1.25f, 0.67f)
                lineToRelative(1.54f, 2.33f)
                horizontalLineToRelative(3.77f)
                lineTo(8f, 1f)
                horizontalLineToRelative(1.02f)
                lineToRelative(5.69f, 9.01f)
                lineToRelative(0.26f, 0.01f)
                curveToRelative(4.28f, 0.24f, 8.03f, 1.17f, 8.03f, 1.98f)
                reflectiveCurveToRelative(-3.75f, 1.75f, -8.03f, 2.01f)
                close()
            }
        }.also { _FighterJet = it}
