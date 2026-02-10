package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortShapesDown: ImageVector? = null

val Icons.Rs.SortShapesDown: ImageVector
    get() = _SortShapesDown ?: UXIcon(name = "SortShapesDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 17.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.5f, 4.5f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.19f, -1.41f, -0.58f)
                lineTo(0.09f, 18.91f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.5f, 3.5f)
                lineTo(5f, 0f)
                horizontalLineToRelative(2f)
                lineTo(7f, 21f)
                lineToRelative(3.5f, -3.5f)
                close()
                moveTo(23f, 10f)
                lineTo(14f, 10f)
                lineTo(14f, 1f)
                horizontalLineToRelative(9f)
                lineTo(23f, 10f)
                close()
                moveTo(21f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                lineTo(21f, 3f)
                close()
                moveTo(23.99f, 23f)
                lineTo(13f, 23f)
                lineToRelative(5.52f, -10.02f)
                lineToRelative(5.47f, 10.02f)
                close()
                moveTo(16.38f, 21f)
                horizontalLineToRelative(4.24f)
                lineToRelative(-2.11f, -3.86f)
                lineToRelative(-2.13f, 3.86f)
                close()
            }
        }.also { _SortShapesDown = it}
