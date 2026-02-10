package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cricket: ImageVector? = null

val Icons.Bs.Cricket: ImageVector
    get() = _Cricket ?: UXIcon(name = "Cricket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.56f, 11.6f)
                arcTo(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 10.03f)
                arcToRelative(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.56f, -1.47f)
                lineTo(21f, 5.12f)
                lineToRelative(0.86f, 0.86f)
                lineToRelative(2.12f, -2.12f)
                lineTo(20.13f, 0.01f)
                lineTo(18.01f, 2.13f)
                lineTo(18.88f, 3f)
                lineToRelative(-3.44f, 3.44f)
                arcTo(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.97f, 7f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.4f, 6.44f)
                lineToRelative(-1.06f, -1.06f)
                lineTo(0.4f, 16.32f)
                lineToRelative(-0.11f, 0.34f)
                arcToRelative(5.86f, 5.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.22f, 5.83f)
                arcTo(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.4f, 24f)
                arcToRelative(6.32f, 6.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, -0.3f)
                lineToRelative(0.34f, -0.11f)
                lineToRelative(10.94f, -10.94f)
                close()
                moveTo(6.1f, 20.93f)
                arcToRelative(2.79f, 2.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.47f, -0.56f)
                arcTo(2.79f, 2.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.07f, 17.9f)
                lineTo(10f, 10.97f)
                verticalLineTo(14f)
                horizontalLineToRelative(3.03f)
                close()
                moveTo(24f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 21f)
                close()
            }
        }.also { _Cricket = it}
