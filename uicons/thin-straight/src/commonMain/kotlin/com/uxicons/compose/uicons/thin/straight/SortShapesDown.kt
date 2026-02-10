package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortShapesDown: ImageVector? = null

val Icons.Ts.SortShapesDown: ImageVector
    get() = _SortShapesDown ?: UXIcon(name = "SortShapesDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 1f)
                lineTo(14f, 1f)
                lineTo(14f, 10f)
                horizontalLineToRelative(9f)
                lineTo(23f, 1f)
                close()
                moveTo(22f, 9f)
                horizontalLineToRelative(-7f)
                lineTo(15f, 2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                close()
                moveTo(18.52f, 13.71f)
                lineToRelative(-5.12f, 9.29f)
                horizontalLineToRelative(10.19f)
                lineToRelative(-5.07f, -9.29f)
                close()
                moveTo(18.52f, 15.79f)
                lineToRelative(3.39f, 6.21f)
                horizontalLineToRelative(-6.81f)
                lineToRelative(3.42f, -6.21f)
                close()
                moveTo(10.29f, 18.41f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.44f, 4.44f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineTo(0.01f, 19.13f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.28f, 4.28f)
                lineTo(5f, 0f)
                horizontalLineToRelative(1f)
                lineTo(6f, 22.71f)
                lineToRelative(4.29f, -4.29f)
                close()
            }
        }.also { _SortShapesDown = it}
