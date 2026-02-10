package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TireFlat: ImageVector? = null

val Icons.Bs.TireFlat: ImageVector
    get() = _TireFlat ?: UXIcon(name = "TireFlat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.56f, 19.23f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -19.12f, 0.01f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 24f)
                horizontalLineToRelative(17f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -4.77f)
                close()
                moveTo(18.89f, 17.77f)
                arcToRelative(2.69f, 2.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.83f, 2.47f)
                arcToRelative(2.17f, 2.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.36f, 0.76f)
                lineTo(5.58f, 21f)
                arcToRelative(2.19f, 2.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.36f, -0.76f)
                arcToRelative(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.87f, -2.52f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.82f, 0.05f)
                close()
                moveTo(12f, 14.77f)
                lineTo(14.75f, 18.44f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 0f)
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
                moveTo(14.38f, 12.93f)
                lineTo(18.94f, 11.11f)
                arcTo(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.81f, 4.68f)
                close()
            }
        }.also { _TireFlat = it}
