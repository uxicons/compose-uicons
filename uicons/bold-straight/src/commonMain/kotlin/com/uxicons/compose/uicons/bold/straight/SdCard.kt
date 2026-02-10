package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SdCard: ImageVector? = null

val Icons.Bs.SdCard: ImageVector
    get() = _SdCard ?: UXIcon(name = "SdCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 0f)
                horizontalLineToRelative(-8.76f)
                curveToRelative(-1.19f, 0f, -2.35f, 0.48f, -3.18f, 1.32f)
                lineToRelative(-3.24f, 3.24f)
                curveToRelative(-0.85f, 0.85f, -1.32f, 1.98f, -1.32f, 3.18f)
                verticalLineToRelative(16.26f)
                horizontalLineToRelative(20f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(19f, 21f)
                lineTo(5f, 21f)
                lineTo(5f, 7.74f)
                curveToRelative(0f, -0.4f, 0.16f, -0.78f, 0.44f, -1.06f)
                lineToRelative(3.24f, -3.24f)
                curveToRelative(0.28f, -0.28f, 0.67f, -0.44f, 1.06f, -0.44f)
                horizontalLineToRelative(8.76f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(14f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                close()
                moveTo(10f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _SdCard = it}
