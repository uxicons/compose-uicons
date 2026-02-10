package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Delete: ImageVector? = null

val Icons.Ts.Delete: ImageVector
    get() = _Delete ?: UXIcon(name = "Delete") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2f)
                horizontalLineToRelative(-13.29f)
                lineTo(0.05f, 12f)
                lineToRelative(8.16f, 10f)
                horizontalLineToRelative(13.29f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-12.82f)
                lineTo(1.34f, 12f)
                lineTo(8.68f, 3f)
                horizontalLineToRelative(12.82f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(17.96f, 8.75f)
                lineToRelative(-3.25f, 3.25f)
                lineToRelative(3.25f, 3.25f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.25f, -3.25f)
                lineToRelative(-3.25f, 3.25f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.25f, -3.25f)
                lineToRelative(-3.25f, -3.25f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.25f, 3.25f)
                lineToRelative(3.25f, -3.25f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _Delete = it}
