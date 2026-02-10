package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grill: ImageVector? = null

val Icons.Ts.Grill: ImageVector
    get() = _Grill ?: UXIcon(name = "Grill") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6.5f)
                verticalLineToRelative(-0.5f)
                lineTo(0f, 6f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 4.92f, 2.46f, 9.0f, 6.22f, 11.06f)
                lineToRelative(-3.22f, 6.44f)
                horizontalLineToRelative(1.04f)
                lineToRelative(3.02f, -6.03f)
                curveToRelative(1.35f, 0.6f, 2.85f, 0.96f, 4.44f, 1.02f)
                verticalLineToRelative(5.01f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.01f)
                curveToRelative(1.59f, -0.06f, 3.09f, -0.42f, 4.44f, -1.02f)
                lineToRelative(3.02f, 6.03f)
                horizontalLineToRelative(1.04f)
                lineToRelative(-3.22f, -6.44f)
                curveToRelative(3.77f, -2.06f, 6.22f, -6.14f, 6.22f, -11.06f)
                close()
                moveTo(12f, 18f)
                curveTo(5.79f, 18f, 1.23f, 13.4f, 1.01f, 7f)
                lineTo(22.99f, 7f)
                curveToRelative(-0.23f, 6.4f, -4.78f, 11f, -10.99f, 11f)
                close()
                moveTo(12.5f, 4f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 0f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 4f)
                close()
                moveTo(17f, 4f)
                horizontalLineToRelative(-1f)
                lineTo(16f, 0f)
                horizontalLineToRelative(1f)
                lineTo(17f, 4f)
                close()
                moveTo(8f, 4f)
                horizontalLineToRelative(-1f)
                lineTo(7f, 0f)
                horizontalLineToRelative(1f)
                lineTo(8f, 4f)
                close()
            }
        }.also { _Grill = it}
