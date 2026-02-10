package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortShapesUp: ImageVector? = null

val Icons.Ts.SortShapesUp: ImageVector
    get() = _SortShapesUp ?: UXIcon(name = "SortShapesUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 23f)
                horizontalLineToRelative(9f)
                lineTo(23f, 14f)
                lineTo(14f, 14f)
                verticalLineToRelative(9f)
                close()
                moveTo(15f, 15f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-7f)
                close()
                moveTo(18.52f, 0.71f)
                lineToRelative(-5.12f, 9.29f)
                horizontalLineToRelative(10.19f)
                lineTo(18.52f, 0.71f)
                close()
                moveTo(18.52f, 2.79f)
                lineToRelative(3.39f, 6.21f)
                horizontalLineToRelative(-6.81f)
                lineToRelative(3.42f, -6.21f)
                close()
                moveTo(6.56f, 0.44f)
                lineToRelative(4.44f, 4.44f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(6f, 1.29f)
                lineTo(6f, 24f)
                horizontalLineToRelative(-1f)
                lineTo(5f, 1.29f)
                lineTo(0.72f, 5.57f)
                lineTo(0.01f, 4.87f)
                lineTo(4.44f, 0.44f)
                curveToRelative(0.58f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
                close()
            }
        }.also { _SortShapesUp = it}
