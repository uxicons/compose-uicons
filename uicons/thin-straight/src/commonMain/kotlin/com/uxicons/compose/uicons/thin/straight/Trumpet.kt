package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trumpet: ImageVector? = null

val Icons.Ts.Trumpet: ImageVector
    get() = _Trumpet ?: UXIcon(name = "Trumpet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 2f)
                curveToRelative(-1.71f, 6.27f, -7.05f, 8.25f, -10f, 8.78f)
                verticalLineToRelative(-1.78f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.93f)
                curveToRelative(-0.57f, 0.06f, -0.93f, 0.07f, -1.0f, 0.07f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                lineTo(0f, 11f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.67f)
                curveToRelative(-1.02f, 0.83f, -1.68f, 2.09f, -1.68f, 3.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(4f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -1.23f, -0.5f, -2.35f, -1.3f, -3.16f)
                curveToRelative(3.02f, 0.67f, 7.71f, 2.82f, 9.3f, 8.66f)
                horizontalLineToRelative(1f)
                lineTo(24f, 2f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(14f, 15.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(23f, 18.08f)
                curveToRelative(-2.1f, -4.17f, -5.93f, -5.88f, -8.7f, -6.59f)
                curveToRelative(2.77f, -0.72f, 6.61f, -2.44f, 8.7f, -6.58f)
                verticalLineToRelative(13.17f)
                close()
            }
        }.also { _Trumpet = it}
