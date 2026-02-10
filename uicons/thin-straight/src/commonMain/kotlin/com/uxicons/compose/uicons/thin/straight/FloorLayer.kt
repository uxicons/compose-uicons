package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloorLayer: ImageVector? = null

val Icons.Ts.FloorLayer: ImageVector
    get() = _FloorLayer ?: UXIcon(name = "FloorLayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.5f)
                lineTo(12f, 0.75f)
                lineTo(0f, 6.5f)
                verticalLineToRelative(4.29f)
                lineToRelative(2.78f, 1.33f)
                lineToRelative(-2.78f, 1.33f)
                verticalLineToRelative(4.29f)
                lineToRelative(12.0f, 5.75f)
                lineToRelative(12.0f, -5.79f)
                verticalLineToRelative(-4.26f)
                lineToRelative(-2.81f, -1.35f)
                lineToRelative(2.81f, -1.36f)
                verticalLineToRelative(-4.26f)
                close()
                moveTo(22.34f, 6.82f)
                lineToRelative(-10.34f, 4.96f)
                lineTo(1.66f, 6.82f)
                lineTo(12f, 1.86f)
                lineToRelative(10.34f, 4.96f)
                close()
                moveTo(1f, 7.61f)
                lineToRelative(10.5f, 5.04f)
                verticalLineToRelative(2.56f)
                lineTo(1f, 10.17f)
                verticalLineToRelative(-2.56f)
                close()
                moveTo(1f, 14.78f)
                lineToRelative(10.5f, 5.04f)
                verticalLineToRelative(2.35f)
                lineTo(1f, 17.13f)
                verticalLineToRelative(-2.35f)
                close()
                moveTo(12.5f, 22.17f)
                verticalLineToRelative(-2.35f)
                lineToRelative(10.5f, -5.04f)
                verticalLineToRelative(2.31f)
                lineToRelative(-10.5f, 5.07f)
                close()
                moveTo(22.56f, 13.88f)
                lineToRelative(-10.56f, 5.06f)
                lineTo(1.44f, 13.88f)
                lineToRelative(2.49f, -1.2f)
                lineToRelative(8.06f, 3.87f)
                lineToRelative(8.04f, -3.88f)
                lineToRelative(2.52f, 1.21f)
                close()
                moveTo(12.5f, 15.21f)
                verticalLineToRelative(-2.55f)
                lineToRelative(10.5f, -5.04f)
                verticalLineToRelative(2.52f)
                lineToRelative(-10.5f, 5.07f)
                close()
            }
        }.also { _FloorLayer = it}
