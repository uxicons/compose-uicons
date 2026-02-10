package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ObjectUnion: ImageVector? = null

val Icons.Ts.ObjectUnion: ImageVector
    get() = _ObjectUnion ?: UXIcon(name = "ObjectUnion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(8f, 24f)
                verticalLineToRelative(-8f)
                lineTo(0f, 16f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(13.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(9f, 23f)
                horizontalLineToRelative(14f)
                lineTo(23f, 10.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.5f)
                lineTo(15f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 15f)
                lineTo(9f, 15f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _ObjectUnion = it}
