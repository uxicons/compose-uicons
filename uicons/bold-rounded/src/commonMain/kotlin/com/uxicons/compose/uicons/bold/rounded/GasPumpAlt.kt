package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPumpAlt: ImageVector? = null

val Icons.Br.GasPumpAlt: ImageVector
    get() = _GasPumpAlt ?: UXIcon(name = "GasPumpAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 7.43f)
            arcToRelative(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.9f, -4.46f)
            lineTo(19.56f, 0.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
            lineTo(19f, 4.12f)
            verticalLineTo(6.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2.45f)
            verticalLineTo(18.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 0f)
            verticalLineToRelative(-1f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 14f)
            horizontalLineTo(16f)
            verticalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 0f)
            horizontalLineToRelative(-5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 18.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(0.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
            verticalLineToRelative(1f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
            reflectiveCurveTo(24f, 7.46f, 24f, 7.43f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 5.5f)
            verticalLineTo(9f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
            close()
            moveTo(13f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 21f)
            horizontalLineToRelative(-5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            verticalLineTo(12f)
            horizontalLineTo(13f)
            close()
        }
    }.also { _GasPumpAlt = it }
