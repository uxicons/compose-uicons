package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListCheck: ImageVector? = null

val Icons.Br.ListCheck: ImageVector
    get() = _ListCheck ?: UXIcon(name = "ListCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 7f)
            arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.02f, 5.97f)
            lineTo(0.5f, 4.62f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2.24f)
            lineTo(4.08f, 3.79f)
            arcTo(0.58f, 0.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 4f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.35f, -0.15f)
            lineTo(8.47f, 0.41f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.07f, 2.17f)
            lineTo(6.95f, 6f)
            arcTo(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 7f)
            close()
            moveTo(24f, 3.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 2f)
            horizontalLineToRelative(-8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 3.5f)
            close()
            moveTo(6.95f, 14f)
            lineToRelative(3.59f, -3.41f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.47f, 8.41f)
            lineToRelative(-3.61f, 3.44f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0f)
            lineTo(2.56f, 10.27f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.44f, 12.39f)
            lineToRelative(1.59f, 1.58f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.95f, 14f)
            close()
            moveTo(24f, 11.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 10f)
            horizontalLineToRelative(-8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.5f)
            close()
            moveTo(6.95f, 22f)
            lineToRelative(3.59f, -3.41f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.07f, -2.17f)
            lineToRelative(-3.61f, 3.44f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 20f)
            arcToRelative(0.58f, 0.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.42f, -0.21f)
            lineTo(2.5f, 18.38f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2.24f)
            lineToRelative(1.52f, 1.35f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.95f, 22f)
            close()
            moveTo(24f, 19.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 18f)
            horizontalLineToRelative(-8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19.5f)
            close()
        }
    }.also { _ListCheck = it }
