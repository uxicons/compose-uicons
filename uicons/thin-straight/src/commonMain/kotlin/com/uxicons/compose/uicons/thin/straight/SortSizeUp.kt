package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortSizeUp: ImageVector? = null

val Icons.Ts.SortSizeUp: ImageVector
    get() = _SortSizeUp ?: UXIcon(name = "SortSizeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 23f)
                horizontalLineToRelative(8f)
                lineTo(24f, 15f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(8f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(14f, 1f)
                lineTo(14f, 11f)
                horizontalLineToRelative(10f)
                lineTo(24f, 1f)
                lineTo(14f, 1f)
                close()
                moveTo(23f, 10f)
                lineTo(15f, 10f)
                lineTo(15f, 2f)
                horizontalLineToRelative(8f)
                lineTo(23f, 10f)
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
        }.also { _SortSizeUp = it}
