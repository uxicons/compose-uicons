package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Check: ImageVector? = null

val Icons.Tc.Check: ImageVector
    get() = _Check ?: UXIcon(name = "Check") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.73f, 4.38f)
                curveToRelative(-0.25f, -0.12f, -0.55f, -0.03f, -0.67f, 0.22f)
                curveToRelative(-4.65f, 9.2f, -10.96f, 13.24f, -12.26f, 14.0f)
                curveToRelative(-1.07f, -0.67f, -5.38f, -3.5f, -7.88f, -6.99f)
                curveToRelative(-0.16f, -0.22f, -0.47f, -0.28f, -0.7f, -0.12f)
                curveToRelative(-0.23f, 0.16f, -0.28f, 0.47f, -0.12f, 0.7f)
                curveToRelative(2.98f, 4.16f, 8.21f, 7.29f, 8.43f, 7.42f)
                curveToRelative(0.08f, 0.05f, 0.17f, 0.07f, 0.26f, 0.07f)
                curveToRelative(0.08f, 0f, 0.16f, -0.02f, 0.23f, -0.06f)
                curveToRelative(0.31f, -0.16f, 7.6f, -4.01f, 12.94f, -14.58f)
                curveToRelative(0.12f, -0.25f, 0.03f, -0.55f, -0.22f, -0.67f)
                close()
            }
        }.also { _Check = it}
