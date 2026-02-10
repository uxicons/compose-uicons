package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grate: ImageVector? = null

val Icons.Sc.Grate: ImageVector
    get() = _Grate ?: UXIcon(name = "Grate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.99f, 1.2f)
                curveToRelative(0.95f, -0.1f, 1.97f, -0.17f, 3.0f, -0.2f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(11.0f, 23f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.79f)
                curveToRelative(0.95f, 0.1f, 1.97f, 0.17f, 3.0f, 0.2f)
                close()
                moveTo(18.01f, 11.0f)
                horizontalLineToRelative(4.99f)
                curveToRelative(-0.12f, -4.15f, -0.97f, -8.05f, -1.01f, -8.23f)
                curveToRelative(-0.08f, -0.38f, -0.38f, -0.68f, -0.76f, -0.76f)
                curveToRelative(-0.1f, -0.02f, -1.38f, -0.3f, -3.22f, -0.56f)
                verticalLineToRelative(9.55f)
                close()
                moveTo(16.01f, 13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(1.04f, -0.03f, 2.06f, -0.11f, 3.0f, -0.2f)
                close()
                moveTo(5.99f, 13.0f)
                horizontalLineToRelative(-4.99f)
                curveToRelative(0.12f, 4.15f, 0.97f, 8.05f, 1.01f, 8.23f)
                curveToRelative(0.08f, 0.38f, 0.38f, 0.68f, 0.76f, 0.76f)
                curveToRelative(0.1f, 0.02f, 1.38f, 0.3f, 3.22f, 0.56f)
                verticalLineToRelative(-9.55f)
                close()
                moveTo(18.01f, 13.0f)
                verticalLineToRelative(9.55f)
                curveToRelative(1.84f, -0.26f, 3.12f, -0.54f, 3.22f, -0.56f)
                curveToRelative(0.38f, -0.08f, 0.68f, -0.38f, 0.76f, -0.76f)
                curveToRelative(0.04f, -0.18f, 0.88f, -4.07f, 1.01f, -8.23f)
                horizontalLineToRelative(-4.99f)
                close()
                moveTo(5.99f, 11.0f)
                verticalLineToRelative(-9.55f)
                curveToRelative(-1.84f, 0.26f, -3.12f, 0.54f, -3.22f, 0.56f)
                curveToRelative(-0.38f, 0.08f, -0.68f, 0.38f, -0.76f, 0.76f)
                curveToRelative(-0.04f, 0.18f, -0.88f, 4.07f, -1.01f, 8.23f)
                horizontalLineToRelative(4.99f)
                close()
                moveTo(13.0f, 1f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.79f)
                curveToRelative(-0.95f, -0.1f, -1.97f, -0.17f, -3.0f, -0.2f)
                close()
            }
        }.also { _Grate = it}
