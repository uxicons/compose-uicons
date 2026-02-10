package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaravanAlt: ImageVector? = null

val Icons.Bs.CaravanAlt: ImageVector
    get() = _CaravanAlt ?: UXIcon(name = "CaravanAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 20.5f)
                close()
                moveTo(5f, 11f)
                horizontalLineToRelative(6f)
                lineTo(11f, 7f)
                lineTo(5f, 7f)
                close()
                moveTo(13f, 7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                lineTo(17f, 7f)
                close()
                moveTo(22f, 17f)
                lineTo(22f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
                lineTo(3.5f, 0f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.5f)
                lineTo(0f, 19.89f)
                lineTo(2f, 19.89f)
                arcToRelative(5.45f, 5.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -2.67f)
                lineTo(3f, 3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                horizontalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                lineTo(19f, 17f)
                lineTo(11.74f, 17f)
                arcToRelative(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.23f, 3f)
                lineTo(24f, 20f)
                lineTo(24f, 17f)
                close()
            }
        }.also { _CaravanAlt = it}
