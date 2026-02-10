package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlushedFace: ImageVector? = null

val Icons.Br.FlushedFace: ImageVector
    get() = _FlushedFace ?: UXIcon(name = "FlushedFace") {
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
            moveTo(17f, 15.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 14f)
            horizontalLineToRelative(-7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 15.5f)
            close()
        }
    }.also { _FlushedFace = it }
