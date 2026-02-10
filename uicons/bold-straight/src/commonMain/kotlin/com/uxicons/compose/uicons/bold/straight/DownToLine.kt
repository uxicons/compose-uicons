package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownToLine: ImageVector? = null

val Icons.Bs.DownToLine: ImageVector
    get() = _DownToLine ?: UXIcon(name = "DownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                lineTo(24f, 21f)
                verticalLineToRelative(3f)
                close()
                moveTo(14.35f, 18.02f)
                lineToRelative(9.69f, -10.02f)
                horizontalLineToRelative(-7.04f)
                lineTo(17f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 8f)
                lineTo(-0.01f, 8f)
                lineToRelative(9.67f, 10.01f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.62f, 0.64f, 1.45f, 0.99f, 2.33f, 0.99f)
                horizontalLineToRelative(0f)
                curveToRelative(0.88f, 0f, 1.71f, -0.34f, 2.35f, -0.98f)
                close()
                moveTo(7.05f, 11f)
                horizontalLineToRelative(2.95f)
                lineTo(10f, 3f)
                horizontalLineToRelative(4f)
                lineTo(14f, 11f)
                horizontalLineToRelative(2.96f)
                lineToRelative(-4.75f, 4.91f)
                curveToRelative(-0.07f, 0.07f, -0.15f, 0.09f, -0.21f, 0.09f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.05f, 0f, -0.13f, -0.01f, -0.2f, -0.08f)
                lineToRelative(-4.75f, -4.92f)
                close()
            }
        }.also { _DownToLine = it}
