package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassEmpty: ImageVector? = null

val Icons.Rr.WineGlassEmpty: ImageVector
    get() = _WineGlassEmpty ?: UXIcon(name = "WineGlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 0f)
                lineTo(7f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6.71f)
                curveToRelative(0f, 4.18f, 3.08f, 7.72f, 7f, 8.23f)
                verticalLineToRelative(4.06f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.06f)
                curveToRelative(1.72f, -0.21f, 3.31f, -0.97f, 4.57f, -2.2f)
                curveToRelative(1.57f, -1.52f, 2.43f, -3.56f, 2.43f, -5.74f)
                lineTo(20f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(18f, 10f)
                curveToRelative(0f, 1.64f, -0.65f, 3.17f, -1.82f, 4.31f)
                curveToRelative(-1.17f, 1.14f, -2.73f, 1.73f, -4.36f, 1.69f)
                curveToRelative(-3.21f, -0.1f, -5.82f, -2.92f, -5.82f, -6.29f)
                lineTo(6f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _WineGlassEmpty = it}
