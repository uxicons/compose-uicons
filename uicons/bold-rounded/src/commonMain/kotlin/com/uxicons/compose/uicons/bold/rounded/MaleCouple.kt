package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaleCouple: ImageVector? = null

val Icons.Br.MaleCouple: ImageVector
    get() = _MaleCouple ?: UXIcon(name = "MaleCouple") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.99f, 8f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
            horizontalLineTo(18.42f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, 1.71f)
            lineToRelative(1.23f, 1.23f)
            lineToRelative(-2.04f, 2.04f)
            arcTo(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 11f)
            curveToRelative(-0.18f, 0f, -0.36f, 0.01f, -0.54f, 0.03f)
            curveToRelative(0.01f, -0.18f, 0.04f, -0.35f, 0.04f, -0.53f)
            arcToRelative(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.97f, -3.4f)
            lineToRelative(2.04f, -2.04f)
            lineToRelative(1.23f, 1.23f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5.58f)
            lineTo(16.99f, 1f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
            horizontalLineTo(11.42f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, 1.71f)
            lineToRelative(1.23f, 1.23f)
            lineTo(9.9f, 4.97f)
            arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.5f, 17f)
            curveToRelative(0.18f, 0f, 0.36f, -0.02f, 0.54f, -0.04f)
            curveToRelative(-0.01f, 0.18f, -0.04f, 0.35f, -0.04f, 0.54f)
            arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.03f, -3.4f)
            lineToRelative(2.04f, -2.04f)
            lineToRelative(1.23f, 1.23f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12.58f)
            close()
            moveTo(3f, 10.5f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 14f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 10.5f)
            close()
            moveTo(13.5f, 21f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 17.5f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 21f)
            close()
        }
    }.also { _MaleCouple = it }
