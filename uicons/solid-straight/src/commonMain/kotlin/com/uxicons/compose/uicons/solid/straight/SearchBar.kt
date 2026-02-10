package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchBar: ImageVector? = null

val Icons.Ss.SearchBar: ImageVector
    get() = _SearchBar ?: UXIcon(name = "SearchBar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 16.8f)
                lineToRelative(-8.63f, -7.45f)
                curveToRelative(-0.42f, -0.36f, -1.01f, -0.44f, -1.5f, -0.21f)
                curveToRelative(-0.5f, 0.23f, -0.82f, 0.73f, -0.82f, 1.28f)
                verticalLineToRelative(11.55f)
                lineToRelative(3.88f, -3.52f)
                lineToRelative(2.79f, 5.49f)
                lineToRelative(1.78f, -0.9f)
                lineToRelative(-2.76f, -5.44f)
                lineToRelative(5.27f, -0.79f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-7.59f)
                curveToRelative(0f, -1.33f, 0.78f, -2.55f, 1.99f, -3.1f)
                curveToRelative(1.2f, -0.56f, 2.64f, -0.35f, 3.65f, 0.52f)
                lineToRelative(7.37f, 6.36f)
                verticalLineToRelative(-11.19f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(6f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _SearchBar = it}
