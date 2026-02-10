package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanCheck: ImageVector? = null

val Icons.Rr.TrashCanCheck: ImageVector
    get() = _TrashCanCheck ?: UXIcon(name = "TrashCanCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.27f, 11.81f)
                curveToRelative(0.38f, 0.4f, 0.36f, 1.03f, -0.04f, 1.41f)
                lineToRelative(-3.05f, 2.87f)
                curveToRelative(-0.57f, 0.56f, -1.32f, 0.84f, -2.08f, 0.84f)
                reflectiveCurveToRelative(-1.52f, -0.28f, -2.1f, -0.85f)
                lineToRelative(-1.19f, -1.04f)
                curveToRelative(-0.41f, -0.36f, -0.46f, -1.0f, -0.09f, -1.41f)
                curveToRelative(0.37f, -0.41f, 1.0f, -0.46f, 1.41f, -0.09f)
                lineToRelative(1.23f, 1.08f)
                curveToRelative(0.43f, 0.41f, 1.06f, 0.41f, 1.44f, 0.03f)
                lineToRelative(3.06f, -2.88f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.36f, 1.41f, 0.04f)
                close()
                moveTo(22f, 5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(4f, 6f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.1f)
                curveToRelative(0.47f, -2.28f, 2.48f, -4f, 4.9f, -4f)
                horizontalLineToRelative(2f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                horizontalLineToRelative(3.1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(8.17f, 4f)
                horizontalLineToRelative(7.66f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                close()
                moveTo(18f, 6f)
                lineTo(6f, 6f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(18f, 6f)
                close()
            }
        }.also { _TrashCanCheck = it}
