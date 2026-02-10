package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screw: ImageVector? = null

val Icons.Ts.Screw: ImageVector
    get() = _Screw ?: UXIcon(name = "Screw") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                lineTo(6f, 0f)
                verticalLineToRelative(2.71f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(15.27f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                lineTo(15f, 5.71f)
                lineToRelative(3f, -3f)
                lineTo(18f, 0f)
                close()
                moveTo(14f, 8.6f)
                lineToRelative(-4f, 4.15f)
                verticalLineToRelative(-1.72f)
                lineToRelative(4f, -4f)
                verticalLineToRelative(1.57f)
                close()
                moveTo(10f, 14.18f)
                lineToRelative(4f, -4.15f)
                verticalLineToRelative(1.56f)
                lineToRelative(-4f, 4.15f)
                verticalLineToRelative(-1.56f)
                close()
                moveTo(10f, 17.18f)
                lineToRelative(4f, -4.15f)
                verticalLineToRelative(1.58f)
                lineToRelative(-4f, 4.15f)
                verticalLineToRelative(-1.58f)
                close()
                moveTo(10f, 9.61f)
                verticalLineToRelative(-3.61f)
                horizontalLineToRelative(3.61f)
                lineToRelative(-3.61f, 3.61f)
                close()
                moveTo(12f, 22.56f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-0.36f)
                lineToRelative(4f, -4.15f)
                verticalLineToRelative(1.56f)
                lineToRelative(-2.31f, 2.38f)
                horizontalLineToRelative(1.39f)
                lineToRelative(0.92f, -0.95f)
                verticalLineToRelative(1.51f)
                lineToRelative(-2f, 2f)
                close()
                moveTo(17f, 2.29f)
                lineToRelative(-2.71f, 2.71f)
                horizontalLineToRelative(-4.59f)
                lineToRelative(-2.71f, -2.71f)
                verticalLineToRelative(-1.29f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.29f)
                close()
            }
        }.also { _Screw = it}
