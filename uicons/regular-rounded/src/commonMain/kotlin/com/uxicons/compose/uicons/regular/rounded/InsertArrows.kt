package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertArrows: ImageVector? = null

val Icons.Rr.InsertArrows: ImageVector
    get() = _InsertArrows ?: UXIcon(name = "InsertArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.26f, 1.67f)
                curveTo(-0.11f, 1.26f, -0.08f, 0.62f, 0.33f, 0.26f)
                curveTo(0.74f, -0.11f, 1.37f, -0.08f, 1.74f, 0.33f)
                lineToRelative(4.47f, 4.99f)
                curveToRelative(1.15f, 1.29f, 1.78f, 2.94f, 1.78f, 4.67f)
                verticalLineToRelative(6.05f)
                lineToRelative(1.31f, -1.25f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
                lineToRelative(-2.3f, 2.21f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.57f, -1.39f, 0.57f)
                curveToRelative(-0.51f, 0f, -1.02f, -0.19f, -1.41f, -0.58f)
                lineToRelative(-2.29f, -2.2f)
                curveToRelative(-0.4f, -0.38f, -0.41f, -1.02f, -0.03f, -1.41f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.41f, 1.41f, -0.03f)
                lineToRelative(1.31f, 1.26f)
                verticalLineToRelative(-6.05f)
                curveToRelative(0f, -1.23f, -0.45f, -2.41f, -1.27f, -3.33f)
                lineTo(0.26f, 1.67f)
                close()
                moveTo(23f, 12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(15.6f, 18.42f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                curveToRelative(0.51f, 0f, 1.01f, -0.19f, 1.39f, -0.57f)
                lineToRelative(2.3f, -2.21f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.03f, -1.41f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.41f, -1.41f, -0.03f)
                lineToRelative(-1.31f, 1.25f)
                verticalLineToRelative(-6.05f)
                curveToRelative(0f, -1.23f, 0.45f, -2.41f, 1.27f, -3.33f)
                lineToRelative(4.47f, -4.99f)
                curveToRelative(0.37f, -0.41f, 0.34f, -1.04f, -0.08f, -1.41f)
                curveToRelative(-0.41f, -0.37f, -1.04f, -0.34f, -1.41f, 0.08f)
                lineToRelative(-4.47f, 4.99f)
                curveToRelative(-1.15f, 1.28f, -1.78f, 2.94f, -1.78f, 4.66f)
                verticalLineToRelative(6.05f)
                lineToRelative(-1.31f, -1.26f)
                curveToRelative(-0.4f, -0.38f, -1.03f, -0.37f, -1.41f, 0.03f)
                curveToRelative(-0.38f, 0.4f, -0.37f, 1.03f, 0.03f, 1.41f)
                lineToRelative(2.29f, 2.2f)
                close()
            }
        }.also { _InsertArrows = it}
