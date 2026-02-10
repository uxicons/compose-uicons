package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Train: ImageVector? = null

val Icons.Ss.Train: ImageVector
    get() = _Train ?: UXIcon(name = "Train") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.83f, 18.55f)
                lineTo(21f, 18.3f)
                lineTo(21f, 8.86f)
                curveTo(18.97f, 12.66f, 15.62f, 16f, 12f, 16f)
                reflectiveCurveTo(5.03f, 12.66f, 3f, 8.86f)
                lineTo(3f, 18.3f)
                lineToRelative(0.17f, 0.25f)
                arcTo(6.19f, 6.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.65f, 19.97f)
                lineTo(3f, 24f)
                lineTo(5.16f, 24f)
                lineToRelative(1.25f, -3.05f)
                arcTo(13.94f, 13.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcToRelative(13.94f, 13.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.59f, -1.05f)
                lineTo(18.84f, 24f)
                lineTo(21f, 24f)
                lineToRelative(-1.65f, -4.03f)
                arcTo(6.19f, 6.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.83f, 18.55f)
                close()
                moveTo(12f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
                moveTo(12f, 14f)
                curveToRelative(3.78f, 0f, 8.08f, -5.95f, 8.86f, -10.59f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.75f, -1.88f)
                arcTo(20.15f, 20.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                arcTo(20.15f, 20.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.88f, 1.52f)
                arcTo(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.14f, 3.41f)
                curveTo(3.92f, 8.05f, 8.22f, 14f, 12f, 14f)
                close()
                moveTo(9f, 3f)
                horizontalLineToRelative(6f)
                lineTo(15f, 5f)
                lineTo(9f, 5f)
                close()
            }
        }.also { _Train = it}
