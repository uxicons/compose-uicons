package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldDividedFour: ImageVector? = null

val Icons.Rr.ShieldDividedFour: ImageVector
    get() = _ShieldDividedFour ?: UXIcon(name = "ShieldDividedFour") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.57f, 2.17f)
                lineTo(12.31f, 0.1f)
                curveToRelative(-0.2f, -0.07f, -0.42f, -0.07f, -0.63f, 0f)
                lineTo(5.43f, 2.17f)
                curveToRelative(-2.05f, 0.68f, -3.43f, 2.59f, -3.43f, 4.75f)
                verticalLineToRelative(5.17f)
                curveToRelative(0f, 6.56f, 7.0f, 10.58f, 9.15f, 11.65f)
                curveToRelative(0f, 0f, 0.52f, 0.31f, 0.85f, 0.31f)
                reflectiveCurveToRelative(0.79f, -0.24f, 0.79f, -0.24f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                lineTo(22.0f, 6.92f)
                curveToRelative(0f, -2.16f, -1.38f, -4.07f, -3.43f, -4.75f)
                close()
                moveTo(20f, 6.92f)
                verticalLineToRelative(4.08f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 2.43f)
                lineToRelative(4.94f, 1.64f)
                curveToRelative(1.23f, 0.41f, 2.06f, 1.55f, 2.06f, 2.85f)
                close()
                moveTo(6.06f, 4.07f)
                lineToRelative(4.94f, -1.64f)
                lineTo(11f, 11f)
                lineTo(4f, 11f)
                lineTo(4f, 6.92f)
                curveToRelative(0f, -1.3f, 0.83f, -2.44f, 2.06f, -2.85f)
                close()
                moveTo(4.06f, 13f)
                horizontalLineToRelative(6.94f)
                verticalLineToRelative(8.38f)
                curveToRelative(-2.31f, -1.33f, -6.4f, -4.23f, -6.94f, -8.38f)
                close()
                moveTo(13f, 21.52f)
                lineTo(13f, 13f)
                horizontalLineToRelative(6.94f)
                curveToRelative(-0.48f, 4.77f, -4.65f, 7.42f, -6.94f, 8.53f)
                close()
            }
        }.also { _ShieldDividedFour = it}
