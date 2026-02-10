package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Map: ImageVector? = null

val Icons.Rs.Map: ImageVector
    get() = _Map ?: UXIcon(name = "Map") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.87f, 1.61f)
                lineTo(17.52f, 0.15f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.72f, 0.12f)
                lineTo(8.54f, 2.09f)
                lineTo(4.16f, 0.23f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 21.75f)
                lineToRelative(7.98f, 2.28f)
                lineToRelative(8.02f, -2f)
                lineToRelative(8f, 1.95f)
                lineTo(24.0f, 4.48f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.87f, 1.61f)
                close()
                moveTo(15f, 2.38f)
                lineTo(15f, 20.22f)
                lineToRelative(-6f, 1.5f)
                lineTo(9f, 3.97f)
                close()
                moveTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.39f, 2.08f)
                lineTo(7f, 3.58f)
                lineTo(7f, 21.67f)
                lineTo(2f, 20.25f)
                close()
                moveTo(22f, 21.43f)
                lineTo(17f, 20.21f)
                lineTo(17f, 2.09f)
                lineToRelative(4.28f, 1.43f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4.48f)
                close()
            }
        }.also { _Map = it}
