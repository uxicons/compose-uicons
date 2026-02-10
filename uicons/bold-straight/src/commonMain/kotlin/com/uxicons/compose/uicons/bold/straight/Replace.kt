package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Replace: ImageVector? = null

val Icons.Bs.Replace: ImageVector
    get() = _Replace ?: UXIcon(name = "Replace") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(7.5f)
                lineTo(11f, 11f)
                lineTo(11f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(8f, 8f)
                lineTo(3f, 8f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(7.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(20.5f, 13f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.56f)
                lineToRelative(-4.17f, -4.27f)
                curveToRelative(-0.44f, -0.44f, -0.44f, -1.15f, 0f, -1.59f)
                lineTo(18f, 0.44f)
                verticalLineToRelative(3.56f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(10.17f, 17.64f)
                curveToRelative(0.44f, 0.44f, 0.44f, 1.15f, 0f, 1.59f)
                lineToRelative(-4.17f, 4.27f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-3f)
                lineTo(3f, 13f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.62f)
                lineToRelative(4.17f, 4.27f)
                close()
            }
        }.also { _Replace = it}
