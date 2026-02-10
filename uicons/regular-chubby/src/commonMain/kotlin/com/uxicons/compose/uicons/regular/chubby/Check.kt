package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Check: ImageVector? = null

val Icons.Rc.Check: ImageVector
    get() = _Check ?: UXIcon(name = "Check") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.45f, 4.29f)
                curveToRelative(-0.49f, -0.25f, -1.1f, -0.05f, -1.34f, 0.44f)
                curveToRelative(-4.1f, 8.09f, -9.57f, 11.91f, -11.21f, 12.91f)
                curveToRelative(-1.31f, -0.84f, -4.94f, -3.33f, -7.09f, -6.33f)
                curveToRelative(-0.32f, -0.45f, -0.95f, -0.55f, -1.4f, -0.23f)
                curveToRelative(-0.45f, 0.32f, -0.55f, 0.95f, -0.23f, 1.4f)
                curveToRelative(2.9f, 4.03f, 7.97f, 7.06f, 8.19f, 7.19f)
                curveToRelative(0.16f, 0.09f, 0.33f, 0.14f, 0.51f, 0.14f)
                curveToRelative(0.16f, 0f, 0.31f, -0.04f, 0.46f, -0.11f)
                curveToRelative(0.3f, -0.15f, 7.39f, -3.88f, 12.55f, -14.06f)
                curveToRelative(0.25f, -0.49f, 0.05f, -1.09f, -0.44f, -1.34f)
                close()
            }
        }.also { _Check = it}
