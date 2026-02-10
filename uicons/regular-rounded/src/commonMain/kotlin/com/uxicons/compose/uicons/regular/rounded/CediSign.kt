package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CediSign: ImageVector? = null

val Icons.Rr.CediSign: ImageVector
    get() = _CediSign ?: UXIcon(name = "CediSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.19f, 16.12f)
                curveToRelative(-0.49f, -0.25f, -1.09f, -0.06f, -1.35f, 0.43f)
                curveToRelative(-1.1f, 2.13f, -3.27f, 3.45f, -5.66f, 3.45f)
                horizontalLineToRelative(-0.18f)
                lineTo(13f, 4f)
                horizontalLineToRelative(0.18f)
                curveToRelative(2.43f, 0f, 4.62f, 1.35f, 5.7f, 3.54f)
                curveToRelative(0.25f, 0.49f, 0.85f, 0.7f, 1.34f, 0.45f)
                curveToRelative(0.49f, -0.25f, 0.7f, -0.85f, 0.45f, -1.34f)
                curveToRelative(-1.42f, -2.87f, -4.3f, -4.65f, -7.49f, -4.65f)
                horizontalLineToRelative(-0.18f)
                lineTo(13f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.01f)
                curveToRelative(-4.44f, 0.19f, -8f, 3.87f, -8f, 8.35f)
                verticalLineToRelative(3.27f)
                curveToRelative(0f, 4.49f, 3.56f, 8.16f, 8f, 8.35f)
                verticalLineToRelative(1.01f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(0.18f)
                curveToRelative(3.14f, 0f, 5.99f, -1.74f, 7.43f, -4.53f)
                curveToRelative(0.25f, -0.49f, 0.06f, -1.09f, -0.43f, -1.35f)
                close()
                moveTo(5f, 13.63f)
                verticalLineToRelative(-3.27f)
                curveToRelative(0f, -3.39f, 2.66f, -6.16f, 6f, -6.35f)
                verticalLineToRelative(15.98f)
                curveToRelative(-3.34f, -0.19f, -6f, -2.97f, -6f, -6.35f)
                close()
            }
        }.also { _CediSign = it}
