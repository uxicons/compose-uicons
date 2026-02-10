package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchBar: ImageVector? = null

val Icons.Rs.SearchBar: ImageVector
    get() = _SearchBar ?: UXIcon(name = "SearchBar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.33f, 9.34f)
                curveToRelative(-0.42f, -0.36f, -1.01f, -0.44f, -1.5f, -0.21f)
                curveToRelative(-0.5f, 0.23f, -0.82f, 0.73f, -0.82f, 1.28f)
                verticalLineToRelative(11.55f)
                lineToRelative(3.88f, -3.52f)
                lineToRelative(2.79f, 5.49f)
                lineToRelative(1.78f, -0.9f)
                lineToRelative(-2.76f, -5.44f)
                lineToRelative(5.27f, -0.79f)
                lineToRelative(-8.63f, -7.45f)
                close()
                moveTo(15f, 11.7f)
                lineTo(19.35f, 15.46f)
                lineTo(16.75f, 15.85f)
                lineTo(15f, 17.44f)
                verticalLineToRelative(-5.73f)
                close()
                moveTo(5f, 13f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(11.19f)
                lineToRelative(-2f, -1.73f)
                verticalLineToRelative(-9.46f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _SearchBar = it}
