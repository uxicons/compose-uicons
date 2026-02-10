package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaravanAlt: ImageVector? = null

val Icons.Ss.CaravanAlt: ImageVector
    get() = _CaravanAlt ?: UXIcon(name = "CaravanAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 11f)
                lineTo(4f, 11f)
                lineTo(4f, 8f)
                lineTo(9f, 8f)
                close()
                moveTo(7.5f, 17f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 17f)
                close()
                moveTo(18f, 11f)
                lineTo(18f, 8f)
                lineTo(15f, 8f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 19f)
                verticalLineToRelative(2f)
                lineTo(12.97f, 21f)
                curveToRelative(0.39f, -7.93f, -11.31f, -7.93f, -10.94f, 0f)
                lineTo(0f, 21f)
                lineTo(0f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                lineTo(19f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(22f, 19f)
                close()
                moveTo(11f, 6f)
                lineTo(2f, 6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(9f)
                close()
                moveTo(20f, 6f)
                lineTo(13f, 6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                close()
            }
        }.also { _CaravanAlt = it}
