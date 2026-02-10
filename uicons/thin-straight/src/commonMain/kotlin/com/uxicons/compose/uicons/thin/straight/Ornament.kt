package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ornament: ImageVector? = null

val Icons.Ts.Ornament: ImageVector
    get() = _Ornament ?: UXIcon(name = "Ornament") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 5.16f)
                verticalLineToRelative(-3.16f)
                horizontalLineToRelative(-2.59f)
                curveToRelative(0.06f, -0.16f, 0.09f, -0.33f, 0.09f, -0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.17f, 0.03f, 0.34f, 0.09f, 0.5f)
                horizontalLineToRelative(-2.58f)
                verticalLineToRelative(3.16f)
                curveToRelative(-3.76f, 1.54f, -6f, 4.82f, -6f, 8.84f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                curveToRelative(0f, -4.02f, -2.24f, -7.3f, -6f, -8.84f)
                close()
                moveTo(9f, 3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2.03f)
                lineToRelative(-6f, -0.03f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(3f, 14f)
                curveToRelative(0f, -3.72f, 2.04f, -6.63f, 5.59f, -8f)
                horizontalLineToRelative(6.82f)
                curveToRelative(3.56f, 1.37f, 5.59f, 4.28f, 5.59f, 8f)
                curveToRelative(0f, 0.28f, -0.01f, 0.55f, -0.04f, 0.81f)
                lineToRelative(-4.02f, -4.02f)
                lineToRelative(-4.98f, 4.98f)
                lineToRelative(-4.75f, -4.75f)
                lineToRelative(-4.14f, 4.14f)
                curveToRelative(-0.05f, -0.38f, -0.08f, -0.77f, -0.08f, -1.17f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-4.15f, 0f, -7.65f, -2.83f, -8.69f, -6.65f)
                lineToRelative(3.9f, -3.9f)
                lineToRelative(4.75f, 4.75f)
                lineToRelative(4.98f, -4.98f)
                lineToRelative(3.83f, 3.83f)
                curveToRelative(-0.92f, 3.99f, -4.5f, 6.97f, -8.77f, 6.97f)
                close()
            }
        }.also { _Ornament = it}
