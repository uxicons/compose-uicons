package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hiking: ImageVector? = null

val Icons.Bs.Hiking: ImageVector
    get() = _Hiking ?: UXIcon(name = "Hiking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2.5f)
                close()
                moveTo(21f, 8f)
                lineTo(21f, 24f)
                lineTo(18f, 24f)
                lineTo(18f, 13f)
                lineTo(13.55f, 13f)
                lineToRelative(-1.15f, -2.3f)
                lineToRelative(-0.97f, 5.04f)
                lineTo(14f, 17.77f)
                lineTo(14f, 24f)
                lineTo(11f, 24f)
                lineTo(11f, 19.23f)
                lineTo(8.12f, 16.94f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.93f, -1.12f)
                arcTo(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.97f, 16f)
                arcTo(3.85f, 3.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12.03f)
                curveTo(2f, 8.76f, 5.4f, 6f, 9.41f, 6f)
                horizontalLineToRelative(1.83f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.13f, 1.93f)
                lineTo(15.41f, 10f)
                lineTo(18f, 10f)
                lineTo(18f, 8f)
                close()
                moveTo(5.97f, 13f)
                arcToRelative(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.2f, -0.86f)
                lineToRelative(0.66f, -2.91f)
                curveTo(6.22f, 9.69f, 5f, 10.82f, 5f, 12.03f)
                arcTo(0.86f, 0.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.97f, 13f)
                close()
                moveTo(6.28f, 17.95f)
                lineTo(5.05f, 24f)
                lineTo(8.11f, 24f)
                lineTo(8.9f, 20.11f)
                lineTo(6.88f, 18.51f)
                arcTo(5.54f, 5.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.28f, 17.95f)
                close()
            }
        }.also { _Hiking = it}
