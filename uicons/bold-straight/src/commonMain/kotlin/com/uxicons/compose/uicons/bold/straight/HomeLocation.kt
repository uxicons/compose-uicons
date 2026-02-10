package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeLocation: ImageVector? = null

val Icons.Bs.HomeLocation: ImageVector
    get() = _HomeLocation ?: UXIcon(name = "HomeLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.69f, 7.45f)
                lineTo(14.1f, 0.72f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.2f, 0f)
                lineTo(1.31f, 7.45f)
                arcTo(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.13f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 10.13f)
                arcTo(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.69f, 7.45f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 10.13f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, -0.32f)
                lineToRelative(8.59f, -6.72f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0f)
                lineTo(20.84f, 9.81f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, 0.32f)
                close()
                moveTo(12f, 8f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.52f, 8.55f)
                lineTo(12f, 19.99f)
                lineToRelative(3.54f, -3.46f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                close()
                moveTo(12f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
            }
        }.also { _HomeLocation = it}
