package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceRelieved: ImageVector? = null

val Icons.Ss.FaceRelieved: ImageVector
    get() = _FaceRelieved ?: UXIcon(name = "FaceRelieved") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(8.11f, 4.78f)
                lineToRelative(0.78f, 1.84f)
                curveToRelative(-1.28f, 0.55f, -2.36f, 1.44f, -3.05f, 2.52f)
                lineToRelative(-1.69f, -1.07f)
                curveToRelative(0.91f, -1.44f, 2.28f, -2.58f, 3.95f, -3.29f)
                close()
                moveTo(6.28f, 10.3f)
                curveToRelative(0.4f, 0.4f, 0.97f, 0.65f, 1.52f, 0.69f)
                curveToRelative(0.65f, 0.04f, 1.23f, -0.2f, 1.74f, -0.71f)
                lineToRelative(1.42f, 1.41f)
                curveToRelative(-0.84f, 0.85f, -1.9f, 1.3f, -3.02f, 1.3f)
                curveToRelative(-0.09f, 0f, -0.18f, -0.0f, -0.27f, -0.01f)
                curveToRelative(-1.04f, -0.07f, -2.06f, -0.53f, -2.8f, -1.26f)
                lineToRelative(1.41f, -1.42f)
                close()
                moveTo(12f, 19.0f)
                curveToRelative(-3.11f, 0f, -5.56f, -2.16f, -5.67f, -2.25f)
                lineToRelative(1.33f, -1.49f)
                curveToRelative(0.02f, 0.02f, 2.0f, 1.75f, 4.34f, 1.75f)
                reflectiveCurveToRelative(4.32f, -1.73f, 4.34f, -1.75f)
                lineToRelative(1.33f, 1.49f)
                curveToRelative(-0.1f, 0.09f, -2.56f, 2.25f, -5.67f, 2.25f)
                close()
                moveTo(16.14f, 12.97f)
                curveToRelative(-1.04f, 0f, -2.12f, -0.39f, -3.02f, -1.3f)
                lineToRelative(1.42f, -1.41f)
                curveToRelative(1.19f, 1.2f, 2.6f, 0.67f, 3.26f, 0.02f)
                lineToRelative(1.41f, 1.42f)
                curveToRelative(-0.79f, 0.78f, -1.91f, 1.26f, -3.07f, 1.26f)
                close()
                moveTo(18.09f, 9.05f)
                curveToRelative(-0.69f, -1.05f, -1.73f, -1.89f, -2.99f, -2.43f)
                lineToRelative(0.78f, -1.84f)
                curveToRelative(1.62f, 0.69f, 2.96f, 1.78f, 3.87f, 3.16f)
                lineToRelative(-1.67f, 1.1f)
                close()
            }
        }.also { _FaceRelieved = it}
