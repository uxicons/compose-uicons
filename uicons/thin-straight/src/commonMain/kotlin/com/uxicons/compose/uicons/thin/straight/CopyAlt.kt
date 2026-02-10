package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CopyAlt: ImageVector? = null

val Icons.Ts.CopyAlt: ImageVector
    get() = _CopyAlt ?: UXIcon(name = "CopyAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 5.29f)
                lineTo(13.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(17f)
                lineTo(19f, 5.29f)
                close()
                moveTo(14f, 1.71f)
                lineToRelative(3.29f, 3.29f)
                horizontalLineToRelative(-3.29f)
                lineTo(14f, 1.71f)
                close()
                moveTo(3f, 20f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(14f)
                lineTo(3f, 20f)
                close()
                moveTo(22f, 8f)
                verticalLineToRelative(16f)
                lineTo(5f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _CopyAlt = it}
