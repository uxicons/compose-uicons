package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skyscraper: ImageVector? = null

val Icons.Bs.Skyscraper: ImageVector
    get() = _Skyscraper ?: UXIcon(name = "Skyscraper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(8f, 20f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(21f, 12.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.2f, 3f, -3.45f)
                verticalLineToRelative(-1.55f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.55f)
                curveToRelative(1.69f, 0.24f, 3f, 1.69f, 3f, 3.45f)
                close()
                moveTo(15f, 7.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6f)
                close()
                moveTo(13f, 20f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _Skyscraper = it}
