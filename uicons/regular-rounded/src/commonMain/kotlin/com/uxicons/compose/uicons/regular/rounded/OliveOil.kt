package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OliveOil: ImageVector? = null

val Icons.Rr.OliveOil: ImageVector
    get() = _OliveOil ?: UXIcon(name = "OliveOil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.21f, 12.32f)
                curveToRelative(4.21f, -2.91f, 0.26f, -9.26f, -4.21f, -6.77f)
                lineTo(15f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(8f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 2f)
                lineTo(9f, 2f)
                lineTo(9f, 8f)
                curveToRelative(0f, 0.66f, -1.21f, 1.68f, -2.28f, 2.58f)
                curveTo(4.98f, 12.04f, 3f, 13.7f, 3f, 16f)
                curveToRelative(0.09f, 3.52f, 3.17f, 8.02f, 6.73f, 8f)
                horizontalLineToRelative(4.54f)
                arcToRelative(5.06f, 5.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.76f, -1.7f)
                curveTo(20.51f, 19.8f, 22.57f, 15.28f, 19.21f, 12.32f)
                close()
                moveTo(17f, 7f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.65f, 3.9f)
                arcTo(11.63f, 11.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.1f, 8.35f)
                arcTo(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7f)
                close()
                moveTo(11f, 8f)
                lineTo(11f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(13f, 8f)
                curveToRelative(-0.04f, 1.96f, 2.45f, 3.56f, 4.03f, 5f)
                lineTo(6.97f, 13f)
                curveTo(8.55f, 11.56f, 11.04f, 9.96f, 11f, 8f)
                close()
                moveTo(16.54f, 20.97f)
                arcTo(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.27f, 22f)
                lineTo(9.73f, 22f)
                curveToRelative(-2.52f, 0.07f, -5.6f, -4.76f, -4.47f, -7f)
                lineTo(18.74f, 15f)
                curveTo(19.63f, 17.2f, 17.95f, 19.34f, 16.54f, 20.97f)
                close()
            }
        }.also { _OliveOil = it}
