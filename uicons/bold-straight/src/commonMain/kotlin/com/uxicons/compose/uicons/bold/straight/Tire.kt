package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tire: ImageVector? = null

val Icons.Bs.Tire: ImageVector
    get() = _Tire ?: UXIcon(name = "Tire") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, -9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
                moveTo(9.62f, 12.94f)
                lineTo(6.81f, 16.68f)
                arcTo(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12f)
                arcToRelative(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, -0.89f)
                close()
                moveTo(10.5f, 10.05f)
                lineTo(6.08f, 8.28f)
                arcTo(7.02f, 7.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 5.17f)
                close()
                moveTo(17.92f, 8.29f)
                lineTo(13.5f, 10.05f)
                lineTo(13.5f, 5.17f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.92f, 8.29f)
                close()
                moveTo(19f, 12f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.81f, 4.68f)
                lineToRelative(-2.81f, -3.75f)
                lineToRelative(4.56f, -1.82f)
                arcTo(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
                close()
                moveTo(12f, 14.77f)
                lineTo(14.75f, 18.44f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 0f)
                close()
            }
        }.also { _Tire = it}
