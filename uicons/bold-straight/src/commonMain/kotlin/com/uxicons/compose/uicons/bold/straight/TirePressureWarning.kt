package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TirePressureWarning: ImageVector? = null

val Icons.Bs.TirePressureWarning: ImageVector
    get() = _TirePressureWarning ?: UXIcon(name = "TirePressureWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 12f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(13.5f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 11.45f)
                arcToRelative(12.92f, 12.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.62f, -7.91f)
                arcTo(6.12f, 6.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 0f)
                lineTo(17f, 0f)
                arcToRelative(9.06f, 9.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.36f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 6.1f)
                curveToRelative(0f, 4.02f, -2.98f, 6.74f, -4f, 7.55f)
                lineTo(7f, 19.0f)
                curveToRelative(-1.02f, -0.81f, -4f, -3.53f, -4f, -7.55f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -6.1f)
                arcTo(9.06f, 9.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(4f, 0f)
                arcTo(6.12f, 6.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.61f, 3.54f)
                arcTo(12.93f, 12.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.45f)
                curveToRelative(0f, 5.18f, 3.49f, 8.57f, 5f, 9.79f)
                lineTo(5f, 24f)
                lineTo(8f, 24f)
                lineTo(8f, 22f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 22f)
                lineTo(16f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(19f, 21.25f)
                curveTo(20.51f, 20.02f, 24f, 16.63f, 24f, 11.45f)
                close()
            }
        }.also { _TirePressureWarning = it}
