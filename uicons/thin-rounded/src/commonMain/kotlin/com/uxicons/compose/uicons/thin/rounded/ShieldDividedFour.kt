package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldDividedFour: ImageVector? = null

val Icons.Tr.ShieldDividedFour: ImageVector
    get() = _ShieldDividedFour ?: UXIcon(name = "ShieldDividedFour") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6.54f)
                curveToRelative(0f, -1.94f, -1.24f, -3.66f, -3.08f, -4.27f)
                lineTo(12.16f, 0.03f)
                curveToRelative(-0.1f, -0.03f, -0.21f, -0.03f, -0.31f, 0f)
                lineTo(5.08f, 2.27f)
                curveToRelative(-1.84f, 0.61f, -3.08f, 2.33f, -3.08f, 4.27f)
                lineToRelative(-0.0f, 5.46f)
                curveToRelative(0f, 6.61f, 7.16f, 10.7f, 9.35f, 11.8f)
                curveToRelative(0f, 0f, 0.29f, 0.2f, 0.65f, 0.2f)
                reflectiveCurveToRelative(0.63f, -0.15f, 0.63f, -0.15f)
                curveToRelative(2.2f, -0.89f, 9.37f, -4.35f, 9.37f, -11.85f)
                lineToRelative(0.0f, -5.46f)
                close()
                moveTo(21f, 6.54f)
                lineToRelative(-0.0f, 4.46f)
                lineTo(12.5f, 11f)
                lineTo(12.5f, 1.19f)
                lineToRelative(6.1f, 2.02f)
                curveToRelative(1.44f, 0.48f, 2.4f, 1.81f, 2.4f, 3.32f)
                close()
                moveTo(5.4f, 3.22f)
                lineTo(11.5f, 1.19f)
                lineTo(11.5f, 11f)
                lineTo(3.0f, 11f)
                lineToRelative(0.0f, -4.46f)
                curveToRelative(0f, -1.51f, 0.96f, -2.85f, 2.4f, -3.32f)
                close()
                moveTo(3.01f, 12f)
                lineTo(11.5f, 12f)
                verticalLineToRelative(10.63f)
                curveToRelative(-2.32f, -1.21f, -8.41f, -4.92f, -8.49f, -10.63f)
                close()
                moveTo(12.5f, 22.7f)
                lineTo(12.5f, 12f)
                horizontalLineToRelative(8.49f)
                curveToRelative(-0.07f, 6.55f, -6.22f, 9.75f, -8.49f, 10.7f)
                close()
            }
        }.also { _ShieldDividedFour = it}
