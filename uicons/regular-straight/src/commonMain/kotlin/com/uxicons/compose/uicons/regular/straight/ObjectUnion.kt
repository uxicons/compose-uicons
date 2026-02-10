package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ObjectUnion: ImageVector? = null

val Icons.Rs.ObjectUnion: ImageVector
    get() = _ObjectUnion ?: UXIcon(name = "ObjectUnion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(8f, 24f)
                verticalLineToRelative(-8f)
                lineTo(0f, 16f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(13f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(13f)
                close()
                moveTo(10f, 22f)
                horizontalLineToRelative(12f)
                lineTo(22f, 11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7f)
                lineTo(14f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 14f)
                lineTo(10f, 14f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _ObjectUnion = it}
