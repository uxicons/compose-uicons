package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Butterfly: ImageVector? = null

val Icons.Ss.Butterfly: ImageVector
    get() = _Butterfly ?: UXIcon(name = "Butterfly") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2f)
                close()
                moveTo(22.61f, 2.51f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.84f, 1.26f)
                arcTo(19.48f, 19.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 5.52f)
                verticalLineToRelative(8.78f)
                arcTo(10.94f, 10.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 15f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.99f, -6.68f)
                arcTo(12.27f, 12.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.61f, 2.51f)
                close()
                moveTo(22.27f, 15.26f)
                arcTo(8.9f, 8.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                arcToRelative(12.79f, 12.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -0.96f)
                arcTo(12.79f, 12.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 17f)
                arcToRelative(8.9f, 8.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.27f, -1.74f)
                curveToRelative(-1.92f, 3.09f, 0.52f, 7.5f, 1.34f, 8.23f)
                lineToRelative(0.4f, 0.46f)
                lineToRelative(0.59f, -0.15f)
                arcTo(15.32f, 15.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 19.65f)
                lineTo(11f, 22f)
                horizontalLineToRelative(2f)
                lineTo(13f, 19.65f)
                arcToRelative(15.32f, 15.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.94f, 4.16f)
                lineToRelative(0.59f, 0.15f)
                lineToRelative(0.4f, -0.46f)
                curveTo(21.76f, 22.75f, 24.18f, 18.32f, 22.27f, 15.26f)
                close()
                moveTo(7.21f, 15f)
                arcTo(9.81f, 9.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 14.29f)
                lineTo(11f, 5.52f)
                arcTo(19.48f, 19.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.16f, 1.26f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.39f, 2.51f)
                arcTo(12.28f, 12.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, 8.32f)
                arcTo(7.07f, 7.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.21f, 15f)
                close()
            }
        }.also { _Butterfly = it}
