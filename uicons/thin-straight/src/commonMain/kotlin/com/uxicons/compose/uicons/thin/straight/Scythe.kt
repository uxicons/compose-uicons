package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scythe: ImageVector? = null

val Icons.Ts.Scythe: ImageVector
    get() = _Scythe ?: UXIcon(name = "Scythe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.61f, 0f)
                curveTo(4.58f, 0f, 0.83f, 7.42f, 0.68f, 7.74f)
                lineTo(0.06f, 9f)
                lineToRelative(1.28f, -0.59f)
                curveToRelative(2.02f, -0.94f, 4.3f, -1.41f, 6.77f, -1.41f)
                horizontalLineToRelative(12.71f)
                lineToRelative(-1.81f, 6f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6.69f)
                lineToRelative(-2.93f, 9.7f)
                lineToRelative(0.96f, 0.29f)
                lineTo(23.97f, 0f)
                horizontalLineToRelative(-9.37f)
                close()
                moveTo(8.11f, 6f)
                curveToRelative(-2.05f, 0f, -3.98f, 0.31f, -5.75f, 0.92f)
                curveTo(3.84f, 4.86f, 7.56f, 1f, 14.61f, 1f)
                horizontalLineToRelative(8.02f)
                lineToRelative(-1.51f, 5f)
                horizontalLineToRelative(-13.01f)
                close()
            }
        }.also { _Scythe = it}
