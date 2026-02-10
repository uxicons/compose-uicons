package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TirePressureWarning: ImageVector? = null

val Icons.Sr.TirePressureWarning: ImageVector
    get() = _TirePressureWarning ?: UXIcon(name = "TirePressureWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 12f)
                lineTo(11f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12f)
                close()
                moveTo(24f, 12.43f)
                arcToRelative(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.64f, -7.61f)
                arcTo(6.07f, 6.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                curveToRelative(-2.3f, 0.26f, -0.16f, 5.04f, 0.8f, 6.06f)
                arcTo(9.42f, 9.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.71f, 20f)
                lineTo(6.29f, 20f)
                arcTo(9.43f, 9.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.2f, 6.06f)
                curveTo(5.16f, 5.05f, 7.31f, 0.25f, 5f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 1f)
                arcTo(6.07f, 6.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 4.82f)
                arcTo(11.41f, 11.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21.54f)
                lineTo(5f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(7f, 22f)
                lineTo(9f, 22f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(11f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(15f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(19f, 21.54f)
                arcTo(11.3f, 11.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12.43f)
                close()
                moveTo(12f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                close()
            }
        }.also { _TirePressureWarning = it}
