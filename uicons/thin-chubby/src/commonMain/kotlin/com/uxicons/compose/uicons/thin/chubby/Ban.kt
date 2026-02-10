package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ban: ImageVector? = null

val Icons.Tc.Ban: ImageVector
    get() = _Ban ?: UXIcon(name = "Ban") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.03f)
                curveTo(6.88f, 1.03f, 1f, 2.27f, 1f, 12f)
                curveToRelative(0f, 7.69f, 3.29f, 10.97f, 11f, 10.97f)
                curveToRelative(5.12f, 0f, 11f, -1.25f, 11f, -10.97f)
                curveToRelative(0f, -7.69f, -3.29f, -10.97f, -11f, -10.97f)
                close()
                moveTo(12f, 2.03f)
                curveToRelative(3.29f, 0f, 5.68f, 0.62f, 7.29f, 1.99f)
                lineTo(4.0f, 19.28f)
                curveToRelative(-1.38f, -1.61f, -2.0f, -3.99f, -2.0f, -7.28f)
                curveTo(2f, 4.92f, 4.9f, 2.03f, 12f, 2.03f)
                close()
                moveTo(12f, 21.97f)
                curveToRelative(-3.29f, 0f, -5.68f, -0.62f, -7.29f, -1.99f)
                lineTo(20.0f, 4.72f)
                curveToRelative(1.38f, 1.61f, 2.0f, 3.99f, 2.0f, 7.28f)
                curveToRelative(0f, 7.08f, -2.9f, 9.97f, -10f, 9.97f)
                close()
            }
        }.also { _Ban = it}
