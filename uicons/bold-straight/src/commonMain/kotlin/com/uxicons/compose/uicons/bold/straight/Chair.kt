package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chair: ImageVector? = null

val Icons.Bs.Chair: ImageVector
    get() = _Chair ?: UXIcon(name = "Chair") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13.04f)
                lineTo(19f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(5f, 13.04f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.7f, -3f, 3.46f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.22f, -3f, -3.46f)
                close()
                moveTo(16f, 3.5f)
                lineTo(16f, 13f)
                horizontalLineToRelative(-2.5f)
                lineTo(13.5f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
                moveTo(8.5f, 3f)
                horizontalLineToRelative(2f)
                lineTo(10.5f, 13f)
                horizontalLineToRelative(-2.5f)
                lineTo(8f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
            }
        }.also { _Chair = it}
