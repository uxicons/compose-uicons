package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellRay: ImageVector? = null

val Icons.Ss.DumbbellRay: ImageVector
    get() = _DumbbellRay ?: UXIcon(name = "DumbbellRay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.09f, 14f)
                lineToRelative(1.41f, -5f)
                horizontalLineToRelative(-3.08f)
                curveToRelative(-0.62f, 0f, -1.06f, -0.6f, -0.88f, -1.19f)
                lineTo(10.2f, 0f)
                horizontalLineToRelative(4.3f)
                lineToRelative(-1.96f, 5f)
                horizontalLineToRelative(3.06f)
                curveToRelative(0.72f, 0f, 1.15f, 0.8f, 0.75f, 1.41f)
                lineToRelative(-5.06f, 7.59f)
                horizontalLineToRelative(-1.2f)
                close()
                moveTo(24f, 17f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 17f)
                lineTo(6f, 17f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(20f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                close()
                moveTo(1f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(2f)
                lineTo(1f, 19f)
                verticalLineToRelative(3f)
                lineTo(3f, 22f)
                lineTo(3f, 14f)
                lineTo(1f, 14f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _DumbbellRay = it}
