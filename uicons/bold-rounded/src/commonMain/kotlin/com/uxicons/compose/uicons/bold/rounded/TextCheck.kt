package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextCheck: ImageVector? = null

val Icons.Br.TextCheck: ImageVector
    get() = _TextCheck ?: UXIcon(name = "TextCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.09f, 1.33f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.68f, 0f)
            lineTo(0.16f, 11.83f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 14f)
            horizontalLineToRelative(0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.34f, -0.83f)
            lineTo(3.43f, 12f)
            horizontalLineToRelative(6.65f)
            lineToRelative(0.58f, 1.17f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
            horizontalLineToRelative(0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.34f, -2.17f)
            close()
            moveTo(4.93f, 9f)
            lineTo(6.75f, 5.35f)
            lineTo(8.57f, 9f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 23.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -0.44f)
            lineToRelative(-5f, -5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, -2.12f)
            lineTo(13f, 19.88f)
            lineToRelative(8.44f, -8.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 2.12f)
            lineToRelative(-9.5f, 9.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 23.5f)
            close()
        }
    }.also { _TextCheck = it }
