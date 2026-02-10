package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BahtSign: ImageVector? = null

val Icons.Tr.BahtSign: ImageVector
    get() = _BahtSign ?: UXIcon(name = "BahtSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.78f, 11.15f)
                curveToRelative(1.33f, -0.9f, 2.22f, -2.42f, 2.22f, -4.15f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-3f)
                lineTo(11f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                curveToRelative(0f, -2.59f, -1.8f, -4.77f, -4.22f, -5.35f)
                close()
                moveTo(14f, 3f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-3f)
                lineTo(11f, 3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(5f, 5.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                lineTo(10f, 11f)
                lineTo(5f, 11f)
                lineTo(5f, 5.5f)
                close()
                moveTo(7.5f, 21f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(15.5f, 21f)
                horizontalLineToRelative(-4.5f)
                lineTo(11f, 12f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
            }
        }.also { _BahtSign = it}
