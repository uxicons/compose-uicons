package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seal: ImageVector? = null

val Icons.Sr.Seal: ImageVector
    get() = _Seal ?: UXIcon(name = "Seal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24.04f)
                curveToRelative(-0.8f, 0f, -1.55f, -0.31f, -2.12f, -0.88f)
                lineToRelative(-2.16f, -2.16f)
                horizontalLineToRelative(-1.72f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1.72f)
                lineToRelative(-2.16f, -2.16f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0f, -4.24f)
                lineToRelative(2.16f, -2.16f)
                verticalLineToRelative(-1.72f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1.72f)
                lineToRelative(2.16f, -2.16f)
                curveToRelative(1.13f, -1.13f, 3.11f, -1.13f, 4.24f, 0f)
                lineToRelative(2.16f, 2.16f)
                horizontalLineToRelative(1.72f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1.72f)
                lineToRelative(2.16f, 2.16f)
                horizontalLineToRelative(0f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
                lineToRelative(-2.16f, 2.16f)
                verticalLineToRelative(1.72f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-1.72f)
                lineToRelative(-2.16f, 2.16f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.88f, -2.12f, 0.88f)
                close()
            }
        }.also { _Seal = it}
