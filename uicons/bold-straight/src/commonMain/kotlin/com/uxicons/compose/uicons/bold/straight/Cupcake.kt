package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cupcake: ImageVector? = null

val Icons.Bs.Cupcake: ImageVector
    get() = _Cupcake ?: UXIcon(name = "Cupcake") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.59f)
                curveToRelative(0f, -5.25f, -4.59f, -9.73f, -10.34f, -10.47f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.31f, 0f)
                curveTo(4.64f, 3.86f, 0.09f, 8.35f, 0.09f, 13.59f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.56f, 2.9f)
                lineToRelative(0.82f, 4.62f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.92f, 24f)
                lineTo(18.08f, 24f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.44f, -2.89f)
                lineToRelative(0.81f, -4.55f)
                arcTo(3.47f, 3.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 13.59f)
                close()
                moveTo(12f, 6f)
                curveToRelative(4.79f, 0f, 9f, 3.55f, 9f, 7.56f)
                curveToRelative(-0.02f, 0.44f, -0.19f, 0.44f, -0.41f, 0.44f)
                lineTo(18f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(13f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(8f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(3.5f, 14f)
                curveToRelative(-0.22f, 0f, -0.39f, 0f, -0.41f, -0.41f)
                curveTo(3.09f, 9.55f, 7.25f, 6f, 12f, 6f)
                close()
                moveTo(18.08f, 21f)
                lineTo(5.92f, 21f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.49f, -0.41f)
                lineToRelative(-0.57f, -3.22f)
                arcTo(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 17.1f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.64f, 0.27f)
                lineToRelative(-0.57f, 3.22f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.08f, 21f)
                close()
            }
        }.also { _Cupcake = it}
