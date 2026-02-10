package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckCouch: ImageVector? = null

val Icons.Br.TruckCouch: ImageVector
    get() = _TruckCouch ?: UXIcon(name = "TruckCouch") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 17f)
            arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.04f)
            verticalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.5f, 3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5.5f)
            verticalLineTo(16.38f)
            lineTo(4f, 20.2f)
            lineToRelative(-0.73f, -2.62f)
            lineToRelative(9.95f, -2.94f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.72f, -3.05f)
            lineToRelative(-1.1f, -4.33f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.57f, -3.09f)
            lineTo(4.26f, 5.33f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.09f, 5.52f)
            lineTo(1.69f, 12.9f)
            arcTo(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.17f, 17.63f)
            lineToRelative(0.95f, 3.42f)
            lineToRelative(-0.04f, 0.01f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, 2.88f)
            lineToRelative(15.23f, -4.48f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.5f, 17f)
            close()
            moveTo(5.09f, 8.21f)
            lineTo(9.1f, 7.06f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.14f, 0.13f)
            arcToRelative(1.47f, 1.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.7f, 0.86f)
            lineToRelative(0.98f, 3.85f)
            lineTo(5.05f, 13.93f)
            lineToRelative(-0.99f, -3.86f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.09f, 8.21f)
            close()
        }
    }.also { _TruckCouch = it }
