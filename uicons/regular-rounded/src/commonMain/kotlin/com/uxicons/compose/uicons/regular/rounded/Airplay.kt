package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Airplay: ImageVector? = null

val Icons.Rr.Airplay: ImageVector
    get() = _Airplay ?: UXIcon(name = "Airplay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 13.17f)
                curveToRelative(-0.62f, -0.74f, -1.53f, -1.17f, -2.5f, -1.17f)
                reflectiveCurveToRelative(-1.88f, 0.43f, -2.5f, 1.18f)
                lineToRelative(-5.55f, 6.78f)
                curveToRelative(-0.46f, 0.56f, -0.56f, 1.32f, -0.24f, 1.98f)
                reflectiveCurveToRelative(0.96f, 1.07f, 1.69f, 1.07f)
                horizontalLineToRelative(13.21f)
                curveToRelative(0.73f, 0f, 1.38f, -0.41f, 1.69f, -1.07f)
                curveToRelative(0.31f, -0.66f, 0.22f, -1.42f, -0.24f, -1.98f)
                lineToRelative(-5.55f, -6.78f)
                close()
                moveTo(5.67f, 21f)
                lineToRelative(5.37f, -6.55f)
                curveToRelative(0.48f, -0.57f, 1.45f, -0.56f, 1.92f, -0.01f)
                lineToRelative(5.37f, 6.56f)
                lineTo(5.67f, 21f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.43f, -0.62f, 2.8f, -1.69f, 3.75f)
                curveToRelative(-0.19f, 0.17f, -0.43f, 0.25f, -0.66f, 0.25f)
                curveToRelative(-0.28f, 0f, -0.55f, -0.11f, -0.75f, -0.34f)
                curveToRelative(-0.36f, -0.41f, -0.33f, -1.05f, 0.09f, -1.41f)
                curveToRelative(0.65f, -0.57f, 1.02f, -1.39f, 1.02f, -2.25f)
                lineTo(22.0f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.86f, 0.37f, 1.68f, 1.02f, 2.25f)
                curveToRelative(0.41f, 0.36f, 0.45f, 1.0f, 0.09f, 1.41f)
                curveToRelative(-0.37f, 0.41f, -1.0f, 0.46f, -1.41f, 0.09f)
                curveToRelative(-1.08f, -0.95f, -1.69f, -2.31f, -1.69f, -3.75f)
                lineTo(-0.0f, 6f)
                curveTo(0f, 3.24f, 2.24f, 1f, 5f, 1f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _Airplay = it}
