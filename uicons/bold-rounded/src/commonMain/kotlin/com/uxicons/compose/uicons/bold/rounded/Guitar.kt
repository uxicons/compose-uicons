package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guitar: ImageVector? = null

val Icons.Br.Guitar: ImageVector
    get() = _Guitar ?: UXIcon(name = "Guitar") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 13f)
            moveToRelative(-2f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.56f, 14.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
            lineToRelative(2f, 2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.38f, 0.62f)
            arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            lineToRelative(-0.26f, 0.26f)
            arcToRelative(7.24f, 7.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.62f, 2.5f)
            lineTo(16.71f, 5.17f)
            arcToRelative(6.36f, 6.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.01f, 0.54f)
            arcToRelative(5.37f, 5.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.49f, 0.56f)
            arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.2f, 0.76f)
            arcTo(7.54f, 7.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.21f, 9.21f)
            curveToRelative(-3.15f, 3.15f, -2.89f, 8.54f, 0.57f, 12f)
            arcToRelative(9.29f, 9.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.53f, 2.78f)
            arcToRelative(7.66f, 7.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.47f, -2.2f)
            arcToRelative(7.54f, 7.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.18f, -4.81f)
            arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.76f, -1.2f)
            arcTo(5.37f, 5.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.3f, 15.3f)
            arcToRelative(6.36f, 6.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, -8.01f)
            lineTo(20.62f, 5.5f)
            arcToRelative(7.24f, 7.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -1.62f)
            lineToRelative(0.26f, -0.26f)
            arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
            moveTo(16.17f, 13.17f)
            arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 0.22f)
            arcToRelative(4.68f, 4.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.94f, 3.35f)
            arcToRelative(4.58f, 4.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.31f, 2.93f)
            curveToRelative(-1.98f, 1.98f, -5.46f, 1.72f, -7.76f, -0.57f)
            reflectiveCurveToRelative(-2.56f, -5.78f, -0.57f, -7.76f)
            arcToRelative(4.58f, 4.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.92f, -1.31f)
            arcToRelative(4.68f, 4.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, -1.94f)
            arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.22f, -0.25f)
            arcTo(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.92f, 7f)
            arcToRelative(3.81f, 3.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.59f, 0.37f)
            lineToRelative(-1.07f, 1.07f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(1.08f, -1.08f)
            arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.17f, 13.17f)
            close()
        }
    }.also { _Guitar = it }
