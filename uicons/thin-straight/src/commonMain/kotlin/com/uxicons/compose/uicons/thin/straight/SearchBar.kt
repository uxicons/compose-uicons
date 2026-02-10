package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchBar: ImageVector? = null

val Icons.Ts.SearchBar: ImageVector
    get() = _SearchBar ?: UXIcon(name = "SearchBar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.62f, 9.24f)
                curveToRelative(-0.29f, -0.25f, -0.69f, -0.31f, -1.05f, -0.15f)
                curveToRelative(-0.35f, 0.16f, -0.57f, 0.5f, -0.57f, 0.89f)
                verticalLineToRelative(12.05f)
                lineToRelative(3.52f, -3.2f)
                lineToRelative(2.57f, 5.07f)
                lineToRelative(2.67f, -1.36f)
                lineToRelative(-2.46f, -4.86f)
                lineToRelative(4.35f, -0.65f)
                lineToRelative(-9.03f, -7.8f)
                close()
                moveTo(20.42f, 22.11f)
                lineTo(19.53f, 22.56f)
                lineTo(16.82f, 17.21f)
                lineTo(13.99f, 19.77f)
                lineTo(13.96f, 9.99f)
                lineTo(21.35f, 16.37f)
                lineTo(17.78f, 16.9f)
                lineTo(20.42f, 22.11f)
                close()
                moveTo(5f, 14f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(12.2f)
                lineToRelative(-1f, -0.86f)
                verticalLineToRelative(-11.34f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _SearchBar = it}
