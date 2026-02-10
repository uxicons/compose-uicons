package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD8: ImageVector? = null

val Icons.Br.DiceD8: ImageVector
    get() = _DiceD8 ?: UXIcon(name = "DiceD8") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.72f, 8.54f)
            lineTo(15.26f, 1.48f)
            arcTo(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            horizontalLineToRelative(0f)
            arcTo(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.75f, 1.46f)
            lineTo(2.24f, 8.59f)
            arcToRelative(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.05f, 6.88f)
            lineToRelative(6.47f, 7.07f)
            arcTo(4.34f, 4.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.02f, 24f)
            horizontalLineToRelative(0.01f)
            arcToRelative(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.24f, -1.46f)
            lineToRelative(6.5f, -7.13f)
            arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.72f, 8.54f)
            close()
            moveTo(19.46f, 10.52f)
            arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, 0.49f)
            lineTo(13.5f, 12.96f)
            lineTo(13.5f, 4f)
            close()
            moveTo(10.5f, 4f)
            verticalLineToRelative(8.97f)
            lineTo(4.21f, 11f)
            arcTo(2.15f, 2.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 10.56f)
            close()
            moveTo(5.52f, 14.55f)
            lineTo(10.5f, 16.1f)
            lineTo(10.5f, 19.99f)
            close()
            moveTo(13.5f, 20.03f)
            lineTo(13.5f, 16.1f)
            lineToRelative(4.99f, -1.55f)
            close()
        }
    }.also { _DiceD8 = it }
