package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Happy: ImageVector? = null

val Icons.Br.Happy: ImageVector
    get() = _Happy ?: UXIcon(name = "Happy") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 7f)
            arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9.67f)
            curveTo(11f, 11f, 9.88f, 11f, 8.5f, 11f)
            reflectiveCurveTo(6f, 11f, 6f, 9.67f)
            arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 7f)
            close()
            moveTo(13f, 9.67f)
            curveTo(13f, 11f, 14.12f, 11f, 15.5f, 11f)
            reflectiveCurveTo(18f, 11f, 18f, 9.67f)
            arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 7f)
            arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 9.67f)
            close()
            moveTo(24f, 12f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 24f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
            close()
            moveTo(21f, 12f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9f, -9f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
            close()
            moveTo(17.56f, 15.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.11f, -2.13f)
            arcTo(5.81f, 5.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
            arcToRelative(5.81f, 5.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.44f, -1.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.11f, 2.13f)
            arcTo(8.81f, 8.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
            arcTo(8.81f, 8.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.56f, 15.56f)
            close()
        }
    }.also { _Happy = it }
