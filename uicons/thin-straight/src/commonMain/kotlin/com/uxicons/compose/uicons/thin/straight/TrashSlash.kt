package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashSlash: ImageVector? = null

val Icons.Ts.TrashSlash: ImageVector
    get() = _TrashSlash ?: UXIcon(name = "TrashSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.9f, 19.19f)
                lineToRelative(1.55f, -14.19f)
                horizontalLineToRelative(1.55f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.29f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineToRelative(23.2f, 23.2f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-4.06f, -4.06f)
                close()
                moveTo(8f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(20.44f, 5f)
                lineToRelative(-1.45f, 13.28f)
                lineTo(5.71f, 5f)
                horizontalLineToRelative(14.74f)
                close()
                moveTo(18.51f, 22.04f)
                lineToRelative(0.75f, 0.75f)
                curveToRelative(-0.44f, 0.72f, -1.23f, 1.21f, -2.13f, 1.21f)
                lineTo(6.83f, 24f)
                curveToRelative(-1.28f, 0f, -2.35f, -0.96f, -2.49f, -2.23f)
                lineToRelative(-1.67f, -15.55f)
                lineToRelative(1.13f, 1.13f)
                lineToRelative(1.54f, 14.31f)
                curveToRelative(0.08f, 0.77f, 0.72f, 1.34f, 1.49f, 1.34f)
                horizontalLineToRelative(10.29f)
                curveToRelative(0.63f, 0f, 1.16f, -0.4f, 1.38f, -0.96f)
                close()
            }
        }.also { _TrashSlash = it}
