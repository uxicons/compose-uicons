package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldDividedFour: ImageVector? = null

val Icons.Ts.ShieldDividedFour: ImageVector
    get() = _ShieldDividedFour ?: UXIcon(name = "ShieldDividedFour") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.21f, 2.75f)
                lineTo(12f, 0.03f)
                lineTo(3.79f, 2.75f)
                curveToRelative(-1.07f, 0.35f, -1.79f, 1.35f, -1.79f, 2.47f)
                lineToRelative(-0.0f, 6.6f)
                curveToRelative(0f, 6.64f, 7.16f, 10.73f, 9.35f, 11.83f)
                lineToRelative(0.63f, 0.31f)
                lineToRelative(0.65f, -0.26f)
                curveToRelative(2.2f, -0.89f, 9.37f, -4.35f, 9.37f, -11.85f)
                lineToRelative(0.0f, -6.63f)
                curveToRelative(0f, -1.12f, -0.72f, -2.12f, -1.79f, -2.47f)
                close()
                moveTo(21f, 5.23f)
                lineToRelative(-0.0f, 5.77f)
                lineTo(12.5f, 11f)
                lineTo(12.5f, 1.25f)
                lineToRelative(7.4f, 2.45f)
                curveToRelative(0.66f, 0.22f, 1.1f, 0.83f, 1.1f, 1.52f)
                close()
                moveTo(4.1f, 3.7f)
                lineTo(11.5f, 1.25f)
                lineTo(11.5f, 11f)
                lineTo(3.0f, 11f)
                lineToRelative(0.0f, -5.77f)
                curveToRelative(0f, -0.69f, 0.44f, -1.3f, 1.1f, -1.52f)
                close()
                moveTo(3.01f, 12f)
                lineTo(11.5f, 12f)
                verticalLineToRelative(10.61f)
                curveToRelative(-2.31f, -1.2f, -8.37f, -4.9f, -8.49f, -10.61f)
                close()
                moveTo(12.5f, 22.68f)
                lineTo(12.5f, 12f)
                horizontalLineToRelative(8.49f)
                curveToRelative(-0.09f, 6.53f, -6.23f, 9.72f, -8.49f, 10.68f)
                close()
            }
        }.also { _ShieldDividedFour = it}
