package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gem: ImageVector? = null

val Icons.Ss.Gem: ImageVector
    get() = _Gem ?: UXIcon(name = "Gem") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.57f, 6f)
                lineToRelative(1.96f, 5f)
                lineTo(8.48f, 11f)
                lineToRelative(2f, -5f)
                close()
                moveTo(17.68f, 11f)
                horizontalLineToRelative(6.25f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.48f, -0.98f)
                lineTo(21.41f, 7.23f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.99f, 6f)
                lineTo(15.72f, 6f)
                close()
                moveTo(15.61f, 13f)
                lineTo(8.39f, 13f)
                lineTo(12f, 23.88f)
                close()
                moveTo(17.72f, 13f)
                lineTo(14.98f, 21.25f)
                lineTo(23.15f, 13.92f)
                arcTo(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.78f, 13f)
                close()
                moveTo(6.28f, 13f)
                lineTo(0.23f, 13f)
                arcToRelative(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.66f, 0.96f)
                lineToRelative(8.13f, 7.3f)
                close()
                moveTo(6.32f, 11f)
                lineTo(8.32f, 6f)
                lineTo(5.01f, 6f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.42f, 1.23f)
                lineTo(0.55f, 10.02f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.07f, 11f)
                close()
                moveTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19.84f, 1.65f)
                lineTo(18.16f, 0.58f)
                lineToRelative(-2f, 3.14f)
                lineToRelative(1.69f, 1.07f)
                close()
                moveTo(7.84f, 3.72f)
                lineTo(5.84f, 0.58f)
                lineTo(4.16f, 1.65f)
                lineToRelative(2f, 3.14f)
                close()
            }
        }.also { _Gem = it}
