package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _B: ImageVector? = null

val Icons.Tr.B: ImageVector
    get() = _B ?: UXIcon(name = "B") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 24f)
                lineTo(6.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(2f, 4.5f)
                curveTo(2f, 2.02f, 4.02f, 0f, 6.5f, 0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(5.94f, -0.05f, 8.21f, 7.94f, 3.25f, 11.04f)
                curveToRelative(8.02f, 1.12f, 7.4f, 12.75f, -0.75f, 12.96f)
                close()
                moveTo(3f, 12f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(15.5f, 23f)
                curveToRelative(7.27f, -0.23f, 7.26f, -10.77f, 0f, -11f)
                lineTo(3f, 12f)
                close()
                moveTo(3f, 11f)
                lineTo(13f, 11f)
                curveToRelative(6.61f, -0.21f, 6.61f, -9.79f, 0f, -10f)
                lineTo(6.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                close()
            }
        }.also { _B = it}
