package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVneckHairLong: ImageVector? = null

val Icons.Ss.UserVneckHairLong: ImageVector
    get() = _UserVneckHairLong ?: UXIcon(name = "UserVneckHairLong") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.79f, 4.28f)
                curveToRelative(0.86f, -0.54f, 1.51f, -1.31f, 1.88f, -2.23f)
                curveToRelative(0.68f, 0.1f, 1.31f, 0.36f, 1.86f, 0.73f)
                curveToRelative(-0.53f, 1.32f, -1.46f, 2.43f, -2.68f, 3.2f)
                curveToRelative(-1.08f, 0.67f, -2.61f, 1.02f, -3.85f, 1.02f)
                curveToRelative(-0.04f, 0f, -0.41f, 0f, -0.69f, 0f)
                curveToRelative(0.36f, 2.26f, 2.33f, 4.0f, 4.69f, 4.0f)
                curveToRelative(1.75f, 0f, 3.28f, -0.95f, 4.11f, -2.37f)
                curveToRelative(0.07f, 0.3f, 0.65f, 2.83f, 0.77f, 3.43f)
                curveToRelative(1.3f, 0.16f, 2.49f, 0.68f, 3.47f, 1.46f)
                curveToRelative(-0.45f, -1.92f, -2.07f, -8.73f, -2.14f, -8.97f)
                curveToRelative(-0.85f, -2.72f, -3.35f, -4.55f, -6.2f, -4.55f)
                reflectiveCurveToRelative(-5.35f, 1.83f, -6.2f, 4.55f)
                curveToRelative(-0.02f, 0.05f, -0.06f, 0.21f, -0.12f, 0.45f)
                horizontalLineToRelative(2.09f)
                curveToRelative(1.25f, 0f, 2.21f, -0.21f, 3.02f, -0.72f)
                close()
                moveTo(8f, 12f)
                horizontalLineToRelative(0.47f)
                curveToRelative(-1.82f, -1.09f, -2.94f, -3.01f, -3.23f, -5.17f)
                curveToRelative(-0.44f, 1.85f, -1.06f, 4.48f, -1.58f, 6.69f)
                curveToRelative(1.2f, -0.95f, 2.7f, -1.52f, 4.34f, -1.52f)
                close()
                moveTo(3f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(0.45f)
                lineToRelative(3.55f, 4.02f)
                lineToRelative(3.53f, -4.02f)
                horizontalLineToRelative(0.45f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _UserVneckHairLong = it}
