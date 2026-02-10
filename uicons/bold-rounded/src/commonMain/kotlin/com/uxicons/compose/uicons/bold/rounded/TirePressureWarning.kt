package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TirePressureWarning: ImageVector? = null

val Icons.Br.TirePressureWarning: ImageVector
    get() = _TirePressureWarning ?: UXIcon(name = "TirePressureWarning") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 10.5f)
            verticalLineToRelative(-8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 10.5f)
            close()
            moveTo(12f, 16f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
            close()
            moveTo(24f, 12.41f)
            arcTo(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.36f, 4.8f)
            arcTo(5.59f, 5.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            arcToRelative(8.38f, 8.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.02f, 5.17f)
            arcTo(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.09f, 19f)
            lineTo(6.91f, 19f)
            arcTo(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.98f, 6.67f)
            arcTo(8.38f, 8.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            arcTo(5.59f, 5.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 4.8f)
            arcTo(11.18f, 11.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21.33f)
            lineTo(5f, 22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(8f, 22f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(13.5f, 22f)
            lineTo(16f, 22f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(19f, 21.33f)
            arcTo(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12.41f)
            close()
        }
    }.also { _TirePressureWarning = it }
